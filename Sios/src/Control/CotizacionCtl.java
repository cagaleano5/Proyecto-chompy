package Control;
import Modelo.Cliente;
import Modelo.Cotizacion;
import java.sql.Date;
import java.sql.ResultSet;
public class CotizacionCtl {
    Cotizacion objRegistrar_Cotizacion=new Cotizacion();
    public String registrar_cotizacionCtl(int idcliente, String trabajo, int cant_p_orig, int val_p_orig, int cant_p_copia, int val_p_copia,
            int cant_manila, int val_manila, int cant_corte, int val_corte, String preprensa, int cant_preprensa, int val_preprensa,
            String plancha, int cant_plancha, int val_plancha, String impresion, int cant_impresion, int val_impresion, int cant_numeracion, int val_numeracion,
            int cant_grafado, int val_grafado, int cant_troquel, int val_troquel, int cant_repujado, int val_repujado, int cant_realzado, int val_realzado,
            int cant_estampado, int val_estampado, int cant_plegado, int val_plegado, int cant_cosido, int val_cosido, int cant_emblocado, int val_emblocado,
            int cant_empacado, int val_empacado, int cant_trans, int val_trans, int cant_otros, int val_otros, String terminado, int cant_terminado, int val_terminado,
            double utilidad, int estado){
//        objRegistrar_Cotizacion.setId_cotizacion(idcotizacion);
        objRegistrar_Cotizacion.setId_cliente(idcliente);
        objRegistrar_Cotizacion.setNombre_trabajo(trabajo);
//        objRegistrar_Cotizacion.setFecha_cotizacion(fecha);
        objRegistrar_Cotizacion.setCant_papel_original(cant_p_orig);
        objRegistrar_Cotizacion.setValor_papel_original(val_p_orig);
        objRegistrar_Cotizacion.setCant_papel_copia(cant_p_copia);
        objRegistrar_Cotizacion.setValor_papel_copia(val_p_copia);
        objRegistrar_Cotizacion.setCant_manila(cant_manila);
        objRegistrar_Cotizacion.setValor_manila(val_manila);
        objRegistrar_Cotizacion.setCant_corte(cant_corte);
        objRegistrar_Cotizacion.setValor_corte(val_corte);
        objRegistrar_Cotizacion.setPreprensa(preprensa);
        objRegistrar_Cotizacion.setCant_preprensa(cant_preprensa);
        objRegistrar_Cotizacion.setValor_preprensa(val_preprensa);
        objRegistrar_Cotizacion.setTipo_plancha(plancha);
        objRegistrar_Cotizacion.setCant_tipo_plancha(cant_plancha);
        objRegistrar_Cotizacion.setValor_plancha(val_plancha);
        objRegistrar_Cotizacion.setTipo_impresion(impresion);
        objRegistrar_Cotizacion.setCant_tipo_impresion(cant_impresion);
        objRegistrar_Cotizacion.setValor_impresion(val_impresion);
        objRegistrar_Cotizacion.setCant_numeracion(cant_numeracion);
        objRegistrar_Cotizacion.setValor_numeracion(val_numeracion);
        objRegistrar_Cotizacion.setCant_grafado(cant_grafado);
        objRegistrar_Cotizacion.setValor_grafado(val_grafado);
        objRegistrar_Cotizacion.setCant_troquelado(cant_troquel);
        objRegistrar_Cotizacion.setValor_troquelado(val_troquel);
        objRegistrar_Cotizacion.setCant_repujado(cant_repujado);
        objRegistrar_Cotizacion.setValor_repujado(val_repujado);
        objRegistrar_Cotizacion.setCant_realzado(cant_realzado);
        objRegistrar_Cotizacion.setValor_realzado(val_realzado);
        objRegistrar_Cotizacion.setCant_estampado(cant_estampado);
        objRegistrar_Cotizacion.setValor_estampado(val_estampado);
        objRegistrar_Cotizacion.setCant_plegado(cant_plegado);
        objRegistrar_Cotizacion.setValor_plegado(val_plegado);
        objRegistrar_Cotizacion.setCant_cosido(cant_cosido);
        objRegistrar_Cotizacion.setValor_cosido(val_cosido);
        objRegistrar_Cotizacion.setCant_emblocado(cant_emblocado);
        objRegistrar_Cotizacion.setValor_emblocado(val_emblocado);
        objRegistrar_Cotizacion.setCant_empacado(cant_empacado);
        objRegistrar_Cotizacion.setValor_empacado(val_empacado);
        objRegistrar_Cotizacion.setCant_transporte(cant_trans);
        objRegistrar_Cotizacion.setValor_transporte(val_trans);
        objRegistrar_Cotizacion.setCant_otros(cant_otros);
        objRegistrar_Cotizacion.setValor_otros(val_otros);
        objRegistrar_Cotizacion.setTerminado(terminado);
        objRegistrar_Cotizacion.setCant_termiando(cant_terminado);
        objRegistrar_Cotizacion.setValor_terminado(val_terminado);
        objRegistrar_Cotizacion.setUtilidad(utilidad);
        objRegistrar_Cotizacion.setEstado(estado);
        return objRegistrar_Cotizacion.registrar_cotizacionMdl();
    }
    Cotizacion objBuscar_Cotizacion=new Cotizacion();
    public ResultSet buscar_cotizacionCtl(int id ){
        //objBuscar_Cliente.setId_cliente(id);
        return objBuscar_Cotizacion.objBuscar_Cotizacion(id);
    }
    Cotizacion objEliminar_Cotizacion=new Cotizacion();
    public String eliminar_cotizacionCtl(int id ){
        //objBuscar_Cliente.setId_cliente(id);
        return objBuscar_Cotizacion.objEliminar_Cotizacion(id);
    }
    
    
    
}
