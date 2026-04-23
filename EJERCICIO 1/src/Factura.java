public class Factura{

    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;


    public Factura(String numeroPieza, String descripcion, int cantidad , double precio){

        this.numeroPieza=numeroPieza;
        this.descripcion=descripcion;

        if (cantidad > 0){
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
        if (precio > 0){
            this.precio = precio;
        }else {
            this.precio = 0.0;
        }
    }
    public String getNumeroPieza() {
        return numeroPieza;
    }
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if (cantidad > 0){
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }else {
            this.precio = 0.0;
        }
    }
    public double  MontoFactura(){
        double monto=precio*cantidad;
        return monto;
    }
}
