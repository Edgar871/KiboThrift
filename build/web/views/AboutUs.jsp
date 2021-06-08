<%-- 
    Document   : AboutUs
    Created on : Jul 17, 2020, 8:14:34 PM
    Author     : Edgar Hadhyra J
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>About Us</title>
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


<div class="container">
  <h2>About Us</h2>
  <div class="card">
    <div class="card-body">kibo thrift is a thrift store that provides a wide range of women's clothing and accessories and has very good quality and prices are relatively cheaper than similar thrift stores and on this web site you can see catalogs, prices, and addresses of our stores. Visit our offline store to see the latest stock and dance offers if you buy a lot.</div>
  </div>
</div>

<!--footer-->
<jsp:include page="layouts/footer.jsp"></jsp:include>
<jsp:include page="layouts/scripts.jsp"></jsp:include>

</body>
</html>
