<%-- 
    Document   : JoinUs
    Created on : Jul 17, 2020, 9:43:17 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title> KIBO THRIFT </title>
    <link rel="stylesheet" type="text/css" href="./public/assets/frontend/CSS/stylelogin.css">
    <script src="https://kit.fontawesome.com/f6e15b711e.js" crossorigin="anonymous"></script>
</head>

<body>
    <div class="wrapper">
        <div class="mid-joinus">
            <div class="mid-joinus-right">
                <div class="joinus-logo">
                    <a href="signin"><img class="kibologo" src="./public/assets/img/logoqr/kibo.jpg"></a>
                </div>
                <div class="form-joinus">
                    <form action="joinus" method="POST">
                        <span>
                            <i class="fas fa-user"></i>
                            <input type="text" placeholder="Name" name="name"required>
                        </span>
                        <span>
                            <i class="fas fa-envelope"></i>
                            <input type="text" placeholder="Email" name="email" required>
                        </span>
                        <span>
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Password (Min. 8 Character)" name="password" id="password" minlength="8" required>
                        </span>
                        <span>
                            <i class="fas fa-lock"></i>
                            <input type="password" placeholder="Confirm Password" name="confpass"  id="confpass" minlength="8"required>
                        </span>
                        <br>
                        <button id="tombol"  class="buttonjoinus">JOIN US</button>
                    </form>
                        <table class="center">
                            <tr>
                              <th><a class="back2signin" href="signin">Back to Sign In</a></th>
                            </tr>
                          </table>
                </div>
            </div>
        </div>
    </div>
    
    <!-- <script src="dist/sweetalert2.all.min.js"></script> -->

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

            if (getParameterByName("status") == "passerr") {
                wrongSpan.style.display = "block";
                wrongSpan.textContent = "Password doesn't match!";
            } else if (getParameterByName("status") == "unerr") {
                wrongSpan.style.display = "block";
                wrongSpan.textContent = "Username must be 8 characters long!";
            } else {
                wrongSpan.style.display = "none";
            }
        </script>
</body>
</html>
