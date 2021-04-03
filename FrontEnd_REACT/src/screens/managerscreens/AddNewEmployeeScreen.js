import { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { addnewemployee } from "../../actions/employeeActions"
import Header from "../../components/Header"

const AddNewEmployee = (props) => {

  const [name,setName] = useState('')
  const [phone,setPhone] = useState('')
  const [email,setEmail] = useState('')
  const [password,setPassword] = useState('')

  const Employee = useSelector((store) => store.addNewEmployee)
  const {loading, response, error}=Employee
  const dispatch = useDispatch()
useEffect( () => {
  console.log("use effect Called")
  console.log("loading",loading)
  console.log("response",response)
  console.log("error",error)

  if(response && (response.status == 'success'))
     props.history.push('/employeelist')
     else if(error){
        console.log(error)
        alert('Error while making API call')
     }
},[loading, response, error])

const onSubmit = () =>{
  
  console.log(name)
  console.log(phone)
  console.log(email)
  console.log(password)
  // empEmail, empPass, empName, empMobile, role, empIdProof,managerId,empStatus,empImg,dob
  dispatch(addnewemployee(email,password, name, phone, 'DELIVERYBOY', 'idproof','1','NOT_WORKING','image','2021-03-21'))
  props.history.push('/employeelist')
}

return(
<div class="p-3 mb-2 bg-dark text-white">

<Header/>
<div class="newEmployee12">  
  {/* <form id="addemp" action={onSubmit}> */}
  <div id="addemp">
      <div className = "NewEmployees">
    <h3>Add New Employee</h3>
    <h4>Enter Below Details</h4></div>
    <fieldset>
      <input onChange = {(e) => {
        setName(e.target.value)
      }} placeholder="FullName" name = "name" type="text" tabindex="1" required autofocus/>
    </fieldset>
    <fieldset>
      <input onChange = {(e) => {
        setPhone(e.target.value)
      }} placeholder="Phone" name = "phone" type="text" tabindex="1" required autofocus/>
    </fieldset>
    <fieldset>
      <input onChange = {(e) => {
        setEmail(e.target.value)
      }} placeholder="Email" email = "email" type="email" tabindex="2" required/>
    </fieldset>
    <fieldset>
      <input onChange = {(e) => {
        setPassword(e.target.value)
      }} placeholder="Password" phone = "password" type="tel" tabindex="3" required/>
    </fieldset>
    {/* <fieldset>
      <input placeholder="Address" name = "name" type="url" tabindex="4" required/>
    </fieldset> */}
    <fieldset>
    <input placeholder="Role" type="url" tabindex="4" value= "DeliveryBoy" readOnly />
    </fieldset>
    <fieldset>
      <button name="submit" onClick = {onSubmit} type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
    </fieldset>
    </div>
  {/* </form> */}
</div>
</div>
)}

export default AddNewEmployee