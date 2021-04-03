import Footer from "../components/Footer"
import Header from "../components/Header"


const AboutUsScreen = (props) => {
    return(
        <div>
        <div><Header/>
    </div>
        {/* <div>
        <h1>asdjhk</h1>
            
        </div> */}
    {/* <div class="product-navbar">
        <div class="product-navbar-centered">
            <ul>
                <li>
                    <a href="#" class="">
                        <span>
                            LINK                            
                        </span>
                    </a>
                </li>
                <li>
                    <a href="#" class="">
                        LINK
                    </a>
                </li>
            </ul>
        </div>
    </div> */}

    {/* <header class="navbar hero" role="banner">
        <div class="container">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">
                    <p>
                      <img src="https://apimatic-io-cdn.azureedge.net/img/theme/ApimaticLogo.svg"/>
                        APIMATIC
                    </p>
                </a>
            </div>
        </div>
    </header> */}

    <div id="about-main">
        <div class="jumbotron">
            <div class="jumbotron-inner">
                <div class="top-box">
                    <div class="content-box">
                    <br></br>
                    <br></br>
                    <br></br>
                    <br></br>
                        <h1>
                            About Us
                        </h1>
                        <p>
                        Slice - Food Ordering Solution!<br />Slice is an online food ordering system which we have developed for food lovers. Through Slice we are helping customers to discover the best cuisine. 
                        </p>
                    </div>
                </div>
            </div>
            <div class="img-layer-container">
                <div class="team-image" id="team-image">
                    <img src="/images/bubble.jpg" />
                </div>

                <div class="circles-container">
                    <div class="img-1">
                        <img src="https://apimatic.io/img/theme/aboutUs/Circles-1-1.svg" />                        
                    </div>
                    <div class="img-2">
                        <img src="https://apimatic.io/img/theme/aboutUs/Circles-2-1.svg" />                        
                    </div>                    
                </div>           
            </div>
        </div>
        <div class="story-container">
            <div class="need-for-dx-container">
                <h3 class="text-center">
                    Need for DX
                </h3>
                <p>
                    Application Programming Interfaces (APIs) have taken the world by storm and are now the de facto standard of software communication. Almost every software product nowadays consumes APIs. The business model of numerous companies around the world relies upon the consumption of their APIs. API providers, therefore, strive to increase API adoption rates by spending millions of dollars every year to improve developer experience. This is usually done by providing Software Development Kits (SDKs) and API documentation to developer consuming their API(s). Developing SDKs and writing documentation, however, are arduous, monotonous and error-prone tasks. It is a slow process and costs a lot of time and money.
                </p>
                <p>
                Our Mission<br></br>

                    To give the best crisply prepared blessings and treats for the majority of life’s minutes, conveyed with warmth and sponsored by our assurance of brilliance.
                </p>
                <div class="img-container">
                    <img src="https://apimatic.io/img/theme/aboutUs/dxFlow.svg" alt="apimatic developer experience process" class="img-responsive"/>
                </div>
            </div>
            <div class="container-divider"></div>
            <div class="our-tech-container">
                <h3 class="text-center">
                Our Mission
                </h3>
                <p>
                To Deliver food safely to your doorstep, To give the best crisply prepared blessings and treats for the majority of life’s minutes, conveyed with warmth and sponsored by our assurance of brilliance.
                </p>
                <div class="img-container">
                    <img src="https://media.giphy.com/media/cCakkzdotOdOxUVVfP/giphy.gif" alt="apimatic code generation engine" class="img-responsive"/>
                </div>
            </div>
            <div class="container-divider"></div>
            <div class="origin-story-container">
                <h3 class="text-center">
                Quality and Convenience
                </h3>
                <p>From our mark Pizza to our flavorfully rich Wines, Great ‘Slice’ sets aside the opportunity to do it right. The final products are the best crisp prepared items right in your neighborhood – ideal for each event and festivity.</p>
                <div class="img-container">
                    <img src="https://media.giphy.com/media/10SrYA07iDPyO4/giphy.gif" alt="apimatic code generation engine" class="img-responsive"/>
                </div>
            </div>
            <div class="container-divider"></div>
            <div class="today-container">
                <h3 class="text-center">
                    Our Promise
                </h3>
                <ul>
                    <li>Delightful food and newly prepared merchandise</li>
                    <li>Just the most astounding quality principles</li>
                    <li>Benevolent administration concentrated on perfection</li>
                    <li>Reliable, trustworthy items and administrations</li>
                    <li>The most grounded certification in the business</li>
                    <li>Best multi cusin with great taste</li>
                </ul>
            </div>
            <div class="container-divider"></div>
        </div>
    </div>  
        
        <Footer/>
        </div>
    )
}


export default AboutUsScreen