import './App.css'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'

import HomeScreen from './screens/HomeScreen'
import MenuScreen from './screens/MenuScreen'
import ContactusScreen from './screens/ContactUsScreen'
import AboutUsScreen from './screens/AboutUsScreen'
import SignInScreen from './screens/SignInScreen.js.js'
import SignupScreen from './screens/SignUpScreen'
import Profile from './screens/userscreens/Profile'
import OrderTracking from './screens/userscreens/OrderTracking'
import EmployeeList from './screens/managerscreens/EmployeeList'
import OrderList from './screens/userscreens/OrderList'
import ErrorScreen from './screens/_404Screen'
import LogoutScreen from './screens/LogoutScreen'
import AddNewEmployee from './screens/managerscreens/AddNewEmployeeScreen'
import OrderPage from './screens/userscreens/Order'
import MyCartList from './screens/userscreens/MyCartList'
import managerOrderList from './screens/managerscreens/ManagerOrderList'



function App() {
  return (
    <div>
      <Router>
        {/* <Navigation /> */}
        <div>
          <Switch>
            <Route path="/home" component={HomeScreen} />
            <Route path="/menu" component={MenuScreen} />
            <Route path="/contactus" component={ContactusScreen} />
            <Route path="/aboutus" component={AboutUsScreen} />
            <Route path="/signup" component={SignupScreen} />
            <Route path="/signin" component={SignInScreen} />
            <Route path="/employeesignin" component={SignInScreen} />
            <Route path="/logout" component={LogoutScreen} />
            
            <Route path="/mycart" component={MyCartList} />
            <Route path="/order" component={OrderPage} />
            <Route path="/profile" component={Profile} />
            <Route path="/trackorder" component={OrderTracking} />

            <Route path="/addnewemployee" component={AddNewEmployee} />
            <Route path="/employeelist" component={EmployeeList} />
            <Route path="/orderlist" component={OrderList} />
            <Route path="/managerorderlist" component={managerOrderList} />
            
            <Route component={HomeScreen} />
          </Switch>
        </div>
      </Router>
    </div>
  )
}

export default App
