<%-- 
    Document   : navbar
    Created on : Jul 17, 2020, 7:12:13 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<navbar>
                    <div id="mySidenav" class="headerkiri">
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                            <ul>
                                <li><a href="katalog">Home</a></li>
                                <li><a href="#tops">Tops</a></li>
                                <li><a href="#sweatshirt">Sweatshirt</a></li>
                                <li><a href="#denim">Denim</a></li>
                                <li><a href="#trousers">Trousers</a></li>
                                <li><a href="create">Booking</a></li>
                                <li><a href="data">History</a></li>
                                <li><a href="aboutus">About Us</a></li>
                                <li><a href="signin">Sign Out</a></li>
                            </ul>
                    </div>
                    <span style="font-size:30px;cursor:pointer" class="bar" onclick="openNav()">&#9776;</span>
                    <div class="headertengah">
                        <a class="logo" href="katalog">
                            <img class="logokibo" src="./public/assets/img/logoqr/kibo.jpg">
                        </a>
                    </div>
                    <div class="headerkanan">
                        <ul>
                            <li>                 
                                <a href="create" class="shopcart">
                                    <i class="fas fa-shopping-bag"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </navbar>
