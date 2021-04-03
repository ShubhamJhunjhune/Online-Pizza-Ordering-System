import { ADD_NEW_EMPLOYEE_FAIL, ADD_NEW_EMPLOYEE_REQUEST, ADD_NEW_EMPLOYEE_SUCCESS, FETCH_EMPLOYEE_REQUEST, FETCH_EMPLOYEE_SUCCESS, MANAGER_ORDERS_FAIL, MANAGER_ORDERS_REQUEST, MANAGER_ORDERS_SUCCESS } from "../constants/employeeConstants"
import axios from 'axios'

export const addnewemployee = (empEmail, empPass, empName, empMobile, role, empIdProof,managerId,empStatus,empImg,dob) => {
    return (dispatch) => {
      dispatch({
        type: ADD_NEW_EMPLOYEE_REQUEST,
      })
      const header = {
        headers: {
          'Content-Type': 'application/json',
          'token':sessionStorage['token'],
        },
      }
      const body = {
        empEmail, empPass, empName, empMobile, role, empIdProof,managerId,empStatus,empImg,dob
      }
      const url = 'http://localhost:8080/employee/'+managerId+'/'+role
      console.log(url)
      // const url = 'http://localhost:8080/employee/{uid}/{role}'
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: ADD_NEW_EMPLOYEE_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: ADD_NEW_EMPLOYEE_FAIL,
            payload: error,
          })
        })
    }
  }


  export const fetchEmployees = () => {
    return (dispatch) => {
      dispatch({
        type: FETCH_EMPLOYEE_REQUEST,
      })
      const header = {
        headers: {
          'Content-Type': 'application/json',
          'token':sessionStorage['token'],
        },
      }
      const url = 'http://localhost:8080/manager/deliveryboy'
      axios
        .get(url, header)
        .then((response) => {
          dispatch({
            type: FETCH_EMPLOYEE_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: FETCH_EMPLOYEE_SUCCESS,
            payload: error,
          })
        })
    }
  }


  

  export const managerFetchOrders = ( custId ) => {
    return (dispatch) => {
      dispatch({
        type: MANAGER_ORDERS_REQUEST,
      })
      const header = {
        headers: {
          'Content-Type': 'application/json',
        },
      }
      const body = {
        
      }
      console.log("ahsdjkgaksdjkasdgjhsdgkasjdjkasdkjasgdasjkdg")
      console.log(body)
      const url = 'http://localhost:8080/manager'
      axios
        .get(url, body, header)
        .then((response) => {
          dispatch({
            type: MANAGER_ORDERS_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: MANAGER_ORDERS_FAIL,
            payload: error,
          })
        })
    }
  }