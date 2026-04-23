import java.util.Scanner;

public class PruebaFrecuencias {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese dia de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese año de nacimiento: ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona =
                new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\n Resultados ");
        System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAnio());
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia máxima: " + persona.frecuenciaMaxima());
        System.out.println("Rango esperado: " + persona.frecuenciaEsperada());

        entrada.close();
    }
}