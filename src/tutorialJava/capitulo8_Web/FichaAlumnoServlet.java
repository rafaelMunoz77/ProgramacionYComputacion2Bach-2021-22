package tutorialJava.capitulo8_Web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FichaAlumnoServlet
 */
@WebServlet("/FichaAlumnoServlet")
public class FichaAlumnoServlet extends HttpServlet {
 
	String respuesta = "";
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FichaAlumnoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.respuesta = "<!DOCTYPE html> "
				+ "<html> "
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi primer Servlet</title> "
				+ "</head> "
				+ "<body> "
				+ "<h1>Ficha de alumno/a</h1>";

		mostrarUnAlumno ( Integer.parseInt(request.getParameter("id")) );

		this.respuesta += "</body>"
				+ "</html>";
		
		response.getWriter().append(this.respuesta);
	}

	
	
	
	/**
	 * 
	 */
	private void mostrarUnAlumno(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 			
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno where id = " + id);
		   
			// Navegación del objeto ResultSet
			if (rs.next() == true) { 
				this.respuesta += "Nombre: " + rs.getString("nombre") + "<br/>" +
						"Apellidos: " + rs.getString("apellidos") + "<br/>" + 
						"NIF: " + rs.getString("nif");
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
}
