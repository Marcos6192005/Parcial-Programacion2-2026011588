public class Vendedor extends Empleado {

    // Por defecto usa la ComisionEstandar
    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Venta total: $%.2f%n", ventasMes);
        System.out.printf("Comisión: $%.2f%n", comision);
    }
}
