
public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado e1 =new Empleado("Alejandro", "Tayupanta",320.45);

        System.out.println("Nombre: "+ e1.getPrimerNombre());
        System.out.println("Apellido :" + e1.getApellidoPaterno());
        System.out.println("Salario: "+ e1.getSalario());
        System.out.println("Salario Anual :"+ e1.salarioAnual());

        e1.setSalario((e1.getSalario()+ (e1.getSalario()*0.1))*12);
        System.out.println("Salario Anual con Aumento del 10%: "+ e1.getSalario());

        Empleado e2 = new Empleado("Stefany","Rodriguez", 500);
        System.out.println("Nombre: "+ e2.getPrimerNombre());
        System.out.println("Apellido :" + e2.getApellidoPaterno());
        System.out.println("Salario: "+ e2.getSalario());

        e2.setSalario((e2.getSalario()+ (e2.getSalario()*0.1))*12);
        System.out.println("Salario Anual con Aumento del 10% :"+ e2.getSalario());

    }

}