<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de IMC</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">

    <h1 class="mb-4">Calculadora de Índice de Masa Corporal (IMC)</h1>

    <form action="ControladorServlet" method="post">
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre:</label>
            <input type="text" class="form-control" name="nombre" required>
        </div>

        <div class="mb-3">
            <label for="peso" class="form-label">Peso (kg):</label>
            <input type="number" class="form-control" name="peso" step="0.01" required>
        </div>

        <div class="mb-3">
            <label for="estatura" class="form-label">Estatura (m):</label>
            <input type="number" class="form-control" name="estatura" step="0.01" required>
        </div>

        <button type="submit" class="btn btn-primary">Calcular IMC</button>
    </form>

</body>
</html>
