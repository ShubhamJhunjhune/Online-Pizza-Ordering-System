import Header from "../../components/Header"


const BookTableScreen = (props) => {
return(
    <div>
<Header/>
<br></br>
<br></br>
<br></br>
  <div id="all" ng-app>
    {/* <div id="left" ng-click="b=b-1"><i class="material-icons">chevron_left</i></div> */}
  <div id="box" ng-init="name=['Borokely','live in Peace','Taste of China','Burgur Kings']; 
  address=['Mountain View,CA','San Francisco','Mumbai maha NagarPlllika','Panvel Orian Mall']; 
  dist=['30 mins','4hours','1 day','1 day 2 hours']; 
  time=['12 Noon to 1AM','11am to 9pm','2PM To 1AM','9Am To 11PM']; 
  wifi=['Yes','No','Yes','Yes',]; hotel=['NO','No','Yes','Yes',]; 
  featured=['Rooftops, Veggie Friendly','Food of taste','Love of China','Taste,Cover Magzine']; 
  image=['https://images.unsplash.com/photo-1504981983529-9ed8031ade7f?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=66b3d17225bded154fed181fbf8c064b','https://images.unsplash.com/photo-1494346480775-936a9f0d0877?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=28fffc0f6b4c167fcb6bd7be728f1216','https://images.unsplash.com/photo-1481833761820-0509d3217039?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=f8d09f68f5e30fd6c7ab06071b35a26b','https://images.unsplash.com/photo-1488324346298-5ad3d8f96d0d?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjE0NTg5fQ&s=0b4ab2c7fa68c4767cd17c077bae4402'];  =0">
    
    {/* <src id="image" style="background-image:url({{image[b]}})" iamge></src> */}
    
    <img class="booktableimg" src="/images/image8.jpg"  alt="Image"/>
    
    <div id="content">
       <ul>
       <li><i class="material-icons">location_on</i>Saint Joseph Street</li>
         {/* <li><i class="material-icons">directions_walk</i>Walk</li>
          <li><i class="material-icons">access_time</i>08:30:00</li> */}
        </ul>
      <table>
        <tr>
          <td>Name:</td>
          <td><input type="text"placeholder="Enter Full Name"/></td>
        </tr>
        <tr>
          <td>Email:</td>
          <td><input type="email"placeholder="Enter Email"/></td>
        </tr>
        <tr>
          <td>Date:</td>
          <td><input type="date"placeholder="Select Date"/></td>
        </tr>
        <tr>
          <td>Time:</td>
          <td><input type="time"/></td>
        </tr>
        <tr>
          <td>No of Person:</td>
          <td><input type="text"placeholder="No of person"/></td>
        </tr>
        <tr>
          {/* <td>Featured in: </td>
          <td>{{featured[b]}}</td> */}
        </tr>
      </table>
      <button className = "bookbutton">Book</button>
  </div>
 </div>
   {/* <div id="right" ng-click="b=b+1"><i class="material-icons">chevron_right</i></div>  */}
</div>

    </div>
)
}

export default BookTableScreen