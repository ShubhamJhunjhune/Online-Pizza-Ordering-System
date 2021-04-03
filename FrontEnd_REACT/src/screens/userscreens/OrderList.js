import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchOrders } from '../../actions/orderAction';
import Header from '../../components/Header';
const OrderList = (props) => {
const dispatch = useDispatch()

const myOrderHistory = useSelector((store) => store.fetchOrder)
const user = useSelector((store) => store.userSignin)
const {loading, response, error}=user
useEffect( () => {
  dispatch(fetchOrders(9))
},[])


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
          <h2><b>Previous Purchase</b></h2>
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
          {/* <th>
            <span class="custom-checkbox">
                <input type="checkbox" id="selectAll"/>
                <label for="selectAll"></label>
            </span>
          </th> */}
          <th>ID</th>
          <th>FirstName</th>
          <th>LastName</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Role</th>
          <th>Actions</th>
        </tr>
      </thead>
    <tbody>
      {
      myOrderHistory.response &&
      myOrderHistory.response.result &&
      myOrderHistory.response.result.length > 0 &&
      myOrderHistory.response.result.map((order) => {
              return (
                <tr>
                  {/* firstName, lastName, email, phone, role */}
                  <td><span class="custom-checkbox"><input type="checkbox" id="checkbox1" name="options[]" value="1"/><label for="checkbox1"></label> </span></td>                  
                  <td>{order.id}</td>
                  <td>{order.firstName}</td>
                  <td>{order.lastName}</td>
                  <td>{order.email}</td>
                  <td>{order.phone}</td>
                  <td>{order.role}</td>
                  <td>
                    {/* <Link to="/addnewemployee" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i><span></span> </Link>         */}
                    {/* <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a> */}
                    {/* <Link to="/addnewemployee" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i><span></span> </Link> */}
                    {/* <a class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a> */}
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
  
    export default OrderList