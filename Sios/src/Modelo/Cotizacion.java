package Modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cotizacion {
    private int id_cotizacion;
    private int id_cliente;
    private String nombre_trabajo;
    private Date fecha_cotizacion;
    private int cant_papel_original;
    private int valor_papel_original;
    private int cant_papel_copia;
    private int valor_papel_copia;
    private int cant_manila;
    private int valor_manila;
    private int cant_corte;
    private int valor_corte;
    private String preprensa;
    private int cant_preprensa;
    private int valor_preprensa;
    private String tipo_plancha;
    private int cant_tipo_plancha;
    private int valor_plancha;
    private String tipo_impresion;
    private int cant_tipo_impresion;
    private int valor_impresion;
    private int cant_numeracion;
    private int valor_numeracion;
    private int cant_grafado;
    private int valor_grafado;
    private int cant_troquelado;
    private int valor_troquelado;
    private int cant_repujado;
    private int valor_repujado;
    private int cant_realzado;
    private int valor_realzado;
    private int cant_estampado;
    private int valor_estampado;
    private int cant_plegado;
    private int valor_plegado;
    private int cant_cosido;
    private int valor_cosido;
    private int cant_emblocado;
    private int valor_emblocado;
    private int cant_empacado;
    private int valor_empacado;
    private int cant_transporte;
    private int valor_transporte;
    private int cant_otros;
    private int valor_otros;
    private String terminado;
    private int cant_terminado;
    private int valor_terminado;
    private double utilidad;
    private int estado;
    Conexion objConexion=new Conexion();
    Connection con;
    //String url = "jdbc:odbc:SIOS";
    PreparedStatement st;
        
    public Cotizacion(){
        
    }

    public Cotizacion(int id_cotizacion, int id_cliente, String nombre_trabajo, Date fecha_cotizacion, int cant_papel_original, 
        int valor_papel_original, int cant_papel_copia, int valor_papel_copia, int cant_manila, int valor_manila, int cant_corte, 
        int valor_corte, String preprensa, int cant_preprensa, int valor_preprensa, String tipo_plancha, int cant_tipo_plancha, 
        int valor_plancha, String tipo_impresion, int cant_tipo_impresion, int valor_impresion, int cant_numeracion, int valor_numeracion, 
        int cant_grafado, int valor_grafado, int cant_troquelado, int valor_troquelado, int cant_repujado, int valor_repujado, 
        int cant_realzado, int valor_realzado, int cant_estampado, int valor_estampado, int cant_plegado, int valor_plegado, 
        int cant_cosido, int valor_cosido, int cant_emblocado, int valor_emblocado, int cant_empacado, int valor_empacado, 
        int cant_transporte, int valor_transporte, int cant_otros, int valor_otros, String terminado, int cant_terminado, int valor_terminado, double utilidad, int estado) {
        this.id_cotizacion = id_cotizacion;
        this.id_cliente = id_cliente;
        this.nombre_trabajo = nombre_trabajo;
        this.fecha_cotizacion = fecha_cotizacion;
        this.cant_papel_original = cant_papel_original;
        this.valor_papel_original = valor_papel_original;
        this.cant_papel_copia = cant_papel_copia;
        this.valor_papel_copia = valor_papel_copia;
        this.cant_manila = cant_manila;
        this.valor_manila = valor_manila;
        this.cant_corte = cant_corte;
        this.valor_corte = valor_corte;
        this.preprensa = preprensa;
        this.cant_preprensa = cant_preprensa;
        this.valor_preprensa = valor_preprensa;
        this.tipo_plancha = tipo_plancha;
        this.cant_tipo_plancha = cant_tipo_plancha;
        this.valor_plancha = valor_plancha;
        this.tipo_impresion = tipo_impresion;
        this.cant_tipo_impresion = cant_tipo_impresion;
        this.valor_impresion = valor_impresion;
        this.cant_numeracion = cant_numeracion;
        this.valor_numeracion = valor_numeracion;
        this.cant_grafado = cant_grafado;
        this.valor_grafado = valor_grafado;
        this.cant_troquelado = cant_troquelado;
        this.valor_troquelado = valor_troquelado;
        this.cant_repujado = cant_repujado;
        this.valor_repujado = valor_repujado;
        this.cant_realzado = cant_realzado;
        this.valor_realzado = valor_realzado;
        this.cant_estampado = cant_estampado;
        this.valor_estampado = valor_estampado;
        this.cant_plegado = cant_plegado;
        this.valor_plegado = valor_plegado;
        this.cant_cosido = cant_cosido;
        this.valor_cosido = valor_cosido;
        this.cant_emblocado = cant_emblocado;
        this.valor_emblocado = valor_emblocado;
        this.cant_empacado = cant_empacado;
        this.valor_empacado = valor_empacado;
        this.cant_transporte = cant_transporte;
        this.valor_transporte = valor_transporte;
        this.cant_otros = cant_otros;
        this.valor_otros = valor_otros;
        this.cant_terminado = cant_terminado;
        this.valor_terminado = valor_terminado;
        this.utilidad = utilidad;
        this.estado = estado;
    }

    public int getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(int id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_trabajo() {
        return nombre_trabajo;
    }

    public void setNombre_trabajo(String nombre_trabajo) {
        this.nombre_trabajo = nombre_trabajo;
    }

    public Date getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(Date fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public int getCant_papel_original() {
        return cant_papel_original;
    }

    public void setCant_papel_original(int cant_papel_original) {
        this.cant_papel_original = cant_papel_original;
    }

    public int getValor_papel_original() {
        return valor_papel_original;
    }

    public void setValor_papel_original(int valor_papel_original) {
        this.valor_papel_original = valor_papel_original;
    }

    public int getCant_papel_copia() {
        return cant_papel_copia;
    }

    public void setCant_papel_copia(int cant_papel_copia) {
        this.cant_papel_copia = cant_papel_copia;
    }

    public int getValor_papel_copia() {
        return valor_papel_copia;
    }

    public void setValor_papel_copia(int valor_papel_copia) {
        this.valor_papel_copia = valor_papel_copia;
    }

    public int getCant_manila() {
        return cant_manila;
    }

    public void setCant_manila(int cant_manila) {
        this.cant_manila = cant_manila;
    }

    public int getValor_manila() {
        return valor_manila;
    }

    public void setValor_manila(int valor_manila) {
        this.valor_manila = valor_manila;
    }

    public int getCant_corte() {
        return cant_corte;
    }

    public void setCant_corte(int cant_corte) {
        this.cant_corte = cant_corte;
    }

    public int getValor_corte() {
        return valor_corte;
    }

    public void setValor_corte(int valor_corte) {
        this.valor_corte = valor_corte;
    }

    public String getPreprensa() {
        return preprensa;
    }

    public void setPreprensa(String preprensa) {
        this.preprensa = preprensa;
    }

    public int getCant_preprensa() {
        return cant_preprensa;
    }

    public void setCant_preprensa(int cant_preprensa) {
        this.cant_preprensa = cant_preprensa;
    }

    public int getValor_preprensa() {
        return valor_preprensa;
    }

    public void setValor_preprensa(int valor_preprensa) {
        this.valor_preprensa = valor_preprensa;
    }

    public String getTipo_plancha() {
        return tipo_plancha;
    }

    public void setTipo_plancha(String tipo_plancha) {
        this.tipo_plancha = tipo_plancha;
    }

    public int getCant_tipo_plancha() {
        return cant_tipo_plancha;
    }

    public void setCant_tipo_plancha(int cant_tipo_plancha) {
        this.cant_tipo_plancha = cant_tipo_plancha;
    }

    public int getValor_plancha() {
        return valor_plancha;
    }

    public void setValor_plancha(int valor_plancha) {
        this.valor_plancha = valor_plancha;
    }

    public String getTipo_impresion() {
        return tipo_impresion;
    }

    public void setTipo_impresion(String tipo_impresion) {
        this.tipo_impresion = tipo_impresion;
    }

    public int getCant_tipo_impresion() {
        return cant_tipo_impresion;
    }

    public void setCant_tipo_impresion(int cant_tipo_impresion) {
        this.cant_tipo_impresion = cant_tipo_impresion;
    }

    public int getValor_impresion() {
        return valor_impresion;
    }

    public void setValor_impresion(int valor_impresion) {
        this.valor_impresion = valor_impresion;
    }

    public int getCant_numeracion() {
        return cant_numeracion;
    }

    public void setCant_numeracion(int cant_numeracion) {
        this.cant_numeracion = cant_numeracion;
    }

    public int getValor_numeracion() {
        return valor_numeracion;
    }

    public void setValor_numeracion(int valor_numeracion) {
        this.valor_numeracion = valor_numeracion;
    }

    public int getCant_grafado() {
        return cant_grafado;
    }

    public void setCant_grafado(int cant_grafado) {
        this.cant_grafado = cant_grafado;
    }

    public int getValor_grafado() {
        return valor_grafado;
    }

    public void setValor_grafado(int valor_grafado) {
        this.valor_grafado = valor_grafado;
    }

    public int getCant_troquelado() {
        return cant_troquelado;
    }

    public void setCant_troquelado(int cant_troquelado) {
        this.cant_troquelado = cant_troquelado;
    }

    public int getValor_troquelado() {
        return valor_troquelado;
    }

    public void setValor_troquelado(int valor_troquelado) {
        this.valor_troquelado = valor_troquelado;
    }

    public int getCant_repujado() {
        return cant_repujado;
    }

    public void setCant_repujado(int cant_repujado) {
        this.cant_repujado = cant_repujado;
    }

    public int getValor_repujado() {
        return valor_repujado;
    }

    public void setValor_repujado(int valor_repujado) {
        this.valor_repujado = valor_repujado;
    }

    public int getCant_realzado() {
        return cant_realzado;
    }

    public void setCant_realzado(int cant_realzado) {
        this.cant_realzado = cant_realzado;
    }

    public int getValor_realzado() {
        return valor_realzado;
    }

    public void setValor_realzado(int valor_realzado) {
        this.valor_realzado = valor_realzado;
    }

    public int getCant_estampado() {
        return cant_estampado;
    }

    public void setCant_estampado(int cant_estampado) {
        this.cant_estampado = cant_estampado;
    }

    public int getValor_estampado() {
        return valor_estampado;
    }

    public void setValor_estampado(int valor_estampado) {
        this.valor_estampado = valor_estampado;
    }

    public int getCant_plegado() {
        return cant_plegado;
    }

    public void setCant_plegado(int cant_plegado) {
        this.cant_plegado = cant_plegado;
    }

    public int getValor_plegado() {
        return valor_plegado;
    }

    public void setValor_plegado(int valor_plegado) {
        this.valor_plegado = valor_plegado;
    }

    public int getCant_cosido() {
        return cant_cosido;
    }

    public void setCant_cosido(int cant_cosido) {
        this.cant_cosido = cant_cosido;
    }

    public int getValor_cosido() {
        return valor_cosido;
    }

    public void setValor_cosido(int valor_cosido) {
        this.valor_cosido = valor_cosido;
    }

    public int getCant_emblocado() {
        return cant_emblocado;
    }

    public void setCant_emblocado(int cant_emblocado) {
        this.cant_emblocado = cant_emblocado;
    }

    public int getValor_emblocado() {
        return valor_emblocado;
    }

    public void setValor_emblocado(int valor_emblocado) {
        this.valor_emblocado = valor_emblocado;
    }

    public int getCant_empacado() {
        return cant_empacado;
    }

    public void setCant_empacado(int cant_empacado) {
        this.cant_empacado = cant_empacado;
    }

    public int getValor_empacado() {
        return valor_empacado;
    }

    public void setValor_empacado(int valor_empacado) {
        this.valor_empacado = valor_empacado;
    }

    public int getCant_transporte() {
        return cant_transporte;
    }

    public void setCant_transporte(int cant_transporte) {
        this.cant_transporte = cant_transporte;
    }

    public int getValor_transporte() {
        return valor_transporte;
    }

    public void setValor_transporte(int valor_transporte) {
        this.valor_transporte = valor_transporte;
    }

    public int getCant_otros() {
        return cant_otros;
    }

    public void setCant_otros(int cant_otros) {
        this.cant_otros = cant_otros;
    }

    public int getValor_otros() {
        return valor_otros;
    }

    public void setValor_otros(int valor_otros) {
        this.valor_otros = valor_otros;
    }

    public String getTerminado() {
        return terminado;
    }

    public void setTerminado(String terminado) {
        this.terminado = terminado;
    }
    
    public int getCant_terminado() {
        return cant_terminado;
    }

    public void setCant_termiando(int cant_terminado) {
        this.cant_terminado = cant_terminado;
    }

    public int getValor_terminado() {
        return valor_terminado;
    }

    public void setValor_terminado(int valor_terminado) {
        this.valor_terminado = valor_terminado;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String registrar_cotizacionMdl(){
            try{
                con=objConexion.stringcon();
                //Connection conn=DriverManager.getConnection(url, "","");
                st=con.prepareStatement("{call Registrar_Cotizacion(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                st.setInt(1,id_cotizacion);
                st.setInt(2,id_cliente);
		st.setString(3,nombre_trabajo);
		st.setDate(4,fecha_cotizacion);
		st.setInt(5,cant_papel_original);
		st.setInt(6,valor_papel_original);
                st.setInt(7,cant_papel_copia);
		st.setInt(8,valor_papel_copia);
                st.setInt(9,cant_manila);
		st.setInt(10,valor_manila);
                st.setInt(11,cant_corte);
		st.setInt(12,valor_corte);
                st.setString(13,preprensa);
		st.setInt(14,cant_preprensa);
		st.setInt(15,cant_papel_original);
                st.setString(16,tipo_plancha);
		st.setInt(17,cant_tipo_plancha);
		st.setInt(18,valor_plancha);
                st.setString(19,tipo_impresion);
		st.setInt(20,cant_tipo_impresion);
		st.setInt(21,valor_impresion);
                st.setInt(22,cant_grafado);
		st.setInt(23,valor_grafado);
                st.setInt(24,cant_troquelado);
		st.setInt(25,valor_troquelado);
                st.setInt(26,cant_repujado);
		st.setInt(27,valor_repujado);
                st.setInt(28,cant_realzado);
		st.setInt(29,valor_realzado);
                st.setInt(30,cant_estampado);
		st.setInt(31,valor_estampado);
                st.setInt(32,cant_plegado);
		st.setInt(33,valor_plegado);
                st.setInt(34,cant_cosido);
		st.setInt(35,valor_cosido);
                st.setInt(36,cant_emblocado);
		st.setInt(37,valor_emblocado);
                st.setInt(38,cant_empacado);
		st.setInt(39,valor_empacado);
                st.setInt(40,cant_transporte);
		st.setInt(41,valor_transporte);
                st.setInt(42,cant_otros);
		st.setInt(43,valor_otros);
                st.setDouble(44,utilidad);
		st.setInt(45,estado);
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
    
    
    
}
   
    
    
    

