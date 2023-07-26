package javacrudmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "";
    String bd = "bdescuela";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null, "La conexion se ha realizado con exito");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de Datos: "+e.toString());
        }
        return conectar;
    }
}
