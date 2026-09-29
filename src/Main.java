public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Marcos Armando Vasquez Gonzalez", 1000.00);
        System.out.println("=== Reporte de comisión ===");
        vendedor.mostrarDetalle();
    }
}
