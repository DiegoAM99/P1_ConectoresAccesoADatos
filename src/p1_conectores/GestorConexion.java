/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author xp
 */
public class GestorConexion {
    
    Connection conn1;
    
    
    public GestorConexion(){
        conn1 = null;
        
        try{
            String url="jdbc:mysql://localhost:3306/discografica?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";          
            String user = "root";
            String password = "root";
            
            conn1 = (Connection) DriverManager.getConnection(url, user, password);
            if(conn1 != null){
                System.out.println("Conectado a discografica...");
            }
        }catch(SQLException ex){
            System.out.println("ERROR: direccion o usuario/clave no válida");
        }
    }
    
    
    
    public void cerrar_conexion(){
        try{
            conn1.close();
            System.out.println("Conexion cerrada");
        
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexion");
        }
    }
    
    public void insertar(){
        try{
            //Crea un statement
            Statement sta = conn1.createStatement();
            
            //Ejecuta la insercion
            sta.executeUpdate("INSERT INTO album VALUES(2, 'Greatest Hits', 'Queen')");
            //Cierra el statement
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al hacer un insert");
            ex.printStackTrace();
        }
    }
    public void modificar(){
     try{
            //Crea un statement
            Statement sta = conn1.createStatement();
            
            //Ejecuta la insercion
            sta.executeUpdate("ALTER TABLE album ADD anno_publicacion YEAR");
            //Cierra el statement
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al hacer un ALTER TABLE");
            ex.printStackTrace();
        }
}
    
    public void borrar(){
     try{
            //Crea un statement
            Statement sta = conn1.createStatement();
            
            //Ejecuta la insercion
            sta.executeUpdate("DROP TABLE album");
            //Cierra el statement
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al hacer unDROP TABLE");
            ex.printStackTrace();
        }
    }
    
    public void consulta_preparedStatement(){
        try{
            String query = "SELECT * FROM album WHERE titulo like ?";
            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1,"B%");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                System.out.println("ID -"+ rs.getInt("id")+ "Titulo"+ rs.getString("titulo") + "Autor"+ rs.getString("autor"));
            }
            rs.close();
            pst.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
        }
    }
    
    public void consulta_Statement(){
        try{
            Statement sta = conn1.createStatement();
            String query = "SELECT * FROM album WHERE titulo like 'B%'";
            ResultSet rs = sta.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID -"+ rs.getInt("id")+ "Titulo"+ rs.getString("titulo") + "Autor"+ rs.getString("autor"));
            }
            rs.close();
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
        }
    }
    
    public void insertar_con_commit(){
        try{
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO album " + "VALUES (5,'Let it be', 'The Beatles')");
            sta.executeUpdate("INSERT INTO album " + "VALUES (6,'Abbey Road', 'The Beatles')");
            conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al hacer un INSERT");
            try{
                if(conn1!=null)
                    conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
    }
  }
}
