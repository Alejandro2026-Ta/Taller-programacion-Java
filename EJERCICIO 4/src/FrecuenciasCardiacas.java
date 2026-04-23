import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    // Constructor
    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();

        int edad = hoy.getYear() - anio;

        if (hoy.getMonthValue() < mes) {
            edad = edad - 1;
        } else if (hoy.getMonthValue() == mes && hoy.getDayOfMonth() < dia) {
            edad = edad - 1;
        }

        return edad;
    }

    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String frecuenciaEsperada() {
        int max = frecuenciaMaxima();

        double minimo = max * 0.50;
        double maximo = max * 0.85;

        return minimo + " - " + maximo + " pulsaciones por minuto";
    }
}