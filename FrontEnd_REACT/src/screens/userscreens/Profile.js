
import { useSelector } from "react-redux"
import Header from "../../components/Header"

const Profile = (props) => {
    const user = useSelector((store) => store.userSignin)
    const {loading, response, error}=user
    console.log(user)
    // custId(pin):9
    // custEmail(pin):"nehamail"
    // custPass(pin):"nehapass"
    // custName(pin):"nehaname"
    // custMobile(pin):"neha12"
    // custStatus(pin):"ACTIVE"
    // custImg(pin):"image"
    // role(pin):"CUSTOMER"

    // empId(pin):3
    // empEmail(pin):"f@"
    // empPass(pin):"fpass"
    // empName(pin):"fyam"
    // empMobile(pin):"123232"
    // role(pin):"MANAGER"
    // empIdProof(pin):"pasddk"
    // managerId(pin):1
    // empStatus(pin):"NOT_WORKING"
    // empImg(pin):"zxf"
    // dob(pin):null

    if(response){
        if(response.result.role == "MANAGER")
            {
                console.log("inside manager")
                var firstName = response.result.empName
                var email = response.result.empEmail
                var phone = response.result.empMobile
                var role = response.result.role
        }else
        {
            console.log("inside Customer")
                var firstName = response.result.custName
                var email = response.result.custEmail
                var phone = response.result.custMobile
                var role = response.result.role
        }
    }
        
    return ( 
<div id="contact"   > 
<Header/>
<br></br>
<br></br>
<br></br>
<profile className="profile" >
  <div class="page-content page-container container" id="page-content">
    <div class="padding">
        <div class="row container d-flex justify-content-center">
            <div class="col-xl-6 col-md-12">
                <div class="card user-card-full">
                    <div class="row m-l-0 m-r-0">
                        <div class="col-sm-4 bg-c-lite-green user-profile">
                            <div class="card-block text-center text-white">
                                <div class="m-b-25"> <img src="https://img.icons8.com/bubbles/100/000000/user.png" class="img-radius" alt="User-Profile-Image"/> </div>
                                <h6 class="f-w-600">{firstName}</h6>
                                <p>{role}</p> <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="card-block">
                                <h6 class="m-b-20 p-b-5 b-b-default f-w-600">Information</h6>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">Email</p>
                                        <h6 class="text-muted f-w-400">{email}</h6>
                                    </div>
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">Phone</p>
                                        <h6 class="text-muted f-w-400">{phone}</h6>
                                    </div>
                                </div>
                                <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">Other</h6>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">Address</p>
                                        <h6 class="text-muted f-w-400">Addresss</h6>
                                    </div>
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">DOB</p>
                                        <h6 class="text-muted f-w-400">Just born</h6>
                                    </div>
                                </div>
                                <ul class="social-link list-unstyled m-t-40 m-b-10">
                                    <li><a href="#!" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="facebook" data-abc="true"><i class="mdi mdi-facebook feather icon-facebook facebook" aria-hidden="true"></i></a></li>
                                    <li><a href="#!" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="twitter" data-abc="true"><i class="mdi mdi-twitter feather icon-twitter twitter" aria-hidden="true"></i></a></li>
                                    <li><a href="#!" data-toggle="tooltip" data-placement="bottom" title="" data-original-title="instagram" data-abc="true"><i class="mdi mdi-instagram feather icon-instagram instagram" aria-hidden="true"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</profile>
</div>
    )
}

export default Profile
