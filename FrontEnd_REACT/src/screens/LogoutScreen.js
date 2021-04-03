

const LogoutScreen = (props) =>{
    return(
    <div>

<div class="content">
  <div class="wrapper-1">
    <div class="wrapper-2">
      <h1>Thank you !</h1>
      <p>Thanks for Shopping with us.  </p>
      <p>Hope to see you soon !</p>
      <button class="go-home"><a href="/home" className = "btnlogout">go home</a></button>
    </div>
    <div class="footer-like">

      {/* <Link to="/logout" class="nav-link"><span className="nav-link">Log Out</span></Link> */}
       <a  href="/signin">Sign In Again</a>

    </div>
</div>
</div>

    </div>
    )
}

export default LogoutScreen