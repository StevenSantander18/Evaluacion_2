import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getMarca() + " - $" + producto.getPrecio());
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        if (productos.isEmpty()) {
            return 0;
        }

        double sumaPrecios = 0;
        for (IProducto producto : productos) {
            sumaPrecios += producto.getPrecio();
        }
        return sumaPrecios / productos.size();
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) {
            return null;
        }

        IProducto productoMasCostoso = productos.get(0);
        for (IProducto producto : productos) {
            if (producto.getPrecio() > productoMasCostoso.getPrecio()) {
                productoMasCostoso = producto;
            }
        }
        return productoMasCostoso;
    }

    @Override
    public void quitarProducto(IProducto producto) {
        productos.remove(producto);
    }

    @Override
    public List<IProducto> obtenerProductos() {
        return productos;
    }

    // Método para buscar un producto por su nombre
    public boolean buscarProductoPorNombre(String nombre) {
        for (IProducto producto : productos) {
            if (producto.getNombre().contains(nombre)) {
                return true;
            }
        }
        return false;
    }
}
