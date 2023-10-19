package app;

public class Producto {
    
    private String codigo;
    private String nombre;
    private float precio;
    private int stock;
    private Producto sgte;

    public Producto(Producto producto) {
        codigo = producto.getCodigo();
        nombre = producto.getNombre();
        precio = producto.getPrecio();
        stock = producto.getStock();
        sgte = null;
    }
    
    public Producto(String codigo, String nombre, float precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        sgte = null;
    }

    public Producto(String codigo, String nombre, float precio, int stock, Producto sgte) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.sgte = sgte;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto getSgte() {
        return sgte;
    }

    public void setSgte(Producto sgte) {
        this.sgte = sgte;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", sgte=" + sgte + '}';
    }
    
}
