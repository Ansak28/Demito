package pregunta2;

public class ClientEmail {
    
    public static void main(String[] args) {
        FachadaMensaje fm = new FachadaMensaje();
        
        Seguridad sec = new Seguridad();
        String msgEnciptado = sec.Encriptar(fm.CrearMensaje("Examen", "hninaha@ulima.edu.pe", "examen.docx", "Urgente desarrollo"));
        SMTPService smtp = new SMTPService();
        smtp.enviarMail(msgEnciptado);        
    }
 
    
}   
