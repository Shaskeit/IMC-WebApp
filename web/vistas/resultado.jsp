<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado del IMC</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">

    <h1 class="mb-4">Resultado del Cálculo de IMC</h1>

    <p><strong>Nombre:</strong> ${nombre}</p>
    <p><strong>Peso:</strong> ${peso} kg</p>
    <p><strong>Estatura:</strong> ${estatura} m</p>
    <p><strong>IMC:</strong> ${imc}</p>
    <p><strong>Clasificación:</strong> ${clasificacion}</p>

    <a href="index.jsp" class="btn btn-primary mt-3">Volver</a>

</body>
</html>
