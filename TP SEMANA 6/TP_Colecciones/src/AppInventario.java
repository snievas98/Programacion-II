public class AppInventario {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.agregarProducto(new Producto("P001","Arroz",1200,30,CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002","Remera",3500,15,CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P003","Licuadora",28000,5,CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P004","Toallas",4200,20,CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005","Yerba",2500,40,CategoriaProducto.ALIMENTOS));

        System.out.println("== Listado completo ==");
        inv.listarProductos();

        System.out.println("\n== Buscar P003 ==");
        System.out.println(inv.buscarProductoPorId("P003"));

        System.out.println("\n== Filtrar ALIMENTOS ==");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(System.out::println);

        System.out.println("\n== Eliminar P002 ==");
        System.out.println("Eliminado: " + inv.eliminarProducto("P002"));
        inv.listarProductos();

        System.out.println("\n== Actualizar stock P005 a 55 ==");
        inv.actualizarStock("P005", 55);
        System.out.println(inv.buscarProductoPorId("P005"));

        System.out.println("\n== Total unidades en stock ==");
        System.out.println(inv.obtenerTotalStock());

        System.out.println("\n== Producto con mayor stock ==");
        System.out.println(inv.obtenerProductoConMayorStock());

        System.out.println("\n== Productos entre $1000 y $3000 ==");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(System.out::println);

        System.out.println("\n== Categorías disponibles ==");
        inv.mostrarCategoriasDisponibles();
    }
}