<%-- 
    Document   : home
    Created on : Jul 17, 2020, 7:12:59 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="layouts/head.jsp">
        <jsp:param name="title" value="home"/>
    </jsp:include>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
    <div id="page-wrapper">
        <!--Judul-->
            <header>
                <jsp:include page="layouts/navbar.jsp"></jsp:include>
            </header>

            <div class="catalog">
                <div class="catalog-list" id="hotitems">
                    <h1>- HOT ITEMS -</h1>
                    <ul>
                        <li><a href="#">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/auroradenim.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Aurora Denim Trousers</h2>
                                <h3>IDR 200.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/ambercropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/ambercropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Amber Cropped Top</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/vianatiedye.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/vianatiedye.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Viana Tie Dye Denim Jacket</h2>
                                <h3>IDR 250.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/trouser/jourdatrousers.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/jourdatrousers.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Jourda Corduroy Trousers</h2>
                                <h3>IDR 165.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/kade.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/kade.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Kade Sweatshirts</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/tohilidenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/tohilidenim.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Tohili Denim Trousers</h2>
                                <h3>IDR 220.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/dallascropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/dallascropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Dallas Cropped Top</h2>
                                <h3>IDR 150.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/frankiecropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/frankiecropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Frankie Cropped Tops</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                    </ul>
                </div>
                <br>
                <div class="catalog-list" id="tops">
                    <h1>- TOPS -</h1>
                    <ul>
                        <li><a href="./public/assets/img/tops/deliatiedye.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/deliatiedye.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Delia Bleach Dyed Top</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/jehannetiedye.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/jehannetiedye.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Jehanne Bleach Dyed Top</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/onyx_adelima.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/onyx_adelima.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Onyx Cropped Top</h2>
                                <h3>IDR 150.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/ambercropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/ambercropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Amber Cropped Top</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/dallascropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/dallascropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Dallas Cropped Top</h2>
                                <h3>IDR 160.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/junocropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/junocropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Juno Cropped Top</h2>
                                <h3>IDR 150.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/ellanavycropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/ellanavycropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Ella Navy Cropped Top</h2>
                                <h3>IDR 155.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/tops/frankiecropped.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/tops/frankiecropped.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Frankie Cropped Tops</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                    </ul>
                </div>
                <br>
                <div class="catalog-list" id="sweatshirt">
                    <h1>- SWEATSHIRT -</h1>
                    <ul>
                        <li><a href="./public/assets/img/sweatshirt/mondaybleachdyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/mondaybleachdyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Monday Bleach Dyed Sweatshirt</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/moehanddyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/moehanddyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Moe Hand-Dyed Sweatshirt</h2>
                                <h3>IDR 150.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/eleazerbleachdyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/eleazerbleachdyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Eleazer Bleach Dyed Sweatshirt</h2>
                                <h3>IDR 150.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/jolenebleachdyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/jolenebleachdyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Jolene Bleach Dyed Sweatshirt</h2>
                                <h3>IDR 170.00</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/kade.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/kade.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Kade Sweatshirt</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/irisbleachdyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/irisbleachdyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Iris Bleach-Dyed</h2>
                                <h3>IDR 160.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/darlenableachdyed.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/darlenableachdyed.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Darlena Bleach Dyed Sweatshirt</h2>
                                <h3>IDR 170.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </a>
                        </li>
                        <li><a href="./public/assets/img/sweatshirt/cheese.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/sweatshirt/cheese.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Cheese Sweatshirt</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </a>
                        </li>
                    </ul>
                </div>
                <br>
                <div class="catalog-list" id="denim">
                    <h1>- DENIM -</h1>
                    <ul>
                        <li><a href="./public/assets/img/denim/auroradenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/auroradenim.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Aurora Denim Trousers</h2>
                                <h3>IDR 200.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/berlindenimtrousers.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/berlindenimtrousers.jpg" 
                                width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Berlin Denim Trousers</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/bluewooddenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/bluewooddenim.jpg"
                                 width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Blue Wood Denim</h2>
                                <h3>IDR 250.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/ejnedenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/ejnedenim.jpg"
                                 width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Ejne Denim</h2>
                                <h3>IDR 165.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/oniandenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/oniandenim.jpg" 
                                width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Onian Denim</h2>
                                <h3>IDR 220.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/pistodenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/pistodenim.jpg" 
                                width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Pisto Denim</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/tohilidenim.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/tohilidenim.jpg" 
                                width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Tohili Denim</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                        <li><a href="./public/assets/img/denim/vianatiedye.jpg">
                            <div class="catalog-img">
                                <img src="./public/assets/img/denim/vianatiedye.jpg"                                 
                                width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Viana Tiedye Denim</h2>
                                <h3>IDR 145.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                            </a>
                        </li>
                    </ul>
                </div>
                <br>
                <div class="catalog-list" id="trousers">
                    <h1>- TROUSERS -</h1>
                    <ul>
                        <li><a href="./public/assets/img/trouser/elviratrousers.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/elviratrousers.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Elvira Trousers</h2>
                                <h3>IDR 165.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/jourdatrousers.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/jourdatrousers.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Jourda Trousers</h2>
                                <h3>IDR 165.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/maude striped trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/maude striped trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Maude Striped Trousers</h2>
                                <h3>IDR 170.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/odette black striped trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/odette black striped trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Odette Black Striped Trousers</h2>
                                <h3>IDR 170.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/eleo bleach-dyed denim trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/eleo bleach-dyed denim trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Eleo Bleach-dyed Denim Trousers</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/Diama Navy Bleach-dyed Trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/Diama Navy Bleach-dyed Trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Diama Navy Bleach-dyed Trousers</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/felicia bleach-dyed denim trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/felicia bleach-dyed denim trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Felicia Bleach-dyed Denim Trousers</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                        <li><a href="./public/assets/img/trouser/isadora bleach-dyed denim trouser.jpg"></a>
                            <div class="catalog-img">
                                <img src="./public/assets/img/trouser/isadora bleach-dyed denim trouser.jpg" width="270" height="397">
                            </div>
                            <div class="titlelist">
                                <h2>Isador Bleach-dyed Denim Trousers</h2>
                                <h3>IDR 180.000</h3>
                                <h3>S/M/L/XL</h3>
                            </div>
                        </li>
                    </ul>
                </div>
                <br>
                <div class="catalog-list">
                    <h1><a href="#hotitems" style="color: grey;">Up</a></h1>
                </div>
            </div>

            <!--footer-->
            <jsp:include page="layouts/footer.jsp"></jsp:include>
            <jsp:include page="layouts/scripts.jsp"></jsp:include>
    </div>
</body>
</html>
