

package controlador;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import modelo.UsuarioDAO;

@WebServlet("/ControladorServlet")
public class ControladorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
try {
    String nombre = request.getParameter("nombre");
    String pesoStr = request.getParameter("peso");
    String estaturaStr = request.getParameter("estatura");

    System.out.println("Nombre: " + nombre);
    System.out.println("Peso: " + pesoStr);
    System.out.println("Estatura: " + estaturaStr);

    if (nombre == null || pesoStr == null || estaturaStr == null) {
        throw new NullPointerException("Uno o más parámetros son nulos.");
    }

    double peso = Double.parseDouble(pesoStr);
    double estatura = Double.parseDouble(estaturaStr);
    double imc = peso / (estatura * estatura);
    String clasificacion;

    if (imc < 18.5) {
        clasificacion = "Bajo peso";
    } else if (imc < 25) {
        clasificacion = "Normal";
    } else if (imc < 30) {
        clasificacion = "Sobrepeso";
    } else {
        clasificacion = "Obesidad";
    }

    UsuarioDAO dao = new UsuarioDAO();
    dao.guardarHistorial(nombre, peso, estatura, imc, clasificacion);

    request.setAttribute("nombre", nombre);
    request.setAttribute("peso", peso);
    request.setAttribute("estatura", estatura);
    request.setAttribute("imc", imc);
    request.setAttribute("clasificacion", clasificacion);

    request.getRequestDispatcher("vistas/resultado.jsp").forward(request, response);

} catch (Exception e) {
    e.printStackTrace();
    response.getWriter().println("Error en el servlet: " + e.toString());
     }

    }
}
