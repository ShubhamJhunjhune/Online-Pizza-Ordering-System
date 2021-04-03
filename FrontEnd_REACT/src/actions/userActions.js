import {
  USER_SIGNIN_FAIL,
  USER_SIGNIN_REQUEST,
  USER_SIGNIN_SUCCESS,
  USER_SIGNOUT,
  USER_SIGNUP_FAIL,
  USER_SIGNUP_REQUEST,
  USER_SIGNUP_SUCCESS,
} from '../constants/userConstants'
import axios from 'axios'

export const logout = () => {
  return (dispatch) => {
    sessionStorage.removeItem('token')
    dispatch({ type: USER_SIGNOUT })
    document.location.href = '/signin'
  }
}

   // private int custId;
	// private String custEmail;
	// private String custPass;
	// private String custName;
	// private String custMobile;
	// @JsonIgnore
	// private List<CustomerAddress> custAddr = new ArrayList<>();
	// private CustomerStatus custStatus;
	// private String custImg;
	// private String role;

  // name, custEmail, custPass, custMobile, "ACTIVE", "image", "CUSTOMER")
export const signup = ( custName, custEmail, custPass, custMobile, custStatus, custImg, role) => {
  return (dispatch) => {
    dispatch({
      type: USER_SIGNUP_REQUEST,
    })

    const header = {
      headers: {
        'Content-Type': 'application/json',
      },
    }
    // private int custId;
    // private String custEmail;
    // private String custPass;
    // private String custName;
    // private String custMobile;
    // @JsonIgnore
    // private List<CustomerAddress> custAddr = new ArrayList<>();
    // private CustomerStatus custStatus;
    // private String custImg;
    // private String role;
    const body = {
      custId : "2344",custEmail,custPass,custName,custMobile,custStatus,custImg,role
    }
    console.log("ahsdjkgaksdjkasdgjhsdgkasjdjkasdkjasgdasjkdg")
    console.log(body)
    const url = 'http://localhost:8080/customer'
    
    axios
      .post(url, body, header)
      .then((response) => {
        dispatch({
          type: USER_SIGNUP_SUCCESS,
          payload: response.data,
        })
      })
      .catch((error) => {
        dispatch({
          type: USER_SIGNUP_FAIL,
          payload: error,
        })
      })
  }
}

export const userSignin = (userEmail, password) => {
  return (dispatch) => {
    dispatch({
      type: USER_SIGNIN_REQUEST,
    })

    const header = {
      headers: {
        'Content-Type': 'application/json',
      },
    }

    const body = {
      userEmail,
      password,
    }
    console.log("beforeakjsdhkash")
    console.log(body)
    const url = 'http://localhost:8080/user'
    axios
      .post(url, body, header)
      .then((response) => {
        dispatch({
          type: USER_SIGNIN_SUCCESS,
          payload: response.data,
        })
      })
      .catch((error) => {
        dispatch({
          type: USER_SIGNIN_FAIL,
          payload: error,
        })
      })
  }
}

export const placeOrder = (userEmail, password) => {
  return (dispatch) => {
    dispatch({
      type: USER_SIGNIN_REQUEST,
    })

    const header = {
      headers: {
        'Content-Type': 'application/json',
      },
    }

    const body = {
      userEmail,
      password,
    }
    console.log("beforeakjsdhkash")
    console.log(body)
    const url = 'http://localhost:8080/user'
    axios
      .post(url, body, header)
      .then((response) => {
        dispatch({
          type: USER_SIGNIN_SUCCESS,
          payload: response.data,
        })
      })
      .catch((error) => {
        dispatch({
          type: USER_SIGNIN_FAIL,
          payload: error,
        })
      })
  }
}
