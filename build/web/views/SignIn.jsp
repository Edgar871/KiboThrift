<%-- 
    Document   : SignIn
    Created on : Jul 17, 2020, 8:00:04 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title> KIBO THRIFT </title>
    <link rel="icon" href="./public/assets/img/logoqr/kibo.jpg">
    <link rel="stylesheet" type="text/css" href="./public/assets/frontend/CSS/stylelogin.css">
    <script src="https://kit.fontawesome.com/f6e15b711e.js" crossorigin="anonymous"></script>
    <script src="./public/assets/frontend/dist/sweetalert2.all.min.js"></script>
</head>

<body>
    <div class="wrapper">
        <div class="mid-signin">
            <div class="mid-signin-left">
                <div class="signin-logo">
                    <img class="kibologo" src="./public/assets/img/logoqr/kibo.jpg">
                </div>
                <div class="form-signin">
                    <form action="signin" method="POST">
                        <span>
                            <i class="fas fa-user"></i>
                            <input type="email" placeholder="Email" required name="email" maxlength="30">
                        </span>
                        <span>
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password" required name="password" id="password" minlength="8">
                        </span>
                        <!-- <br> -->
                        <!-- <br> -->
                        <button type="submit" class="buttonsignin" onclick="validate()" >SIGN IN</button>
                        <br>
                        <a class="joinus" href="joinus">JOIN US</a>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
            var wrongSpan = document.getElementById("wrongSpan");

            function getParameterByName(name, url) {
                if (!url)
                    url = window.location.href;
                name = name.replace(/[\[\]]/g, '\\$&');
                var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'),
                        results = regex.exec(url);
                if (!results)
                    return null;
                if (!results[2])
                    return '';
                return decodeURIComponent(results[2].replace(/\+/g, ' '));
            }

            if (getParameterByName("status") == "notok") {
                wrongSpan.style.display = "block";
            } else {
                wrongSpan.style.display = "none";
            }
        </script>
</body>
</html>
