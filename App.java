public class App {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoMedioTiempo("Juan Perez", null, 0, 0)
        empleados[1] = new EmpleadoMedioTiempo("Maria Lopez", null, 0, 0)

        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());

        }
    
    }
}
