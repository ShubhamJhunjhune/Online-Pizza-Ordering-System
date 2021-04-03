import { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { Link } from 'react-router-dom'
import { fetchCart } from '../actions/cartAction'
import { logout } from '../actions/userActions'

const Header = (props) => {
  const dispatch = useDispatch()
  const user = useSelector((store) => store.userSignin)
  const { error, response, loading } = user
  const myCart = useSelector((store) => store.myCart)
  const addCart = useSelector((store) => store.addToCart)
  const { error12, response12, loading12 } = myCart
  const { error123, response123, loading123 } = addCart
  console.log("Before useeffect")
  useEffect(() => {
    console.log("After asdj")
  }); 
  console.log(response)
  useEffect(() =>{
    console.log("Inside used Efect pljk")
  },[])
  useEffect(() => {
    console.log("Inside used Efect asdas")
    if(user && (user.response) && user.response.result &&user.response.result.role=='CUSTOMER'){
      dispatch(fetchCart(user.response.result.custId))}
  },[error, response, loading,error12, response12, loading12,error123, response123, loading123])
  
  useEffect(() => {
    console.log("Inside used Efect")
  }, [error, response, loading,error12, response12, loading12,error123, response123, loading123])

var customer = false
 var normal = true
 var manager = false
 var admin = false
 var deliveryBoy = false
 console.log("before Page")
//  console.log(response.result.role)
 if(response && response.result &&(response.result.role == 'MANAGER'))
 {
  console.log("MANAGER Page")
   customer = false
   normal = false
   manager = true
   admin = false
   deliveryBoy = false
 }
  if(response &&response.result && (response.result.role == 'CUSTOMER')){
    console.log("CUSTOMER Page")
    customer = true
    normal = false
    manager = false
    admin = false
    deliveryBoy = false
  }
  
    if(response && response.result && (response.result.role == 'ADMIN')){
      console.log("ADMIN")
      customer = false
      normal = false
      manager = false
      admin = true
      deliveryBoy = false
    }
   
    if(response && response.result && (response.result.role == 'DELEVERY_BOY'))
    {
      console.log("DELIVERY_BOY Page")
      customer = false
      normal = false
      manager = false
      admin = false
      deliveryBoy = true
    }
    
   if(normal)
   console.log("NORMAL Page")
    
   return (
    <div>     
<nav class="navbar navbar-expand-lg navbar-light fixed-top">
  <div class="container">
    {/* <a class="navbar-brand" href ="/home">Slice</a> */}
    <Link class="navbar-brand" to="/home" >Pizza </Link>
    <Link class="navbar-bro" to="/home" > hub</Link>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ml-auto">
        {/* <li class="nav-item active">
        <Link to="/home" class="navbar-brand"><span className="nav-link">Slice</span></Link>
        </li> */}
        <li class="nav-item active">
        <Link to="/home" class="nav-link"><span className="nav-link">Home</span></Link>
        </li>
        {
          admin &&
          <li class="nav-item" >
          <Link to="/profile" class="nav-link"><span className="nav-link">My Profile</span></Link>
          </li> 
        }
        {
          admin &&
          <li class="nav-item" >
          <Link to="/employeelist" class="nav-link"><span className="nav-link">Employees</span></Link>
          </li> 
        }
        {
          deliveryBoy &&
          <li class="nav-item" >
          <Link to="/profile" class="nav-link"><span className="nav-link">My Profile</span></Link>
          </li> 
        }
        {
          deliveryBoy &&
          <li class="nav-item" >
          <Link to="/orderlist" class="nav-link"><span className="nav-link">Orders</span></Link>
          </li> 
        }
        {
          customer &&
          <li class="nav-item" >
          <Link to="/menu" class="nav-link"><span className="nav-link">Menu</span></Link>
          </li> 
        }
        {
          customer &&
          <li class="nav-item" >
          <Link to="/profile" class="nav-link"><span className="nav-link">My Profile</span></Link>
          </li> 
        }
        { customer && (
           <li class="nav-item" >
           <Link to="/contactus" class="nav-link"><span className="nav-link">Contact Us</span></Link>
           </li> 
           )
        }
        { customer && (
           <li class="nav-item" >
           <Link to="/orderlist" class="nav-link"><span className="nav-link">My Orders</span></Link>
           </li> 
           )
        }
        { customer && myCart.response && myCart.response.result.length >= 0 &&(
        <li className="d-flex">
        <Link to="/mycart" class="nav-link"><span className="nav-link">Cart[{
        myCart.response.result.length
        }]</span></Link>
        </li>)
      }
{/* {myCart.response.length} */}

        {
          normal &&
          <li class="nav-item" >
          <Link to="/menu" class="nav-link"><span className="nav-link">Menu</span></Link>
          </li> 
        }

        { normal && (
           <li class="nav-item" >
           <Link to="/contactus" class="nav-link"><span className="nav-link">Contact Us</span></Link>
           </li> 
           )
        }
        { normal && (
           <li class="nav-item" >
           <Link to="/signin" class="nav-link"><span className="nav-link">Sign In</span></Link>
           </li> 
           )
        }
        { normal  && (
           <li class="nav-item" >
           <Link to="/signup" class="nav-link"><span className="nav-link">Sign Up</span></Link>
           </li> 
           )
        }
        {
          manager &&
          <li class="nav-item" >
          <Link to="/menu" class="nav-link"><span className="nav-link">Menu</span></Link>
          </li> 
        }
        {
          manager &&
          <li class="nav-item" >
          <Link to="/profile" class="nav-link"><span className="nav-link">My Profile</span></Link>
          </li> 
        }
        { manager && (
           <li class="nav-item" >
           <Link to="/employeelist" class="nav-link"><span className="nav-link">Employees</span></Link>
           </li> 
           )
        }
        { manager && (
           <li class="nav-item" >
           <Link to="/managerorderlist" class="nav-link"><span className="nav-link">Orders</span></Link>
           </li> 
           )
        }


        { (admin || manager || deliveryBoy || customer) && (
           <li class="nav-item" >
           <Link to="/logout" class="nav-link"><span className="nav-link">Log Out</span></Link>
           {/* <button onClick = {Onlogout} className="d-flex" >Log Out</button>  */}
           </li> 
           )
        }

        {/* <li class="nav-item" >
        <Link to="/signin" class="nav-link"><span className="nav-link">Sign In</span></Link>
        </li>
        <div  className="collaspe navbar-collaspe justfy-content-end">
        <li class="nav-item" >
        <Link to="/signup" class="nav-link" ><span className="nav-link">Sign Up</span></Link>
        </li>
        </div> */}
      </ul>
    </div>
  </div>
</nav>
    </div>
  )
}

Header.defaultProps = {
  title: '',
}

export default Header
