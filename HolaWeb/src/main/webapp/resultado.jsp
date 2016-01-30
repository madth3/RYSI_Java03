<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        Art&iacute;culo agregado:
        <ul>
            <li>${articulo.clave}</li>
            <li>${articulo.nombre}</li>
            <li>${articulo.precioUnitario}</li>
            <li>${articulo.fechaIntroduccion}</li>
            <li>${articulo.existencia}</li>
        </ul>
    </body>
</html>
