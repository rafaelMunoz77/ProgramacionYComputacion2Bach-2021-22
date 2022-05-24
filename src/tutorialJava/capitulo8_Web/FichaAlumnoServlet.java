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
import javax.swing.JOptionPane;

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
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String nif = request.getParameter("nif");
		
		this.respuesta = "<!DOCTYPE html> "
				+ "<html> "
				+ "<head>"
				+ "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi primer Servlet</title> "
				+ "</head> "
				+ "<body> "
				+ "<h1>Ficha de alumno/a</h1>"
				+ "<form method='GET' action='FichaAlumnoServlet'>";
		
		if (nombre != null) {
			modificar(id, nombre, apellidos, nif);
		}

		mostrarUnAlumno (id);
		
		this.respuesta += "<br><button type='submit'>Enviar formulario</button></form></body>"
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
				this.respuesta += "<input type='hidden' name='id' value='" + id + "'>" + 
						"Nombre: <input type='text' name='nombre' value='" + rs.getString("nombre") + "'><br/>" +
						"Apellidos: <input type='text' name='apellidos' value='" + rs.getString("apellidos") + "'><br/>" + 
						"NIF: <input type='text' name='nif' value='" + rs.getString("nif") + "'>";
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

	
	
	
	
	
	/**
	 * 
	 */
	private void modificar (int id, String nombre, String apellidos, String nif) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");

			Statement s = (Statement) conexion.createStatement(); 
			
			int registrosModificados = s.executeUpdate (
					"update alumnos.alumno set nombre = '" + nombre + "', " + 
					"apellidos = '" + apellidos + "', nif = '" + nif + "' " +
					"where id = " + id);
		   
			if (registrosModificados == 1) {
//				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
//				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			// Cierre de los elementos
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
