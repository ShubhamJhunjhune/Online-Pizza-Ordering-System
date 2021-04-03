import { useEffect, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchCart, removeFromCart } from '../../actions/cartAction';
import Swal from "sweetalert2";
import Header from '../../components/Header';
import { addOrder } from '../../actions/orderAction';

const MyCartList = (props) => {
  const dispatch = useDispatch()
  const [topping, setTopping] = useState('')
  const [crust, setCrust] = useState('')
  const [size, setSize] = useState('')
  const [quantity, setQuantity] = useState('')

  const user = useSelector((store) => store.userSignin)
  const myCart = useSelector((store) => store.myCart)
  // const addOrder = useSelector((store) => store.addOrder)
  const { error, response, loading } = myCart
  // var userID = 0;
  var total = 0;
  //   console.log("I am here dude")
  //   if(user && (user.response))
  //     if(myCart.response && myCart.response.result)
  //       if(myCart.response.result && myCart.response.result.length > 0){
  //       userID = myCart.response.result.custId
  //       console.log('sdiooidgggggggggggggggggoedcfkld',myCart.response.result)}
  // useEffect(() => {
  //   // dispatch(fetchCart(userID))
  // },[])
  // useEffect(() => {}, [error, response, loading])

  const removeCart = (product) => {
    dispatch(removeFromCart(product.cartId))
  }


  const Checkingout = () => {
    if(myCart.response.result && myCart.response.result.length > 0){
  Swal.fire({
    title: 'Are you sure?',
    text: "You won't be able to revert this!",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Yes, Place it!'
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire(
        'Success!',
        'Your order has been placed.',
        'success'
      )
      dispatch(addOrder(user.response.result.custId))
      props.history.push('/home')
    }
    
  })}}
  
  
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
          <h2><b>Your Orders</b></h2>
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
          {/* <th>Sr. No.</th> */}
          <th>Product</th>
          
          <th>Size</th>
          <th>Crust</th>
          <th>Topping</th>
          <th>Quantity</th>
          <th>Price</th>
          <th>Actions</th>
          
        </tr>
      </thead>
    <tbody>
      {
      response &&
      response.result.map
            ((product) => {
              total += product.subMenuBasePrice + topping * 15 + crust * 15 + size * 10 + quantity * product.subMenuBasePrice
              return (
                <tr>
                
                  {/* firstName, lastName, email, phone, role */}
                  {/* <td><span class="custom-checkbox"><input type="checkbox" id="checkbox1" name="options[]" value="1"/><label for="checkbox1"></label> </span></td>                   */}
                  {/* <td>{product.cartId}</td> */}
                  <td>{product.subMenuName}</td> 
                  
                  <td>{<select onChange = {(e) =>{
                  setSize(e.target.value)
                  }} class="form-select" aria-label="Default select example">
                    <option disabled selected>Size</option>
                    <option  value="1">Small</option>
                    <option selected value="2">Medium</option>
                    <option value="3">Large</option>
                    </select>}
                  </td>
                  <td>{<select onChange = {(e) =>{
                  setCrust(e.target.value)
                  }}class="form-select" aria-label="Default select example">
                    <option disabled selected>Crust</option>
                    <option value="1">Thick</option>
                    <option selected value="2">Thin</option>
                    <option value="3">Stuffed</option>
                    </select>}
                  </td>
                  <td>{<select onChange = {(e) =>{
                  setTopping(e.target.value)
                  }} class="form-select" aria-label="Default select example">
                    <option disabled selected>Topping</option>
                    <option selected value="1">Pepperoni</option>
                    <option value="2">Mushrooms</option>
                    <option value="3">Sausage </option>
                    </select>}
                  </td>
                  <td>
                  <input onChange = {(e) =>{
                  setQuantity(e.target.value)
                  }}class="form-select" aria-label="Default select example" type="number" defaultValue = "1"  min="1" max="5"/>
                  </td>
                  <td>{product.subMenuBasePrice}</td>
                  {/* <td>{product.subMenuBasePrice}</td> */}
                  <td>
                    {/* <Link to="/addnewemployee" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i><span></span> </Link>         */}
                    {/* <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a> */}
                    {/* <Link to="/addnewemployee" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i><span></span> </Link> */}
                    <a onClick={() => {
                  removeCart(product)
                }} class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                  </td>
                </tr>
              )
            })} 
    <tr>
    <td colSpan = "5" >Total</td> 
    <td>{total}</td>
    <td>
    {/* <button onClick = {Checkingout} type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button> */}
    <button onClick = {Checkingout} type="submit" class="btn btn-success">CheckOut!</button>
    </td>
    </tr> 
    </tbody>
    </table>
  </div>
  </div>
  </div>
)}
  
export default MyCartList