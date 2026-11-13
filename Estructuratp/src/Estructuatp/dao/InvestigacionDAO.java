package Estructuatp.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Properties;
import Estructuatp.modelo.Persona;

public class InvestigacionDAO {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/tpfinalpoo";
	String sql = "";
	int fila;
	
	public Connection conectar(){
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);
		}catch(SQLException e){
			e.printStackTrace();
		} 
		return conexion;
	}
	public int actualizar(Persona p) {
		Connection conexion = null;
		conexion = conectar();
		//sql = "UPDATE `bd_53`.`persona` SET `id`= 69 WHERE `id` = '"+p.getId()+"';";
		sql = "UPDATE `bd_53`.`persona` SET `nombre`= 'Rubi' WHERE `id` = '"+p.getDni()+"';";
		//sql = "UPDATE `bd_53`.`persona` SET `apellido`= 'Torres' WHERE `id` = '"+p.getId()+"';";
		try {
			Statement stmt = conexion.createStatement();
			int fila = stmt.executeUpdate(sql);
			System.out.println(fila);
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return fila;
	}
	
	public int eliminar(Persona p) {
		sql = "DELETE FROM `persona` WHERE id = '(?)';";		
		Connection conexion = null;
		conexion = conectar();
		try {
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(1, p.getDni());
			//int fila = stmt.executeUpdate();
			//System.out.println(fila);
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return fila;
	}
	

}
