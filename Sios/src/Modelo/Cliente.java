package Modelo;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class Cliente {
    private int id_cliente;
    private String tipo_documento;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String nombre_contacto;
    private String tel_contacto;
    Conexion objConexion=new Conexion();
    Connection con;
    //String url = "jdbc:odbc:SIOS";
    PreparedStatement st;
    public Cliente(){
        
    }

    public Cliente(int id_cliente, String tipo_documento, String nombre, String direccion, String telefono, String correo, String nombre_contacto, String tel_contacto) {
        this.id_cliente = id_cliente;
        this.tipo_documento = tipo_documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre_contacto = nombre_contacto;
        this.tel_contacto = tel_contacto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getTel_contacto() {
        return tel_contacto;
    }

    public void setTel_contacto(String tel_contacto) {
        this.tel_contacto = tel_contacto;
    }
    public String registrar_clienteMdl(){
            try{
                con=objConexion.stringcon();
                //Connection conn=DriverManager.getConnection(url, "","");
                st=con.prepareStatement("{call Registrar_Cliente(?,?,?,?,?,?,?,?)}");
                st.setInt(1,id_cliente);
		st.setString(2,tipo_documento);
		st.setString(3,nombre);
		st.setString(4,direccion);
		st.setString(5,telefono);
		st.setString(6,correo);
		st.setString(7,nombre_contacto);
		st.setString(8,tel_contacto);
		ResultSet rs=st.executeQuery();
                //con.close();
                String resultado="";
                while(rs.next()){
                   resultado=rs.getString(1);
                }
                con.close();
                return resultado;
                
            }catch(Exception e){
                return "error";
            }
    }
    public ResultSet objBuscar_Cliente(int id){
        try {
            con=objConexion.stringcon();
            st=con.prepareStatement("Buscar_Cliente '"+id+"'");
            ResultSet rs = st.executeQuery();
            return rs; 
             //pendiente
        } catch (Exception e) {
           return null;
        }
          
     }
    public String objEliminar_Cliente(int id){
        try {
            con=objConexion.stringcon();
            st=con.prepareStatement("Eliminar_Cliente '"+id+"'");
            ResultSet rs = st.executeQuery();
            String resp="";
             while (rs.next()) {
               resp = rs.getString(1);
           }
            JOptionPane.showMessageDialog(null, resp);
             //con.close();       
             //pendiente
        } catch (Exception e) {
           return null;
        }
        return null;
     }
    public String objActualizar_clienteMdl(){
            try{
                con=objConexion.stringcon();
                //Connection conn=DriverManager.getConnection(url, "","");
                st=con.prepareStatement("{call Actualizar_Cliente(?,?,?,?,?,?,?,?)}");
                st.setInt(1,id_cliente);
		st.setString(2,tipo_documento);
		st.setString(3,nombre);
		st.setString(4,direccion);
		st.setString(5,telefono);
		st.setString(6,correo);
		st.setString(7,nombre_contacto);
		st.setString(8,tel_contacto);
		ResultSet rs=st.executeQuery();
                //con.close();
                String resultado="";
                while(rs.next()){
                   resultado=rs.getString(1);
                }
                con.close();
                return resultado;
                
            }catch(Exception e){
                return "error";
            }
    }
    public ResultSet objMostrar_ClienteMdl(){
        try {
            con=objConexion.stringcon();
            st=con.prepareStatement("{call Consultar_Cliente}");
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
           return null;
        }
        //return null;
     }
}    