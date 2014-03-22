package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    String url="jdbc:odbc:SIOS";
    Connection con;
    public Connection stringcon(){
        try{
            con=DriverManager.getConnection(url,"","");
            return con;
        }catch(Exception e){
            return null;
        }
    }
    public boolean closeconexion(){
        try{
            con.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
