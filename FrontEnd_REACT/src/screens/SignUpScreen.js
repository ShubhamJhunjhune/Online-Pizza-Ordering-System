
import { Link } from 'react-router-dom'
import { useState } from "react"
import { signup } from "../actions/userActions"
import { useDispatch, useSelector } from 'react-redux'
import { useEffect } from 'react'
import Header from '../components/Header'

const SignupScreen = (props) => {
   // custEmail, custPass, custName,custMobile,custStatus,custIm
const [custEmail,setcustEmail] = useState('')
const [custPass,setcustPass] = useState('')
const [custName,setcustName] = useState('')
const [custMobile,setcustMobile] = useState('')
const dispatch = useDispatch()

const userSignup = useSelector((store) => store.userSignup)
const {loading, response, error}=userSignup

useEffect( () => {
   console.log("use effect Called")
   console.log("loading",loading)
   console.log("response",response)
   console.log("error",error)

   if(response && (response.status == 'OK'))
      props.history.push('/signin')
      else if(error){
         console.log(error)
         alert('Error while making API call')
      }
      
},[loading, response, error])

const OnSignup = () =>{
   console.log("custEmail",custEmail)
   console.log("custPass",custPass)
   console.log("custName",custName)
   console.log("custMobile",custMobile)
   // custName, custEmail, custPass, custMobile, custStatus, custImg, role
   dispatch(signup(custName, custEmail, custPass,custMobile,"ACTIVE","image","CUSTOMER"))
}

// private int custId;
// private String custEmail;
// private String custPass;
// private String custName;
// private String custMobile;
// @JsonIgnore
// private List<CustomerAddress> custAddr = new ArrayList<>();
// private CustomerStatus custStatus;
// private String custImg;
// private String role;

return (
<div class = "signinup">
   <Header/> 
   <br></br>  
   <br></br>  
   <br></br> 
<div className="container">
    <div className="row">
        <div className="col-md-5 mx-auto">
          <div id="second">
              <div className="myform form ">
                    <div className="logo mb-3">
                       <div className="col-md-12 text-center">
                          <h1 >Signup</h1>
                       </div>
                    </div>
            
                       <div className="form-group">
                          <label for="exampleInputEmail1">Full Name</label>
                          <input onChange = {(e) => {
                            setcustName(e.target.value)
                          }} type="text" name="fullname" className="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter Full Name"/>
                       </div>
                       <div className="form-group">
                          <label for="exampleInputEmail1">Email</label>
                          <input onChange = {(e) => {
                              setcustEmail(e.target.value)
                          }}  type="email"  name="email" className="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter Email"/>
                       </div>
                       <div className="form-group">
                          <label for="exampleInputEmail1">Password</label>
                          <input onChange = {(e) => {
                              setcustPass(e.target.value)
                          }}  type="password" name="password"  className="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter Password"/>
                       </div>
                       <div className="form-group">
                          <label for="exampleInputEmail1">Mobile</label>
                          <input onChange = {(e) => {
                             setcustMobile(e.target.value)
                          }}  type="text" name="mobile" id="mobile"  className="form-control" aria-describedby="emailHelp" placeholder="Enter Mobile"/>
                       </div>
                       <br></br>
                       <div className="col-md-12 text-center mb-3">
                          <button onClick = {OnSignup} type="submit" className=" btn btn-block mybtn btn-primary tx-tfm">Register</button>
                       </div>
                       
                       <div className="col-md-12 ">
                          <div className="form-group">
                             Already have an account?<span className="text-center"> <Link to="/signin">SignIn here</Link></span>
                          </div>
                       </div>
                       {
                        userSignup.loading && <div>Loading</div>
                       }
                    
                 </div>
        </div>
    </div>
    </div>
    </div>
</div>
    )
}

export default SignupScreen
