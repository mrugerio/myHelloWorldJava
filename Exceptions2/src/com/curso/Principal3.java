package com.curso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3 {

	public static void main(String[] args) {
		
		Connection conn = null; 
		Statement stmt = null; 
		ResultSet rs = null; 
		try { 
		    conn = getConnection(); // Regresa un JDBC Connection 
		    stmt = conn.createStatement(); 
		    rs = stmt.executeQuery("select * from empleado"); 
		    // ejecuta consulta
		    // cierra rs, stmt, conn
		    // interta en pojos
		} catch (Exception e) { 
		    // maneja cualquier exception
		} finally { 
		    try { 
		        if (rs != null) 
		            rs.close(); 
		    } catch (SQLException sqle) {
		    	// log  
		    }
		    try { 
		        if (stmt != null) 
		            stmt.close(); 
		    } catch (SQLException sqle) {
		    	// log 
		    }
		    try { 
		        if (conn != null) 
		            conn.close(); 
		    } catch (SQLException sqle)  {
		    	// log 
		    }
		}
	}

	static Connection getConnection() {
		return null;
	}

}
