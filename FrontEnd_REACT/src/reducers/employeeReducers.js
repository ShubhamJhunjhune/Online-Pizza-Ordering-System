import { ADD_NEW_EMPLOYEE_REQUEST, ADD_NEW_EMPLOYEE_FAIL, ADD_NEW_EMPLOYEE_SUCCESS, FETCH_EMPLOYEE_FAIL, FETCH_EMPLOYEE_REQUEST, FETCH_EMPLOYEE_SUCCESS, DELETE_EMPLOYEE_REQUEST, DELETE_EMPLOYEE_SUCCESS, DELETE_EMPLOYEE_FAIL, MANAGER_ORDERS_REQUEST, MANAGER_ORDERS_SUCCESS, MANAGER_ORDERS_FAIL } from "../constants/employeeConstants"

export const addNewEmployeeReducer = (state = {}, action) => {
  switch (action.type) {
    case ADD_NEW_EMPLOYEE_REQUEST:
      return { loading: true }
    case ADD_NEW_EMPLOYEE_SUCCESS:
      return { loading: false, response: action.payload }
    case ADD_NEW_EMPLOYEE_FAIL:
      return { loading: false, error: action.payload }
    default:
      return state
  }
}

export const fetchEmployeeReducer = (state = {}, action) => {
  switch (action.type) {
    case FETCH_EMPLOYEE_REQUEST:
      return { loading: true }
    case FETCH_EMPLOYEE_SUCCESS:
      return { loading: false, response: action.payload }
    case FETCH_EMPLOYEE_FAIL:
      return { loading: false, error: action.payload }
    default:
      return state
  }
}

export const deleteEmployeeReducer = (state = {}, action) => {
  switch (action.type) {
    case DELETE_EMPLOYEE_REQUEST:
      return { loading: true }
    case DELETE_EMPLOYEE_SUCCESS:
      return { loading: false, response: action.payload }
    case DELETE_EMPLOYEE_FAIL:
      return { loading: false, error: action.payload }
    default:
      return state
  }
}


export const managerFetchOrdersReducer = (state = {}, action) => {
  switch (action.type) {
    case MANAGER_ORDERS_REQUEST:
      return { loading: true }
    case MANAGER_ORDERS_SUCCESS:
      return { loading: false, response: action.payload }
    case MANAGER_ORDERS_FAIL:
      return { loading: false, error: action.payload }
    default:
      return state
  }
}