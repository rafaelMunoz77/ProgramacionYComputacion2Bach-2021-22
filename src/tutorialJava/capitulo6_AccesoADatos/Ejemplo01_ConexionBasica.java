package tutorialJava.capitulo6_AccesoADatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Ejemplo01_ConexionBasica {

	/**
	 * 
	 */
	private static void pruebaConsultaBasica () {
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno");
		   
			// Navegación del objeto ResultSet
			while (rs.next() == true) { 
				System.out.println("id: " + rs.getInt("id") + " - nombre: " +
						rs.getString("nombre") + " - apellidos: " + 
						rs.getString("apellidos") + " - nif: " + 
						rs.getString("nif"));
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
	private static void pruebaUpdate () {
		Scanner sc = new Scanner(System.in);
		int id;
		String nuevoNombre, nuevoApellido;
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// Pedimos unos datos
			System.out.println("Introduce el id del registro afectado: ");
			id = Integer.parseInt(sc.next());
			System.out.println("Introduce el nuevo nombre del registro: ");
			nuevoNombre = sc.next();
			System.out.println("Introduce el nuevo apellido del registro: ");
			nuevoApellido = sc.next();
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			int numeroRegistroAfectados = s.executeUpdate (
					"UPDATE alumnos.alumno set nombre='" + nuevoNombre + "', apellidos='" + 
							nuevoApellido + "' where id=" + id + ";");
		   
			System.out.println(numeroRegistroAfectados + " registros afectados");
			
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
	
	
	/**
	 * 
	 */
	private static void pruebaInsert () {
		Scanner sc = new Scanner(System.in);
		int id;
		String nuevoNombre, nuevoApellido, dni;
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// Pedimos unos datos
			System.out.println("Introduce el id del nuevo registro: ");
			id = Integer.parseInt(sc.next());
			System.out.println("Introduce el nombre del nuevo registro: ");
			nuevoNombre = sc.next();
			System.out.println("Introduce el apellido del nuevo registro: ");
			nuevoApellido = sc.next();
			System.out.println("Introduce el dni del nuevo registro: ");
			dni = sc.next();
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			int numeroRegistroAfectados = s.executeUpdate (
					"INSERT INTO alumnos.alumno VALUES (" + id + ", '" + nuevoNombre + "', '" + 
					nuevoApellido + "', '" + dni + "')");
		   
			System.out.println(numeroRegistroAfectados + " registros afectados");
			
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
	

	
	
	/**
	 * 
	 */
	private static void pruebaDelete () {
		Scanner sc = new Scanner(System.in);
		int id;
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// Pedimos unos datos
			System.out.println("Introduce el id del registro que deseas eliminar: ");
			id = Integer.parseInt(sc.next());

			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			int numeroRegistroAfectados = s.executeUpdate (
					"DELETE from alumnos.alumno where id=" + id + ";");
		   
			System.out.println(numeroRegistroAfectados + " registros afectados");
			
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
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		pruebaUpdate();
//		pruebaInsert();
		pruebaDelete();
	}

}
