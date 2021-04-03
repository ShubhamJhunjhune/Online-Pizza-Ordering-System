
import { useState,useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { Link } from 'react-router-dom'
import { userSignin } from '../actions/userActions'
import Header from '../components/Header'


const SignInScreen = (props) => {
   const[email, setEmail] = useState('')
   const[password, setPassword] = useState('')
   const dispatch = useDispatch()

   const user = useSelector((store) => store.userSignin)
   const {loading, response, error}=user
   console.log("I am herer plasdasdasda")
   console.log(user)

   useEffect( () => {
      console.log("use effect Called")
      console.log("loading",loading)
      console.log("response",response)
      console.log("error",error)
   
      if(response)
      {
         console.log(response)
         sessionStorage.setItem('user', response)
         props.history.push('/home')
      }
      else if(error){
         console.log(error)
         alert('Error while making API call')
      }
         
   },[loading, response, error])



   const Onsignin = ()=>{
      console.log(email)
      console.log(password)
      dispatch(userSignin(email, password))
   }

return (


<div class="signinup">
   <Header/> 
   <br></br>  
   <br></br>  
   <br></br>  
<div class="container" >
    <div class="row">
        <div class="col-md-5 mx-auto">
        <div id="first">
            <div class="myform form ">
                 <div class="logo mb-3">
                     <div class="login text-center">
                        <h1>Login</h1>
                     </div>
                </div>
               
                       <div class="form-group">
                          <label for="exampleInputEmail1">Email address</label>
                          <input onChange = {(e) =>{
                             setEmail(e.target.value)
                          }} type="email" name="email"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email"/>
                       </div>
                       <div class="form-group">
                          <label for="exampleInputEmail1">Password</label>
                          <input onChange = {(e) =>{
                             setPassword(e.target.value)
                          }} type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Enter Password"/>
                       </div>


                       {/* <div class="form-group">
                          <p class="text-center">By signing up you accept our <a href="#">Terms Of Use</a></p>
                       </div> */}
                       <div class="col-md-12 text-center ">
                          <button onClick = {Onsignin} type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
                       </div>
                       <div class="col-md-12 ">
                          <div class="login-or">
                             <hr class="hr-or"/>
                             <span class="span-or"></span>
                          </div>
                          
                       </div>
                       {/* <div class="col-md-12 mb-3">
                          <p class="text-center">
                             <a href="javascript:void();" class="google btn mybtn"><i class="fa fa-google-plus">
                             </i> Signup using Google
                             </a>
                          </p>
                       </div> */}
                       {/* <div class="form-group">
                          <p class="text-center">Don't have account? <a href="#" id="signup">Sign up here</a></p>
                       </div> */}
                       <div class="form-group">
                       Don't have account?<span class="text-center"> <Link to="/signup">Sign Up here</Link></span>
                          </div>
         
                          {
                        userSignin.loading && <div>Loading</div>
                       }
            </div>
        </div>
    </div>
</div>
</div>
</div>
    )
}

export default SignInScreen
