import Footer from "../components/Footer"
import Header from "../components/Header"


const ContactusScreen = (props) => {


    return( <div>
<div><Header/></div>
<div>
<section id="contact">
  {/* <h1>CONTACT US</h1> */}
  <br></br>
  <br></br>
  <br></br>
  <div class="col-md-12 text-center">
    <h1>Contact Us</h1>
  </div>
  <div className="contact-wrapper">

    
    <form id="contact-form" className="form-horizontal">
       
      <div className="form-group">
        <div className="col-sm-12">
          <input  className="form-control" id="name" placeholder="NAME" name="name"  required/>
        </div>
      </div>

      <div className="form-group">
        <div className="col-sm-12">
          <input  className="form-control" id="email" placeholder="EMAIL" name="email"  required/>
        </div>
      </div>

      <textarea className="form-control" rows="10" placeholder="MESSAGE" name="message" required></textarea>

      <button className="btn btn-primary send-button" id="submit" type="submit" value="SEND">
        <div className="button">
          <i className="fa fa-paper-plane"></i><span className="send-text">SEND</span>
        </div>
      </button>
      
    </form>

    
      <div className="direct-contact-container">

        <ul className="contact-list">
          <li className="list-item"><i className="fa fa-map-marker fa-2x"><span className="contact-text place">City, State</span></i></li>
           
          <li className="list-item"><i className="fa fa-phone fa-2x"><span className="contact-text phone"><a href="tel:1-212-555-5555" title="Give me a call">(212) 555-2368</a></span></i></li>
          
          <li className="list-item"><i className="fa fa-envelope fa-2x"><span className="contact-text gmail"><a href="mailto:#" title="Send me an email">emailme@gmail.com</a></span></i></li>
          
        </ul>

        {/* <hr> */}
        <ul className="social-media-list">
          <li><a href="">
          <span class="material-icons">email</span></a>
          </li>
          <li><a href=" ">
          <span class="material-icons">facebook</span></a>
          </li>
          <li><a href=" ">
          <span class="material-icons">location_on</span></a>
          </li>
          <li><a href=" ">
          <span class="material-icons">call</span></a>
          </li>
        </ul>
        {/* <hr> */}
        <div className="copyright">&copy; ALL OF THE RIGHTS RESERVED</div>
        </div>
    </div>
</section>  
</div>

<Footer/>
</div>
    )
}


export default ContactusScreen