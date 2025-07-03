<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de IMC</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">

    <h1 class="mb-4">Calculadora de IMC</h1>

    <form action="${pageContext.request.contextPath}/ControladorServlet" method="post">


        <div class="col-md-6">
            <label for="nombre" class="form-label">Nombre</label>
            <input type="text" name="nombre" id="nombre" class="form-control" required>
        </div>

        <div class="col-md-6">
            <label for="peso" class="form-label">Peso (kg)</label>
            <input type="number" name="peso" id="peso" class="form-control" step="0.1" required>
        </div>

        <div class="col-md-6">
            <label for="estatura" class="form-label">Estatura (m)</label>
            <input type="number" name="estatura" id="estatura" class="form-control" step="0.01" required>
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-primary">Calcular IMC</button>
        </div>
    </form>

</body>
</html>
