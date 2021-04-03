import axios from "axios"
import { ADD_ORDER_FAIL, ADD_ORDER_REQUEST, ADD_ORDER_SUCCESS, FETCH_ORDER_FAIL, FETCH_ORDER_REQUEST, FETCH_ORDER_SUCCESS, CART_REMOVE_FAIL, CART_REMOVE_REQUEST, CART_REMOVE_SUCCESS } from "../constants/orderConstant"
import {ASSIGN_DELIVERYBOY_REQUEST, ASSIGN_DELIVERYBOY_SUCCESS, ASSIGN_DELIVERYBOY_FAIL} from "../constants/orderConstant"

  export const addOrder = ( custId ) => {
    return (dispatch) => {
      dispatch({
        type: ADD_ORDER_REQUEST,
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
      const url = 'http://localhost:8080/customer/order/'+JSON.stringify(custId)+''
      console.log(url)
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: ADD_ORDER_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: ADD_ORDER_FAIL,
            payload: error,
          })
        })
    }
  }

  export const fetchOrders = ( custId ) => {
    return (dispatch) => {
      dispatch({
        type: FETCH_ORDER_REQUEST,
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
      const url = 'http://localhost:8080/customer/history/'+JSON.stringify(custId)+''
      
      axios
        .get(url, body, header)
        .then((response) => {
          dispatch({
            type: FETCH_ORDER_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: FETCH_ORDER_FAIL,
            payload: error,
          })
        })
    }
  }

  export const dbAssignment = ( deliveryBoyId, orderId ) => {
    return (dispatch) => {
      dispatch({
        type: ASSIGN_DELIVERYBOY_REQUEST,
      })
      const header = {
        headers: {
          'Content-Type': 'application/json',
        },
      }
      const body = {
        orderId,deliveryBoyId
      }
      // console.log("ahsdjkgaksdjkasdgjhsdgkasjdjkasdkjasgdasjkdg")
      // console.log(body)
      const url = 'http://localhost:8080/manager'
      
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: ASSIGN_DELIVERYBOY_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: ASSIGN_DELIVERYBOY_FAIL,
            payload: error,
          })
        })
    }
  }