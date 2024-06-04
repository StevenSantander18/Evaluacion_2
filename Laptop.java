public class Laptop implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int ram;

    public Laptop(String nombre, String marca, double precio, int ram) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void imprimeDetallesProducto() {
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return nombre; // El nombre de la laptop se considera su modelo
    }
}