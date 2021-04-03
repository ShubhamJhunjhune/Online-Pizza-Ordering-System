import Header from '../../components/Header';
import { Link } from 'react-router-dom'
import { useDispatch, useSelector } from 'react-redux';
import { useEffect } from 'react';
import {  fetchEmployees } from '../../actions/employeeActions'
const EmployeeList = (props) => {
  const dispatch = useDispatch()
  const employeelist =  useSelector(store => store.fetchEmployee)
  const {error,response,loading} = employeelist
  useEffect( () => {
    dispatch(fetchEmployees())
  },[])
  useEffect( () => {}, [error,response,loading])
  
  console.log(employeelist)
  const OnDelete = (emp) => {
    console.log(emp)
    console.log("asdasdasdasdoasdp  p",emp.id)
    //  dispatch(deleteEmployee(emp.id))
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
        <div class="col-sm-6">
          <h2><b>Available Employees</b></h2>
        </div>
        <div class="col-sm-6">
          <Link to="/addnewemployee" class="btn btn-success" data-toggle="modal"><i class="material-icons ">person_add_alt_1</i><span>Add</span> </Link>
          {/* <Link to="/addnewemployee" class="btn btn-danger" data-toggle="modal"><i class="material-icons ">person_remove</i><span>Delete</span> </Link> */}
          
          {/* <a href="#" class="btn btn-success" data-toggle="modal"><i class="material-icons ">&#xE872;</i> <span>Add New Employee</span></a>
          <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a> */}
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
          <th>Name</th>
          <th>Mobile</th>
          <th>Email</th>
          <th>Status</th>
          
{/* dob: null */}
{/* empEmail: "shyam"
empId: 9
empIdProof: "idproof"
empImg: "image"
empMobile: "9175"
empName: "Kulkarn"
empPass: "dfsdf"
empStatus: "NOT_WORKING"
managerId: 1
role: "DELIVERYBOY" */}
        </tr>
      </thead>
      <tbody>
      {
      employeelist.response &&
            employeelist.response.result &&
            employeelist.response.result.length > 0 &&
            employeelist.response.result.map((emp) => {
              console.log("Before Employee List")
              console.log(emp)
              return (
                <tr>
                  {/* firstName, lastName, email, phone, role */}
                  {/* <td><span class="custom-checkbox"><input type="checkbox" id="checkbox1" name="options[]" value="1"/><label for="checkbox1"></label> </span></td>                   */}
                  <td>{emp.empId}</td>
                  <td>{emp.empName}</td>
                  <td>{emp.empMobile}</td>
                  <td>{emp.empEmail}</td>
                  <td>{emp.empStatus}</td>
                  
                  {/* <td> */}
            {/* <Link to="/addnewemployee" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i><span></span> </Link>         */}
            {/* <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a> */}
            {/* <Link to="/addnewemployee" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i><span></span> </Link> */}
            {/* <a onClick = { () => {
              OnDelete(emp)
            }} class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
            </td> */}
                </tr>
              )
            })}  
      {/* <tr>
          <td>
            <span class="custom-checkbox">
                <input type="checkbox" id="checkbox1" name="options[]" value="1"/>
                <label for="checkbox1"></label>
            </span>
          </td>
          <td>Thomas Hardy</td>
          <td>thomashardy@mail.com</td>
          <td>89 Chiaroscuro Rd, Portland, USA</td>
          <td>(171) 555-2222</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr> */}
        {/* <tr>
          <td>
            <span class="custom-checkbox">
                <input type="checkbox" id="checkbox1" name="options[]" value="1"/>
                <label for="checkbox1"></label>
            </span>
          </td>
          <td>Thomas Hardy</td>
          <td>thomashardy@mail.com</td>
          <td>89 Chiaroscuro Rd, Portland, USA</td>
          <td>(171) 555-2222</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr>
        <tr>
          <td>
            <span class="custom-checkbox">
								<input type="checkbox" id="checkbox2" name="options[]" value="1"/>
								<label for="checkbox2"></label>
							</span>
          </td>
          <td>Dominique Perrier</td>
          <td>dominiqueperrier@mail.com</td>
          <td>Obere Str. 57, Berlin, Germany</td>
          <td>(313) 555-5735</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr>
        <tr>
          <td>
            <span class="custom-checkbox">
								<input type="checkbox" id="checkbox3" name="options[]" value="1"/>
								<label for="checkbox3"></label>
							</span>
          </td>
          <td>Maria Anders</td>
          <td>mariaanders@mail.com</td>
          <td>25, rue Lauriston, Paris, France</td>
          <td>(503) 555-9931</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr>
        <tr>
          <td>
            <span class="custom-checkbox">
								<input type="checkbox" id="checkbox4" name="options[]" value="1"/>
								<label for="checkbox4"></label>
							</span>
          </td>
          <td>Fran Wilson</td>
          <td>franwilson@mail.com</td>
          <td>C/ Araquil, 67, Madrid, Spain</td>
          <td>(204) 619-5731</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr>
        <tr>
          <td>
            <span class="custom-checkbox">
								<input type="checkbox" id="checkbox5" name="options[]" value="1"/>
								<label for="checkbox5"></label>
							</span>
          </td>
          <td>Martin Blank</td>
          <td>martinblank@mail.com</td>
          <td>Via Monte Bianco 34, Turin, Italy</td>
          <td>(480) 631-2097</td>
          <td>
            <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
          </td>
        </tr>*/
      }
      </tbody> 
    
    </table>
    {/* <div class="clearfix">
      <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
      <ul class="pagination">
        <li class="page-item disabled"><a href="#">Previous</a></li>
        <li class="page-item"><a href="#" class="page-link">1</a></li>
        <li class="page-item"><a href="#" class="page-link">2</a></li>
        <li class="page-item active"><a href="#" class="page-link">3</a></li>
        <li class="page-item"><a href="#" class="page-link">4</a></li>
        <li class="page-item"><a href="#" class="page-link">5</a></li>
        <li class="page-item"><a href="#" class="page-link">Next</a></li>
      </ul>
    </div> */}
  </div>
</div>
{/* <div id="addEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form>
        <div class="modal-header">
          <h4 class="modal-title">Add Employee</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" required/>
          </div>
          <div class="form-group">
            <label>Email</label>
            <input type="email" class="form-control" required/>
          </div>
          <div class="form-group">
            <label>Address</label>
            <textarea class="form-control" required></textarea>
          </div>
          <div class="form-group">
            <label>Phone</label>
            <input type="text" class="form-control" required/>
          </div>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel"/>
          <input type="submit" class="btn btn-success" value="Add"/>
        </div>
      </form>
    </div>
  </div>
</div> */}
{/* <div id="editEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form>
        <div class="modal-header">
          <h4 class="modal-title">Edit Employee</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" required/>
          </div>
          <div class="form-group">
            <label>Email</label>
            <input type="email" class="form-control" required/>
          </div>
          <div class="form-group">
            <label>Address</label>
            <textarea class="form-control" required></textarea>
          </div>
          <div class="form-group">
            <label>Phone</label>
            <input type="text" class="form-control" required/>
          </div>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel"/>
          <input type="submit" class="btn btn-info" value="Save"/>
        </div>
      </form>
    </div>
  </div>
</div> */}
{/* <div id="deleteEmployeeModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <form>
        <div class="modal-header">
          <h4 class="modal-title">Delete Employee</h4>
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        </div>
        <div class="modal-body">
          <p>Are you sure you want to delete these Records?</p>
          <p class="text-warning"><small>This action cannot be undone.</small></p>
        </div>
        <div class="modal-footer">
          <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel"/>
          <input type="submit" class="btn btn-danger" value="Delete"/>
        </div>
      </form>
    </div>
  </div>
</div> */}
</div>

)}
  
    export default EmployeeList