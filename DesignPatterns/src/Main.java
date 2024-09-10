public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();

        fila.setDocumento("Documento");
        Fila fila1 = Fila.getInstance();

        System.out.print(fila1.getDocumento());

    }
}