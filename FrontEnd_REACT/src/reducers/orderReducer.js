import {
    ADD_ORDER_REQUEST,
    ADD_ORDER_SUCCESS,
    ADD_ORDER_FAIL,
    ADD_ORDER_RESET,
    FETCH_ORDER_REQUEST,
    FETCH_ORDER_SUCCESS,
    FETCH_ORDER_FAIL,
    FETCH_ORDER_RESET,
    ASSIGN_DELIVERYBOY_REQUEST,
    ASSIGN_DELIVERYBOY_SUCCESS,
    ASSIGN_DELIVERYBOY_FAIL,
  } from '../constants/orderConstant'

export const addOrderReducer = (state = {}, action) => {
    switch (action.type) {
      case ADD_ORDER_REQUEST:
        return { loading: true }
      case ADD_ORDER_SUCCESS:
        return { loading: false, response: action.payload }
      case ADD_ORDER_FAIL:
        return { loading: false, error: action.payload }
      default:
        return state
    }
  }
  
  export const fetchOrderReducer = (state = {}, action) => {
    switch (action.type) {
      case FETCH_ORDER_REQUEST:
        return { loading: true }
      case FETCH_ORDER_SUCCESS:
        return { loading: false, response: action.payload }
      case FETCH_ORDER_FAIL:
        return { loading: false, error: action.payload }
      default:
        return state
    }
  }
  
  
  export const assignDeliveryBoyReducer = (state = {}, action) => {
    switch (action.type) {
      case ASSIGN_DELIVERYBOY_REQUEST:
        return { loading: true }
      case ASSIGN_DELIVERYBOY_SUCCESS:
        return { loading: false, response: action.payload }
      case ASSIGN_DELIVERYBOY_FAIL:
        return { loading: false, error: action.payload }
      default:
        return state
    }
  }