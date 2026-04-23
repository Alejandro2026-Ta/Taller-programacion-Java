public class PruebaFactura {
    public static void main(String[] args) {

        Factura f= new Factura("MA001 Y MA822", "Martillo",2,12.5);

        System.out.println("Numero de piezas" + f.getNumeroPieza());
        System.out.println("Descripción: " + f.getDescripcion());
        System.out.println("Cantidad:" + f.getCantidad());
        System.out.println("Precio:  " + f.getPrecio());

        System.out.println("Valor a pagar:  " + f.MontoFactura());

    }

}