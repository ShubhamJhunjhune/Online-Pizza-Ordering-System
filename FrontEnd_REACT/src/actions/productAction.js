import {
    PRODUCT_ADD_FAIL,
    PRODUCT_ADD_REQUEST,
    PRODUCT_ADD_SUCCESS,
    PRODUCT_FETCH_FAIL,
    PRODUCT_FETCH_REQUEST,
    PRODUCT_FETCH_SUCCESS,
  } from '../constants/productConstants'

  import axios from 'axios'
  
  // private Integer subMenuId;
	// private String subMenuName;
	// private String subMenuIntro;
	// private String subMenuDetails;
	// private Double subMenuBasePrice;
	// private String subMenuImg;
	// private Menu menu;

  export const addProduct = (subMenuId, subMenuName, subMenuIntro, subMenuDetails, subMenuBasePrice, subMenuImg, menu) => {
    return (dispatch) => {
      dispatch({
        type: PRODUCT_ADD_REQUEST,
      })
  
      const header = {
        headers: {
          'Content-Type': 'application/json',
          token: sessionStorage['token'],
        },
      }
  
      const body = {
        subMenuId, subMenuName, subMenuIntro, subMenuDetails, subMenuBasePrice, subMenuImg, menu
      }
      const url = 'http://localhost:8080/menu/1'
      axios
        .post(url, body, header)
        .then((response) => {
          dispatch({
            type: PRODUCT_ADD_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: PRODUCT_ADD_FAIL,
            payload: error,
          })
        })
    }
  }
  
  export const getProducts = () => {
    return (dispatch) => {
      dispatch({
        type: PRODUCT_FETCH_REQUEST,
      })
  
      const header = {
        headers: {
          'Content-Type': 'application/json',
          token: sessionStorage['token'],
        },
      }
  
      const url = 'http://localhost:8080/menu/submenu'
      axios
        .get(url, header)
        .then((response) => {
          dispatch({
            type: PRODUCT_FETCH_SUCCESS,
            payload: response.data,
          })
        })
        .catch((error) => {
          dispatch({
            type: PRODUCT_FETCH_FAIL,
            payload: error,
          })
        })
    }
  }
  