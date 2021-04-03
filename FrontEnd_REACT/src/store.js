import { createStore, combineReducers, applyMiddleware } from 'redux'
import logger from 'redux-logger'
import thunk from 'redux-thunk'
import { composeWithDevTools } from 'redux-devtools-extension'
import {userSigninReducer, userSignupReducer} from './reducers/userReducers'
import { addNewEmployeeReducer, deleteEmployeeReducer, fetchEmployeeReducer, managerFetchOrdersReducer } from './reducers/employeeReducers'
import {addCartReducer,fetchCartReducer, removeCartReducer} from './reducers/cartReducer'
import { addProductReducer, fetchProductReducer } from './reducers/productReducer'
import { addOrderReducer, assignDeliveryBoyReducer, fetchOrderReducer } from './reducers/orderReducer'


// combined reducers
const reducers = combineReducers({
  userSignup: userSignupReducer,
  userSignin: userSigninReducer,
  addNewEmployee : addNewEmployeeReducer,
  fetchEmployee : fetchEmployeeReducer,
  deleteEmployee : deleteEmployeeReducer,
  addToCart : addCartReducer,
  myCart : fetchCartReducer,
  removeFromCart : removeCartReducer,
  addProduct : addProductReducer,
  fetchProduct : fetchProductReducer,
  addOrder : addOrderReducer,
  fetchOrder :fetchOrderReducer,
  fetchOrderManager : managerFetchOrdersReducer,
  dbAssign :assignDeliveryBoyReducer,
})

const store = createStore(
  reducers,
  composeWithDevTools(applyMiddleware(logger, thunk))
)

export default store
