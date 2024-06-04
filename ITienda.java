import java.util.List;

public interface ITienda {
    void agregarProducto(IProducto producto);
    void listarProductos();
    double obtenerPromedioPrecioProductos();
    IProducto obtenerProductoMasCostoso();

    void quitarProducto(IProducto producto);

    List<IProducto> obtenerProductos();
}
