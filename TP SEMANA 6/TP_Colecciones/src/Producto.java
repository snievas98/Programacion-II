public class Producto {
    private String id, nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
        this.id=id; this.nombre=nombre; setPrecio(precio); setCantidad(cantidad); this.categoria=categoria;
    }
    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public double getPrecio(){ return precio; }
    public int getCantidad(){ return cantidad; }
    public CategoriaProducto getCategoria(){ return categoria; }
    public void setPrecio(double p){ this.precio = Math.max(0, p); }
    public void setCantidad(int c){ this.cantidad = Math.max(0, c); }
    @Override public String toString(){
        return "Producto{id='"+id+"', nombre='"+nombre+"', precio="+precio+", cantidad="+cantidad+
               ", categoria="+categoria+" ("+categoria.getDescripcion()+")}";
    }
}