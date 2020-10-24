/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta2;

/**
 *
 * @author Fredy
 */
public class FachadaMensaje {
    private CabeceraMensaje cabecera;
    private CuerpoMensaje cuerpo;
    private DocumentoAdjunto da;
    private Mensaje me;
    
    public FachadaMensaje(){
        cabecera = new CabeceraMensaje();
        cuerpo= new CuerpoMensaje();
        da = new DocumentoAdjunto();
        me = new Mensaje();
        
    }
    public Mensaje CrearMensaje(String asunto, String para, String archi, String text ){
        cabecera.setAsunto(asunto);
        cabecera.setPara(para);
        da.setArchivo(archi);
        cuerpo.setDoc(da);
        cuerpo.setTexto(text);
        me.setCabecera(cabecera);
        me.setCuerpo(cuerpo);
        return me;
    }
}
