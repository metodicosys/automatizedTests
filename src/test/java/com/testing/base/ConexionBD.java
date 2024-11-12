package com.testing.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.testing.propertiesReader.DBPropertiesReader;
import com.testing.tool.cte.BaseCte;

public class ConexionBD {

	static DBPropertiesReader reader;
	
	
	public static Connection conectar() {
		
		reader = new DBPropertiesReader();
		Connection conexion = null;
		
		try {
			Class.forName(BaseCte.DBPARAM_OJDBC_DRIVER);
			String passwordBD = reader.getPasswordBD();
			String userBD = reader.getUserBD();
			String urlBD = reader.getUrlBD();
			conexion = DriverManager.getConnection(urlBD, userBD, passwordBD);
			System.out.println("No se ha llegado al catch");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error en la conexión de la base de datos.");
		} catch (SQLException e) {
			System.out.println("Error de tipo SqlException. No llega a la BD T-T");
			e.printStackTrace();
		}
		return conexion;
	}
}
