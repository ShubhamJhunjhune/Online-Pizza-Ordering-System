import { useEffect, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchEmployees, managerFetchOrders } from '../../actions/employeeActions';
import { dbAssignment } from '../../actions/orderAction';
import Header from '../../components/Header';
const ManagerOrderList = (props) => {
  const dispatch = useDispatch()
  const orderList =  useSelector(store => store.fetchOrderManager)
  const employeelist =  useSelector(store => store.fetchEmployee)
  const {error,response,loading} = orderList
  const [deliveryBoyId, setdeliveryBoyId] = useState('')
  const [orderID, setOrderId] = useState('')
  useEffect( () => {
    dispatch(managerFetchOrders())
  },[])
  useEffect( () => {
    dispatch(fetchEmployees())
  },[])
  useEffect( () => {}, [error,response,loading])
  console.log(orderList)

  const OutForDelivery = () => {
    console.log("Delievery Bouy",deliveryBoyId)
    console.log("Order ID",orderID)
    dispatch(dbAssignment(deliveryBoyId,orderID))
 }
return (
<div class="signinup" >
<Header/>
<br></br>
<br></br>
<br></br>
  <div class="container">
    <div class="table-wrapper">
    <div class="table-title">
      <div class="row">
        <div class="col-sm-5">
          <h2><b>Orders Received</b></h2>
        </div>
        <div class="col-sm-7">
          {/* <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons ">&#xE872;</i> <span>Add New Employee</span></a> */}
          {/* <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">rate_review</i> <span>Feedback</span></a> */}
        </div>
      </div>
    </div>
    <table class="table table-striped table-hover">
      <thead>
        <tr>
        {/* orderId(pin):1
        custId(pin):9
        addrId(pin):1
        total(pin):2
        orderStatus(pin):"PENDING" */}
          <th>OrderID</th>
          <th>Name</th>
          <th>Mobile</th>
          <th>Status</th>
          <th>Delivery Boy</th>
          <th>Actions</th>
        </tr>
      </thead>
    <tbody>
      {
        orderList.response &&
        orderList.response.result &&
        orderList.response.result.length > 0 &&
        orderList.response.result.map ((order) => {
              return (
                <tr>
                  {/* firstName, lastName, email, phone, role */}
                  {/* <td><span class="custom-checkbox"><input type="checkbox" id="checkbox1" name="options[]" value="1"/><label for="checkbox1"></label> </span></td>                   */}
                  <td>{order.orderId}</td>
                  <td>{order.custName}</td>
                  <td>{order.custMobile}</td>
                  <td>{order.orderStatus}</td>
                    <td>{<select onChange = {(e) =>{
                        setdeliveryBoyId(e.target.value)
                        setOrderId(order.orderId)
                        }}class="form-select" aria-label="Default select example">
                        {
                          employeelist.response &&
                          employeelist.response.result &&
                          employeelist.response.result.length > 0 &&
                          employeelist.response.result.map((emp) => {
                          
                            return (
                                <option value = {emp.empId} >{emp.empName}</option>
                            )})
                        }
                        </select>}
                    </td>
                  <td>
                      <button onClick = { OutForDelivery } type="submit" class="btn btn-success">Assign!</button>
                    </td>
                </tr>
              )
            })}  
    </tbody>
    </table>
  </div>
  </div>
  </div>
)}
  
    export default ManagerOrderList