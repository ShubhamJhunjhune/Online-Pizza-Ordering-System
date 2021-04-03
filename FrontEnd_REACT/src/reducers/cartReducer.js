import { CART_ADD_FAIL, CART_ADD_REQUEST, CART_ADD_RESET, CART_ADD_SUCCESS, CART_FETCH_FAIL, CART_FETCH_REQUEST, CART_FETCH_RESET, CART_FETCH_SUCCESS, CART_REMOVE_FAIL, CART_REMOVE_REQUEST, CART_REMOVE_RESET, CART_REMOVE_SUCCESS } from "../constants/cartConstants"

// const cartReducer = (state = [], action) => {
//   switch (action.type) {
//     case CART_ADD_REQUEST:
//       return [...state, action.payload]
//     case CART_REMOVE_REQUEST:
//       return state.filter((item) => item.id != action.payload.id)
//     default:
//       return state
//   }
// }
// export default cartReducer

export const addCartReducer = (state = [], action) => {
  switch (action.type) {
    case CART_ADD_REQUEST:
        return { loading: true }
      case CART_ADD_SUCCESS:
        return { loading: false, response: action.payload }
      case CART_ADD_FAIL:
        return { loading: false, error: action.payload }
      case CART_ADD_RESET:
        return {}
      default:
        return state
  }
}


export const fetchCartReducer = (state = [], action) => {
  switch (action.type) {
    case CART_FETCH_REQUEST:
        return { loading: true }
      case CART_FETCH_SUCCESS:
        return { loading: false, response: action.payload }
      case CART_FETCH_FAIL:
        return { loading: false, error: action.payload }
      case CART_FETCH_RESET:
        return {}
      default:
        return state
  }
}



export const removeCartReducer = (state = [], action) => {
  switch (action.type) {
    case CART_REMOVE_REQUEST:
        return { loading: true }
      case CART_REMOVE_SUCCESS:
        return { loading: false, response: action.payload }
      case CART_REMOVE_FAIL:
        return { loading: false, error: action.payload }
      case CART_REMOVE_RESET:
        return {}
      default:
        return state
  }
}
