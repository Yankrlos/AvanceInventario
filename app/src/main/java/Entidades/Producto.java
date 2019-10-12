package Entidades;

public class Producto {

    private String Id;
    private String Nombre;
    private String Cantidad;
    private String FechaIngreso;
    private String Precio;

    public Producto(){

    }

    public Producto(String id, String n, String c, String fi, String p ){
        this.Id = id;
        this.Nombre = n;
        this.Cantidad = c;
        this.FechaIngreso = fi;
        this.Precio = p;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }
}
