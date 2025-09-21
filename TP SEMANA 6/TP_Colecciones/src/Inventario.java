import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public boolean agregarProducto(Producto p){
        if(p==null || buscarProductoPorId(p.getId())!=null) return false;
        return productos.add(p);
    }
    public void listarProductos(){
        if(productos.isEmpty()){ System.out.println("Inventario vacío."); return; }
        productos.forEach(System.out::println);
    }
    public Producto buscarProductoPorId(String id){
        for(Producto p: productos) if(p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }
    public boolean eliminarProducto(String id){ return productos.removeIf(p->p.getId().equalsIgnoreCase(id)); }
    public boolean actualizarStock(String id, int nuevaCant){
        Producto p = buscarProductoPorId(id); if(p==null) return false; p.setCantidad(nuevaCant); return true;
    }
    public List<Producto> filtrarPorCategoria(CategoriaProducto c){
        List<Producto> out = new ArrayList<>(); for(Producto p: productos) if(p.getCategoria()==c) out.add(p); return out;
    }
    public int obtenerTotalStock(){ int t=0; for(Producto p: productos) t+=p.getCantidad(); return t; }
    public Producto obtenerProductoConMayorStock(){
        return productos.stream().max(Comparator.comparingInt(Producto::getCantidad)).orElse(null);
    }
    public List<Producto> filtrarProductosPorPrecio(double min, double max){
        List<Producto> out = new ArrayList<>();
        for(Producto p: productos) if(p.getPrecio()>=min && p.getPrecio()<=max) out.add(p); return out;
    }
    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto c: CategoriaProducto.values())
            System.out.println(c+" - "+c.getDescripcion());
    }
}