<%-- 
    Document   : FormatOrder
    Created on : Jul 17, 2020, 9:41:00 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> KIBO THRIFT - Hidden Treasure </title>
    <link rel="stylesheet" type="text/css" href="./public/assets/frontend/CSS/formatstyle.css">
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
        
        <div id="main-body" class="main-format">
            <div class="main-form">
                <h1 class="cust-details">CUSTOMER DETAILS</h1>
            </div>
            <div class="garis"></div>
            <div class="main-fluid">
                <h2>IMPORTANT</h2>
                <p>For customs purposes, you must enter the 
                    following details in latin characters.</p>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <form class="checkout-form" method="POST" action="edit">
                    <span>
                        <i class="fas fa-user"></i>
                        <input type="text" value="${ product.id }" placeholder="*" required name="id">
                    </span>
                    <span>
                        <i class="fas fa-user"></i>
                        <input type="text" value="${ product.name }" placeholder="Name*" required name="name">
                    </span>
                    <span>
                        <i class="fas fa-user"></i>
                        <input type="text" value="${ product.email }" placeholder="Email*" required name="email">
                    </span>
                    <span>
                        <i class="fa fa-code"></i>
                        <input type="text" value="${ product.product }" placeholder="Name of Product*" name="product">
                    </span>
                    <span>
                        <i class="fa fa-sort-numeric-asc"></i>
                        <input type="number" value="${ product.qty }" placeholder="Quantity*" name="qty">
                        <label><i class="fa fa-cog"> Size* </i></label>
                            <select required="" name="size">
                                <option ${ product.size == 'S' ? 'selected' : ''}value="S">S</option>
                                <option ${ product.size == 'M' ? 'selected' : ''}value="M">M</option>
                                <option ${ product.size == 'L' ? 'selected' : ''}value="L">L</option>
                                <option ${ product.size == 'XL' ? 'selected' : ''}value="XL">XL</option>
                                <option ${ product.size == 'XXL' ? 'selected' : ''}value="XXL">XXL</option>
                            </select>                   
                        <label><i class="fa fa-star"> Clothes* </i></label>
                            <select class="clothes" name="clothes">
                                <option ${ product.clothes == 'Tops' ? 'selected' : ''}value="Tops">Tops</option>
                                <option ${ product.clothes == 'Sweatshirt' ? 'selected' : ''}value="Sweatshirt">Sweatshirt</option>
                                <option ${ product.clothes == 'Denim' ? 'selected' : ''}value="Denim">Denim</option>
                                <option ${ product.clothes == 'Trousers' ? 'selected' : ''}value="Trousers">Trousers</option>
                                <option ${ product.clothes == 'Accessories' ? 'selected' : ''}value="Accessories">Accessories</option>
                            </select>
                    </span>
                    <span>
                        <i class="fas fa-map-marker-alt"></i>
                        <input type="text" value="${ product.address }" placeholder="Address*" required name="address">
                    </span>
                    <span>
                        <label><i class="fas fa-city"> Town/City* </i></label>
                        <select class="city" name="city">
                            <option ${ product.city == 'Jakarta Selatan' ? 'selected' : ''}value="Jakarta Selatan">Jakarta Selatan</option>
                            <option ${ product.city == 'Jakarta Timur' ? 'selected' : ''}value="Jakarta Timur">Jakarta Timur</option>
                            <option ${ product.city == 'Jakarta Barat' ? 'selected' : ''}value="Jakarta Barat">Jakarta Barat</option>
                            <option ${ product.city == 'Jakarta Timur' ? 'selected' : ''}value="Jakarta Utara">Jakarta Utara</option>
                            <option ${ product.city == 'Bandung' ? 'selected' : ''}value="Bandung">Bandung</option>
                            <option ${ product.city == 'Yogyakarta' ? 'selected' : ''}value="Yogyakarta">Yogyakarta</option>
                            <option ${ product.city == 'Semarang' ? 'selected' : ''}value="Semarang">Semarang</option>
                            <option ${ product.city == 'Surabaya' ? 'selected' : ''}value="Surabaya">Surabaya</option>
                            <option ${ product.city == 'Depok' ? 'selected' : ''}value="Depok">Depok</option>
                            <option ${ product.city == 'Tangerang' ? 'selected' : ''}value="Tangerang">Tangerang</option>
                            <option ${ product.city == 'Tangerang Selatan' ? 'selected' : ''}value="Tangsel">Tangerang Selatan</option>
                            <option ${ product.city == 'Bogor' ? 'selected' : ''}value="Bogor">Bogor</option>
                            <option ${ product.city == 'Lainnya' ? 'selected' : ''}value="Lainnya">Lainnya</option>
                        </select>
                    </span>
                    <span>
                        <label><i class="fas fa-building"> Province/State* </i></label>
                        <select class="province" name="state">
                            <option ${product.state == 'DKI Jakarta' ? 'selected' : ''}value="DKI Jakarta">DKI Jakarta</option>
                            <option ${product.state == 'Jawa Barat' ? 'selected' : ''}value="Jawa Barat">Jawa Barat</option>
                            <option ${product.state == 'Jawa Tengah' ? 'selected' : ''}value="Jawa Tengah">Jawa Tengah</option>
                            <option ${product.state == 'Jawa Timur' ? 'selected' : ''}value="Jawa Timur">Jawa Timur</option>
                            <option ${product.state == 'Banten' ? 'selected' : ''}value="Banten">Banten</option>
                            <option ${product.state == 'Lainnya' ? 'selected' : ''}value="Lainnya">Lainnya</option>
                        </select>
                    </span>
                    <span>
                        <i class="fas fa-mobile-alt"></i>
                        <input type="text" value="${ product.phone }" placeholder="Mobile*" required name="phone">
                    </span>
                    <button class="buttoncontinue" onclick="alert('Hello, Kibo Lovers!\nPlease complete your checkout')">CHECKOUT</button>
                </form>
                <p class="term">By continuing you accept our
                    <a href="#">Privacy Policy</a>.</p>
                </p>
            </div>
        </div>

        <!--footer-->
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
</body>
</html>
