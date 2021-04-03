import axios from "axios"
import { CART_ADD_FAIL, CART_ADD_REQUEST, CART_ADD_SUCCESS, CART_FETCH_FAIL, CART_FETCH_REQUEST, CART_FETCH_SUCCESS, CART_REMOVE_FAIL, CART_REMOVE_REQUEST, CART_REMOVE_SUCCESS } from "../constants/cartConstants"


  export const addToCart = ( custId, subMenuId, sizeId, crustId, addrId, qty, total ) => {
    return (dispatch) => {
      dispatch({
        type: CART_ADD_REQUEST,
      })
      const header = {
        headers: {
          'Content-Type': 'application/json',
        },
      }
      const body = {
        custId, subMenuId, sizeId, crustId, addrId, qty,total
      }
      console.log("ahsdjkgaksdjkasdgjhsdgkasjdjkasdkjasgdasjkdg")
      console.log(body)
      const url = 'http://localhost:8080/customer/cart/'+JSON.stringify(custId)+''
      console.log(url)
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: CART_ADD_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: CART_ADD_FAIL,
            payload: error,
          })
        })
    }
  }

  export const removeFromCart = ( cartId ) => {
    return (dispatch) => {
      dispatch({
        type: CART_REMOVE_REQUEST,
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
      const url = 'http://localhost:8080/customer/cart/delete/'+JSON.stringify(cartId)+''
      
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: CART_REMOVE_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: CART_REMOVE_FAIL,
            payload: error,
          })
        })
    }
  }


  export const fetchCart = ( custId ) => {
    //Add cart id yad se
    return (dispatch) => {
      dispatch({
        type: CART_FETCH_REQUEST,
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
      const url = 'http://localhost:8080/customer/cartdetails/'+JSON.stringify(custId)+''
      
      axios
        .get(url, body, header)
        .then((response) => {
          dispatch({
            type: CART_FETCH_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: CART_FETCH_FAIL,
            payload: error,
          })
        })
    }
  }