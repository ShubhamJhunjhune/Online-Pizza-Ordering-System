import Header from "../components/Header"
import '../App.css'
import { addToCart } from "../actions/cartAction"
import { useDispatch, useSelector } from "react-redux"
import { getProducts } from "../actions/productAction"
import { useEffect } from "react"
import Footer from "../components/Footer"
const MenuScreen = (props) =>{
    const dispatch = useDispatch()
    dispatch(getProducts)
    const productsfetch = useSelector((store) => store.fetchProduct)
    const user = useSelector((store) => store.userSignin)
    const { error, response, loading } = productsfetch
    console.log("Before Fetch")
    console.log(response)
    useEffect(() => {
      console.log("I am here")
      dispatch(getProducts())
    },[])
    useEffect(() => {}, [ error, response, loading])
    // if(payload && payload.result.length>0)
    //   const products[] = payload.result
    // const products = [
    //     { id: 1, title: 'product 1', image : '/images/pizz1.jpg', description: 'description 1', price: 100 },
    //     { id: 2, title: 'product 2', image : '/images/pizz2.jpg', description: 'description 2', price: 200 },
    //     { id: 3, title: 'product 3', image : '/images/pizz3.jpg', description: 'description 3', price: 300 },
    //     { id: 4, title: 'product 4', image : '/images/pizz4.jpg', description: 'description 4', price: 400 },
    //     { id: 5, title: 'product 5', image : '/images/pizz5.jpg', description: 'description 5', price: 500 },
    //     { id: 5, title: 'product 5', image : '/images/pizz6.jpg', description: 'description 5', price: 500 },
    //     { id: 5, title: 'product 5', image : '/images/pizz7.jpg', description: 'description 5', price: 500 },
    //     { id: 5, title: 'product 5', image : '/images/pizz8.jpg', description: 'description 5', price: 500 },
    //     { id: 5, title: 'product 5', image : '/images/pizz9.jpg', description: 'description 5', price: 500 },
    //     { id: 5, title: 'product 5', image : '/images/pizz10.jpg', description: 'description 5', price: 500 },
    //   ]    
    const onAddToCart = (product) => {
      if(user.response)
        dispatch(addToCart(user.response.result.custId, product.subMenuId,1,1,1,1,1))
      else{
        alert("Please login first")
      }
    }
return (
<div class="p-3 mb-2 bg-dark text-white">
<Header/>
<br></br>
<br></br>
<br></br>
<div className="menubody" class="p-3 mb-2 bg-dark text-dark">

<div class="container text-center">
<h1>Product card</h1>
</div>
<div class="shell">
<div class="container">
  <div class="row">
        { response &&
            response.result.map((product) => {
       var image = product.subMenuImg
          return (
    <div class="col-md-3">
      <div class="wsk-cp-product">
        <div class="wsk-cp-img">
          <img src={image} alt="Product" class="img-responsive" />
        </div>
        <div class="wsk-cp-text">
          <div class="category">
            <span>{product.subMenuName}</span>
          </div>
          <div class="title-product">
            <h3>{product.subMenuDetails}</h3>
          </div>
          <div class="description-prod">
            <p>{product.subMenuIntro}</p>
          </div>
          <div class="card-footer">
            <div class="wcf-left"><span class="price">Rs.{product.subMenuBasePrice}</span></div>
            <div class="wcf-right"><a onClick={() => {
                  onAddToCart(product)
                }} class="buy-btn"><span class="material-icons">shopping_cart</span></a></div>
          </div>
        </div>
      </div>
    </div>
    )
})}
</div>
</div>
</div>
</div>

<div class="shell" >
  <div class="container" className = "p-3 mb-2 bg-dark text-dark">
    <div class="row">
      <div class="col-md-6">
        <div class="wsk-cp-product">
          <div class="wsk-cp-img">
            <img src="/images/donut.jpg" alt="Product" class="img-responsive" />
          </div>
          <div class="wsk-cp-text">
            <div class="category">
              <span>Donuts</span>
            </div>
            <div class="title-product">
              <h3>Irish Cream Donuts</h3>
            </div>
            <div class="description-prod">
              <p>These easy baked chocolate donuts are flavoured with delicious Irish cream, then covered with an Irish cream chocolate glaze and topped with sprinkles.</p>
            </div>
            <div class="card-footer">
              <div class="wcf-left"><span class="price">Rp500.000</span></div>
              <div class="wcf-right"><a href="#" class="buy-btn"><span class="material-icons">shopping_cart</span></a></div>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-6">
        <div class="wsk-cp-product">
          <div class="wsk-cp-img"><img src="/images/sundae.jpg" alt="Product" class="img-responsive" /></div>
          <div class="wsk-cp-text">
            <div class="category">
              <span>Sundae</span>
            </div>
            <div class="title-product">
              <h3>Raspberry Rose Fruit Sundae</h3>
            </div>
            <div class="description-prod">
              <p>Sundae consists of one or more scoops of ice cream topped with toppings such as sprinkles, whipped cream, marshmallows,  maraschino cherries and fruits</p>
            </div>
            <div class="card-footer">
              <div class="wcf-left"><span class="price">Rp500.000</span></div>
              <div class="wcf-right"><a href="#" class="buy-btn"><span class="material-icons">shopping_cart</span></a></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<Footer/>
</div>)
}

export default MenuScreen

