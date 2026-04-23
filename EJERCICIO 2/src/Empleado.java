public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;

    public Empleado(String primerNombre, String apellidoPaterno, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }
    public double  salarioAnual() {
        return salario *12;
    }
}
