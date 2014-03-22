package Control;
import Modelo.Cliente;
import java.sql.ResultSet;
public class ClienteCtl {
    Cliente objRegistrar_Cliente=new Cliente();
    public String registrar_clienteCtl(int id, String tipo, String nom, String direc, String tel, String mail, String nom_contact, String tel_contact ){
        objRegistrar_Cliente.setId_cliente(id);
        objRegistrar_Cliente.setTipo_documento(tipo);
        objRegistrar_Cliente.setNombre(nom);
        objRegistrar_Cliente.setDireccion(direc);
        objRegistrar_Cliente.setTelefono(tel);
        objRegistrar_Cliente.setCorreo(mail);
        objRegistrar_Cliente.setNombre_contacto(nom_contact);
        objRegistrar_Cliente.setTel_contacto(tel_contact);
        return objRegistrar_Cliente.registrar_clienteMdl();
    }
    Cliente objBuscar_Cliente=new Cliente();
    public ResultSet buscar_clienteCtl(int id ){
        //objBuscar_Cliente.setId_cliente(id);
        return objBuscar_Cliente.objBuscar_Cliente(id);
    }
    Cliente objEliminar_Cliente=new Cliente();
    public String eliminar_clienteCtl(int id ){
        //objBuscar_Cliente.setId_cliente(id);
        return objBuscar_Cliente.objEliminar_Cliente(id);
    }
    Cliente objActualizar_Cliente=new Cliente();
    public String actualizar_clienteCtl(int id, String tipo, String nom, String direc, String tel, String mail, String nom_contact, String tel_contact ){
        objActualizar_Cliente.setId_cliente(id);
        objActualizar_Cliente.setTipo_documento(tipo);
        objActualizar_Cliente.setNombre(nom);
        objActualizar_Cliente.setDireccion(direc);
        objActualizar_Cliente.setTelefono(tel);
        objActualizar_Cliente.setCorreo(mail);
        objActualizar_Cliente.setNombre_contacto(nom_contact);
        objActualizar_Cliente.setTel_contacto(tel_contact);
        return objActualizar_Cliente.objActualizar_clienteMdl();
    }
    Cliente objMostrar_Cliente=new Cliente();
    public ResultSet mostrartodos_clienteCtl(){
        return objMostrar_Cliente.objMostrar_ClienteMdl();
    }
}
