
public class Fila {
    public static Fila instancia;
    private String Documento;

    public String getDocumento(){
        return Documento;
    }

    public void setDocumento(String documento){
        Documento = documento;
    }

    public static Fila getInstance(){
        if(instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento(String documento){
    }

    public void RemoveDocumento(){
    }

    public void RemoveTodosDocumentos(){
    }
    
}