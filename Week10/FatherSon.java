@import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');sd

* {
	box-sizing: border-box;
}
 
body {
	background: #f6f5f7;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Montserrat', sans-serif;
	height: 50%;
	margin: -20px 0 50px;

}

h1 {
	font-weight: bold;
	margin: 0;
}

h2 {
	text-align: center;
}

p {
	font-size: 14px;
	font-weight: 100;
	line-height: 20px;
	letter-spacing: 0.5px;
	margin: 20px 0 30px;
}

span {
	font-size: 12px;
}

a {
	color: #333;
	font-size: 14px;
	text-decoration: none;
	margin: 15px 0;
}

button {
	border-radius: 20px;
	border: 1px solid #FF4B2B;
	background-color: #FF4B2B;
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
}

button:active {
	transform: scale(0.95);
}

button:focus {
	outline: none;
}

button.lite {
	background-color: transparent;
	border-color: #FFFFFF;
}

form {
	background-color: #FFFFFF;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 50px;
	height: 100%;
	text-align: center;
}

input {
	background-color: #eee;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 100%;
}

.container {
	background-color: #fff;
	border-radius: 10px;
  	box-shadow: 0 14px 28px rgba(0,0,0,0.25), 
			0 10px 10px rgba(0,0,0,0.22);
	position: relative;
	overflow: hidden;
	width: 46%;
	max-width: 100%;
	min-height: 480px;
  margin-top: 80px;
  margin-bottom: 0px;
  margin-right: -100px;
  margin-left: 700px;
}

.form-container {
	position: absolute;
	top: 0;
	height: 100%;
	transition: all 0.6s ease-in-out;
}

.sign-in-container {
	left: 0;
	width: 50%;
	z-index: 2;
}

.container.right-panel-active .sign-in-container {
	transform: translateX(100%);
}

.sign-up-container {
	left: 0;
	width: 50%;
	opacity: 0;
	z-index: 1;
}

.container.right-panel-active .sign-up-container {
	transform: translateX(100%);
	opacity: 1;
	z-index: 5;
	animation: show 0.6s;
}

@keyframes show {
	0%, 49.99% {
		opacity: 0;
		z-index: 1;
	}
	
	50%, 100% {
		opacity: 1;
		z-index: 5;
	}
}

.overlay-container {
	position: absolute;
	top: 0;
	left: 50%;
	width: 50%;
	height: 100%;
	overflow: hidden;
	transition: transform 0.6s ease-in-out;
	z-index: 100;
}

.container.right-panel-active .overlay-container{
	transform: translateX(-100%);
}

.overlay {
	background: #FF416C;
	background: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);
	background: linear-gradient(to right, #FF4B2B, #FF416C);
	background-repeat: no-repeat;
	background-size: cover;
	background-position: 0 0;
	color: #FFFFFF;
	position: relative;
	left: -100%;
	height: 100%;
	width: 200%;
  	transform: translateX(0);
	transition: transform 0.6s ease-in-out;
}

.container.right-panel-active .overlay {
  	transform: translateX(50%);
}

.overlay-panel {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 40px;
	text-align: center;
	top: 0;
	height: 100%;
	width: 50%;
	transform: translateX(0);
	transition: transform 0.6s ease-in-out;
}

.overlay-left {
	transform: translateX(-20%);
}

.container.right-panel-active .overlay-left {
	transform: translateX(0);
}

.overlay-right {
	right: 0;
	transform: translateX(0);
}

.container.right-panel-active .overlay-right {
	transform: translateX(20%);
}

.venn-container {
  padding: 25px 25px 25px 200px;
}
.venncircle {
  padding: 18px;
  width: 250px;
  height: 250px;
  border-radius: 50%;
  position: absolute;
}
.venncircle > a {
  font-size: 19px;
  font-weight: bold;
  letter-spacing: .004em;
  color: #FFFFFF;
  text-decoration: none;
}
.venncirctop {
  padding: 18px;
  width: 250px;
  height: 250px;
  border-radius: 50%;
  position: absolute;
  margin-bottom: -130px;
  margin-left: -70px;
  background-color: #5c5b59;
  filter: alpha(opacity=50);
  background-color: rgba(92, 91, 89, 0.5);
 position: relative;
}
.venncirctop > a {
  font-size: 19px;
  font-weight: bold;
  letter-spacing: .004em;
  color: #FFFFFF;
  text-decoration: none;
}
.venncirctop:hover {
  z-index: 5;
  background-color: #6A6561;
  filter: alpha(opacity=50);
  background-color: rgba(106, 101, 97, 0.9);
}
.venncirclft {
  padding: 18px;
  width: 250px;
  height: 250px;
  -moz-border-radius: 200px;
  -webkit-border-radius: 200px;
  border-radius: 50%;
  position: absolute;
  
  margin-left: -157px;
  background-color: #093d5c;
  filter: alpha(opacity=50);
  background-color: rgba(9, 61, 92, 0.5);
  z-index: 2;
}
.venncirclft > a {
  font-size: 19px;
  font-weight: bold;
  letter-spacing: .004em;
  color: #FFFFFF;
  text-decoration: none;
}
.venncirclft:hover {
  z-index: 5;
  background-color: #37688C;
  filter: alpha(opacity=50);
  background-color: rgba(55, 104, 140, 0.9);
}
.venncircrt {
  padding: 18px;
  width: 250px;
  height: 250px;
  border-radius: 50%;
  position: absolute;
  
  margin-left: 17px;
  background-color: #5e577b;
  filter: alpha(opacity=50);
  background-color: rgba(94, 87, 123, 0.5);
  z-index: 3;
  text-align: right;
}
.venncircrt > a {
  font-size: 20px;
  font-weight: bold;
  letter-spacing: .004em;
  color: #FFFFFF;
  text-decoration: none;
}
.venncircrt:hover {
  z-index: 5;
  background-color: #625F75;
  filter: alpha(opacity=50);
  background-color: rgba(98, 95, 117, 0.9);
}
.venncircbtm {
  padding: 18px;
  width: 250px;
  height: 250px;
  border-radius: 50%;
  position: absolute;
  top: 90px;
  margin-right: 100px;
  margin-left: -70px;
  text-align: center;
  background-color: #627746;
  filter: alpha(opacity=50);
  background-color: rgba(98, 119, 70, 0.5);
  z-index: 1;
  position: relative;
}
.venncircbtm > a {
  font-size: 19px;
  font-weight: bold;
  letter-spacing: .004em;
  color: #FFFFFF;
  text-decoration: none;
}
.venncircbtm:hover {
  z-index: 5;
  background-color: #3a4e20;
  filter: alpha(opacity=50);
  background-color: rgba(58, 78, 32, 0.9);
}
.venntxttop {
  text-align: center;
  display: inline-block;
  margin: 0 auto;
  position: relative;
  top: 10px;
}
.venntxttop:hover {
  color: #FFFFFF;
  text-decoration:none;
}
.venntxtrt {
  margin: 0 0 0 87px;
  display: inline-block;
  position: relative;
  top: 63px;
  z-index: 5;
}
.venntxtrt:hover {
  color: #FFFFFF;
  text-decoration:none;
}

.venntxtlft {
  width: 70%;
  display: inline-block;
  position: relative;
  top: 63px;
  z-index: 5;
}
.venntxtlft:hover {
  color: #FFFFFF;
  text-decoration:none;
}
.venntxtbtm {
  text-align: center;
  display: inline-block;
  width: 70%;
  position: relative;
  top: 103px;
	margin-top: 40px;
}
.venntxtbtm:hover {
  color: #FFFFFF;
    text-decoration:none;

}
.xyz{
	
	margin-top: -500px;
  margin-bottom: 0px;
  margin-right: 0px;
  margin-left: -800px;
}
.circle {
    width: 40%;
    height: 100px;
    border-radius: 170px;
    border: 1px solid #4e82bc;
    background-color: #E67E22;
    border: 0px solid #4e82bc;
  text-transform:capitalize;
    text-align:center;
	font-size:25px;
  	margin-top: 50px;
  margin-bottom: 0px;
  margin-right: 0px;
  margin-left: -720px;

}
a {
	text-decoration: none;
	color: inherit;
}

.cta {
	position: relative;
	margin: auto;
	padding: 19px 22px;
	transition: all .2s ease;
   margin-top: -70px;
  margin-bottom: 0px;
  margin-right: 0px;
  margin-left: 690px;
}

.cta:before {
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	display: block;
	border-radius: 28px;
	background: rgba(255, 171, 157, 0.5);
	width: 56px;
	height: 56px;
	transition: all .3s ease;
}

.cta span {
	position: relative;
	font-size: 16px;
	line-height: 18px;
	font-weight: 900;
	letter-spacing: .25em;
	text-transform: uppercase;
	vertical-align: middle;
 
}

.cta svg {
	position: relative;
	top: 0;
	margin-left: 10px;
	fill: none;
	stroke-linecap: round;
	stroke-linejoin: round;
	stroke: #111;
	stroke-width: 2;
	transform: translateX(-5px);
	transition: all .3s ease;
}

.cta:hover:before {
	width: 100%;
	background: #ffab9d;
}

.cta:hover svg {
	transform: translateX(0);
}

.cta:active {
	transform: scale(0.96);
}