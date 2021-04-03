const OrderTracking = (props) => { 
    return (
<div className = "bodily">

<div className="cardu">
    <div class="titley">Purchase Reciept</div>
    <div class="infoc">
        <div class="row">
            <div class="col-7"> <span id="headings">Date</span><br/> <span id="detailss">10 October 2018</span> </div>
            <div class="col-5 pull-right"> <span id="headings">Order No.</span><br/> <span id="detailss">012j1gvs356c</span> </div>
        </div>
    </div>
    <div class="pricingg">
        <div class="row">
            <div class="col-9"> <span id="name">BEATS Solo 3 Wireless Headphones</span> </div>
            <div class="col-3"> <span id="price">£299.99</span> </div>
        </div>
        <div class="row">
            <div class="col-9"> <span id="name">Shipping</span> </div>
            <div class="col-3"> <span id="price">£33.00</span> </div>
        </div>
    </div>
    <div class="totalal">
        <div class="row">
            <div class="col-9"></div>
            <div class="col-3"><big>£262.99</big></div>
        </div>
    </div>
    <div class="tracking">
        <div class="titley">Tracking Order</div>
    </div>
    <div class="progress-track">
        <ul id="progressbar">
            <li class="step0 active " id="step1">Ordered</li>
            <li class="step0 active text-center" id="step2">Shipped</li>
            <li class="step0 active text-center" id="step3">On the way</li>
            <li class="step0  text-right" id="step4">Delivered</li>
        </ul>
    </div>
    <div class="footerr">
        <div class="row">
            <div class="col-2"><img class="img-fluid" src="https://i.imgur.com/YBWc55P.png"/></div>
            <div class="col-10">Want any help? Please &nbsp;<a> contact us</a></div>
        </div>
    </div>
</div>
</div>
)
}

export default OrderTracking

