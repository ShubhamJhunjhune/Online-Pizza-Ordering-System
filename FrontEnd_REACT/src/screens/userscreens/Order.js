

const OrderPage = (props) => {
return(
    <div className = "bg">
<div className = "pizzabody">
<h1>Order form</h1>
<form>
  {/* <!-- pizza type --> */}
  <h2>Pizza type</h2>
  <div>
    <input id="pizza-margarita" name="pizza-type" type="radio" value="margarita"/>
    <label for="pizza-margarita"><strong>Margarita</strong> (fresh mozzarella and basil with sauce)</label>
  </div>
  <div>
    <input id="pizza-mushroom" name="pizza-type" type="radio" value="mushroom"/>
    <label for="pizza-mushroom"><strong>Mondo Mushroom</strong> (all the mushrooms you can handle)</label>
  </div>
  <div>
    <input id="pizza-sausage" name="pizza-type" type="radio" value="sausage"/>
    <label for="pizza-sausage"><strong>Classic sausage</strong> (Italian sausage and peppers)</label>
  </div>
  <div>
    <input id="pizza-veggie" name="pizza-type" type="radio" value="veggie"/>
    <label for="pizza-veggie"><strong>Vegetables!</strong> (seasonal veggie medley)</label>
  </div>
  {/* <div>
    <input id="type-custom" name="pizza-type" type="radio" value="custom" checked/>
    <label for="type-custom"><strong>Custom</strong> (design your own!)</label>
  </div> */}

  <h2>Toppings</h2>

  {/* <!-- toppings --> */}
  <div>
    <input id="topping-cheese" name="cheese" type="checkbox" value="cheese" />
    <label for="topping-cheese"><strong>Cheese</strong></label>
{/* 
    <label class="visuallyhidden" for="topping-cheese-location">Cheese location</label>
    <select id="topping-cheese-location" name="cheese-location">
      <option value="all" selected>All over</option>
      <option value="left">Left side</option>
      <option value="right">Right side</option>
    </select> */}
  </div>
  <div>
    <input id="topping-pepperoni" name="topping" type="checkbox" value="pepperoni"/>
    <label for="topping-pepperoni"><strong>Pepperoni</strong></label>
    {/* <!-- for a cleaner experience, we'd only add the <select> when the checkbox is checked --> */}
  </div>
  <div>
    <input id="topping-beef" name="topping" type="checkbox" value="beef" />
    <label for="topping-beef"><strong>Ground beef</strong></label>

    {/* <label class="visuallyhidden" for="topping-beef-location">Beef location</label>
    <select id="topping-beef-location" name="beef-location">
      <option value="all">All over</option>
      <option value="left" selected>Left side</option>
      <option value="right">Right side</option>
    </select> */}
  </div>
  <div>
    <input id="topping-spinach" name="topping" type="checkbox" value="spinach" />
    <label for="topping-spinach"><strong>Fresh spinach</strong></label>
    {/* <label class="visuallyhidden" for="topping-spinach-location">Spinach location</label>
    <select id="topping-spinach-location" name="spinach-location">
      <option value="all">All over</option>
      <option value="left">Left side</option>
      <option value="right" selected>Right side</option>
    </select> */}
  </div>
  <div>
    <input id="topping-peppers" name="topping" type="checkbox" value="peppers"/>
    <label for="topping-peppers"><strong>Grilled peppers</strong></label>
    {/* <!-- for a cleaner experience, we'd only add the <select> when the checkbox is checked --> */}
  </div>

  <h2>Important details</h2>
  {/* <!-- size --> */}
  <div>
    <label for="pizza-size"><strong>Size</strong></label>
    <select id="pizza-size" name="pizza-size">
      <option value="s">Small</option>
      <option value="m">Medium</option>
      <option value="l" selected>Large</option>
      <option value="xl">Extra large</option>
    </select>
  </div>
<br></br>
    <div>
      <label for="pizza-qty"><strong>Quantity</strong></label>
      <select id="pizza-qty" name="pizza-qty">
        <option value="1" selected>1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
      </select>
    </div>
    

      {/* <div class="textarea">
        <label for="notes"><strong>Notes</strong></label>
        <textarea id="notes"></textarea>
      </div> */}
        <br></br>
      {/* <a href="#add-another"><span aria-hidden="true">+</span> Add another pizza</a> */}
      
      <a href="payment.html" class="button">Head to payment</a>
</form>
</div>
</div>
)
}

export default OrderPage