<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: 'Poppins', sans-serif;
	background: linear-gradient(120deg, #2980b9, #8e44ad);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	width: 100%;
	max-width: 400px;
	background: rgba(255, 255, 255, 0.1);
	padding: 40px;
	box-shadow: 0 15px 25px rgba(0, 0, 0, 0.5);
	border-radius: 10px;
	backdrop-filter: blur(10px);
}

.login-box {
	position: relative;
	width: 100%;
	max-width: 350px;
	padding: 40px;
	background: rgba(0, 0, 0, 0.7);
	text-align: center;
	border-radius: 10px;
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
}

.login-box h2 {
	margin: 0 0 20px;
	padding: 0;
	color: #fff;
	text-transform: uppercase;
	font-weight: 500;
}

.login-box .user-box {
	position: relative;
}

.login-box .user-box input {
	width: 100%;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	margin-bottom: 30px;
	border: none;
	border-bottom: 1px solid #fff;
	outline: none;
	background: transparent;
}

.login-box .user-box label {
	position: absolute;
	top: 0;
	left: 0;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	pointer-events: none;
	transition: 0.5s;
}

.login-box .user-box input:focus ~ label, .login-box .user-box input:valid 
	 ~ label {
	top: -20px;
	left: 0;
	color: #03e9f4;
	font-size: 12px;
}

.login-box button {
	position: relative;
	display: inline-block;
	padding: 10px 20px;
	color: #03e9f4;
	font-size: 16px;
	text-transform: uppercase;
	overflow: hidden;
	transition: 0.5s;
	margin-top: 40px;
	letter-spacing: 4px;
	text-decoration: none;
}

.login-box button:hover {
cursor:pointer;
	background: #03e9f4;
	color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0
		100px #03e9f4;
}

.login-box button span {
	position: absolute;
	display: block;
}

.login-box button span:nth-child(1) {
	top: 0;
	left: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(90deg, transparent, #03e9f4);
	animation: btn-anim1 1s linear infinite;
}

@
keyframes btn-anim1 { 0% {
	left: -100%;
}

50


%
,
100


%
{
left


:


100
%;


}
}
.login-box button span:nth-child(2) {
	top: -100%;
	right: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(180deg, transparent, #03e9f4);
	animation: btn-anim2 1s linear infinite;
	animation-delay: 0.25s;
}

@
keyframes btn-anim2 { 0% {
	top: -100%;
}

50


%
,
100


%
{
top


:


100
%;


}
}
.login-box a span:nth-child(3) {
	bottom: 0;
	right: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(270deg, transparent, #03e9f4);
	animation: btn-anim3 1s linear infinite;
	animation-delay: 0.5s;
}

@
keyframes btn-anim3 { 0% {
	right: -100%;
}

50


%
,
100


%
{
right


:


100
%;


}
}
.login-box a span:nth-child(4) {
	bottom: -100%;
	left: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(360deg, transparent, #03e9f4);
	animation: btn-anim4 1s linear infinite;
	animation-delay: 0.75s;
}

@
keyframes btn-anim4 { 0% {
	bottom: -100%;
}
50


%
,
100


%
{
bottom


:


100
%;


}
}
</style>
</head>
<body>
	<div class="container">
		<div class="login-box">
			<h2>Login</h2>
			<form method="post">
				<div class="user-box">
					<input type="text" name="username" required=""> <label>Username</label>
				</div>
				<div class="user-box">
					<input type="password" name="password" required=""> <label>Password</label>
				</div>
				<button type="submit">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>