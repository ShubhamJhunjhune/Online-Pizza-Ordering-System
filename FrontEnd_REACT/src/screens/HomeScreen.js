import Header from "../components/Header"
import '../App.css'
import MenuScreen from "./MenuScreen"
import Footer from "../components/Footer"
import { useSelector } from "react-redux"

const HomeScreen = (props) =>{
    return(
    <div>
<Header/>

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    {/* <li data-target="/" data-slide-to="0" class="active"></li> */}
    {/* <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li> */}
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
    <img className="background w-100" src="/images/bg.jpg" alt="First slide"/>
      <div class="carousel-caption d-none d-md-block">
        <h5 >Pizza House</h5>
        <p>Headaches come and go. Pizza is constant.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/images/pizz2.jpg" alt="Second slide"/>
      <div class="carousel-caption d-none d-md-block">
        <h5>Slider One Item</h5>
        <p>welcome to craving for Pizza....</p>
      </div>
    </div>
    <div class="carousel-item"> 
      <img class="d-block w-100" src="/images/pizz3.jpg" alt="Third slide"/>
      <div class="carousel-caption d-none d-md-block">
        <h5>Slider One Item</h5>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maxime, nulla, tempore. Deserunt excepturi quas vero.</p>
      </div>
    </div>
  </div>
  {/* <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a> */}
</div>

<MenuScreen/>
<Footer/>
</div>
    
    )
}


export default HomeScreen
