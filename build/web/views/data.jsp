<%-- 
    Document   : data
    Created on : Jul 19, 2020, 6:24:34 PM
    Author     : Edgar Hadhyra J
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Kibo Thrift | Data Order</title>
        <link rel="stylesheet" type="text/css" href="./public/assets/frontend/CSS/formatstyle.css">
        <link rel="stylesheet" type="text/css" href="./public/assets/frontend/CSS/table.css">
        <script src="https://kit.fontawesome.com/f6e15b711e.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="format-container">
            <header>
                <div class="header-logo">
                <a class="logo" href="katalog">
                    <img class="logokibo" src="./public/assets/img/logoqr/kibo.jpg">
                </a>
                </div>
            </header>
                
        <div>
            <div><br>
                <table>
                    <thead>
                        <td>Name</td>
                        <td>Email</td>
                        <td>Product Name</td>
                        <td>Quantity</td>
                        <td>Size</td>
                        <td>Clothes</td>
                        <td>Address</td>
                        <td>City</td>
                        <td>State</td>
                        <td>Phone</td>
                        <td>Settings</td>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${products}">
                        <tr>
                            <td><p>${item.name}</p></td>
                            <td><p>${item.email}</p></td>
                            <td><p>${item.product}</p></td>
                            <td><p>${item.qty}</p></td>
                            <td><p>${item.size}</p></td>
                            <td><p>${item.clothes}</p></td>
                            <td><p>${item.address}</p></td>
                            <td><p>${item.city}</p></td>
                            <td><p>${item.state}</p></td>
                            <td><p>${item.phone}</p></td>
                            <td>
                                <a class="fa fa-pencil" aria-hidden="true" style="color: blue;text-decoration: none;" href="./edit?id=${item.id}" name="id" value="${item.id}">
                                    Edit
                                </a>&nbsp;
<!--                            <form action="" method="POST">
                                    <button class="btn btn-sm btn-danger" value="${item.id}" name="del">Delete</button>
                                </form>-->
                                <a class="fa fa-trash" style="color: red;text-decoration: none;" aria-hidden="true" href="${pageContext.request.contextPath}/delete?id=${item.id}" name="id" value="${item.id}">
                                    Delete
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
          </div>
        <footer class="bagianbawah">
                <div class="footer-wrap">
                    <div class="socialmedia">
                        <div class="container-text">
                            <div class="baris">
                                <div class="sosmed">
                                    <span class="ket-sosmed">Follow Us : </span>
                                    <a href="" target="_blank">
                                        <i class="fab fa-instagram"></i>
                                    </a>
                                    <a href="" target="_blank">
                                        <i class="fab fa-line"></i>
                                    </a>
                                    <a href="" target="_blank">
                                        <i class="fab fa-whatsapp"></i>
                                    </a>
                                    <a href="" target="_blank">
                                        <i class="fab fa-twitter"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="footer-link">
                        <div id="kiri">
                            <ul>
                                <li><a href="#">INFORMASI</a></li>
                                <li><a href="#">Tentang Kami</a></li>
                                <li><a href="#">Ketentuan Privasi</a></li>
                                <li><a href="#">Kontak Kami</a></li>
                            </ul>
                        </div>
                        <div id="kanan">
                            <ul>
                                <li><a href="#">BANTUAN</a></li>
                                <li><a href="#">Bayar Di Tempat</a></li>
                                <li><a href="#">Cara Pemesanan</a></li>
                                <li><a href="#">Ketentuan Pengembalian</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="aplikasi">
                        <h1>Make a Better Shopping Experience With Whatsapp App</h1>
                        <p>Scan This Barcode:</p>
                        <a href="./public/assets/img/logoqr/cpkibo.jpg" target="_blank">
                        <img src="./public/assets/img/logoqr/cpkibo.jpg" width="200" height="200"></a>
                    </div>
                    <div class="bagianbawah2">
                        <div class="copyright">All Rights Reserved © 2020 Kibo Thrift</div>
                    </div>
                </div>
        </footer>
        </div>
        </div>
    </body>
</html>
