package dao;

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


import modelo.Persona;

public class DAO {
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/tpfinalpoo";
	String sql = "";
	int fila;
	public int actualizar(Persona p) {
		Connection conexion = null;
		conexion = conectar();
		//sql = "UPDATE `bd_53`.`persona` SET `id`= 69 WHERE `id` = '"+p.getId()+"';";
		sql = "UPDATE `bd_53`.`persona` SET `nombre`= 'Rubi' WHERE `id` = '"+p.getIdPersona()+"';";
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
			stmt.setFloat(1, p.getIdPersona());
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
	
	/*public int agregar(String id, String apellido, String nombre) {
		Connection conexion = null;
		conexion = conectar();
		sql = "INSERT INTO ``.`persona`(`id`,`nombre`,`apellido`)VALUES('"+id+"','"+apellido+"','"+nombre+"');";
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
	}*/
	
	public int agregarPersonaPorParametro(Persona p) {
		Connection conexion = null;
		conexion = conectar();
		sql = "INSERT INTO `tpfinalpoo`.`personas`(`idpersona`,`nombre`,`nacimiento`,`hijoas`,`idestudio`,`dni`)VALUES(?,?,?,?,?,?);";
		try {
			Date sqlDate = Date.valueOf(p.getNacimiento());
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setString(2, p.getNombre());
			stmt.setDate(3, sqlDate);
			stmt.setFloat(1, p.getIdPersona());
			stmt.setBoolean(4, p.getTieneHijos());
			stmt.setInt(5, p.getIdPersona());
			stmt.setInt(6, p.getDni());
			fila = stmt.executeUpdate(); //Se tiene que ejecutar sin parametro(sql) porque ya se ejecuto el insert anteriormente 
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
	
	public ArrayList<Persona> consultar() {
		ArrayList<Persona> solucion = new ArrayList<>();
		Connection conexion = null;
		sql = "SELECT * FROM personas;"; //WHERE nombre = '"+p.getNombre()+"'
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String idPersona = rs.getString("idPersona");
				String nombre = rs.getString("nombre");
				String fecha = rs.getString("nacimiento");
				String tieneHijos = rs.getString("hijoas");
				String idEstudio = rs.getString("idEstudio");
				String dni = rs.getString("dni");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return solucion;
	}
	
	public Connection conectar(){
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);
		}catch(SQLException e){
			e.printStackTrace();
		} 
		return conexion;
	}
}