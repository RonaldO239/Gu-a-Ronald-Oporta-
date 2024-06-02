abstract class Empleado {
    private String nombre;
    private String numeroIdentificacion;

public Empleado(String nombre, String numeroIdentificacion){
    this.nombre = nombre;
    this.numeroIdentificacion = numeroIdentificacion;
}
public String getNombre(){
    return nombre;
}
public String getNumeroIdentificacion(){
    return numeroIdentificacion;
}
//metodo abtracto 
public abstract double calcularSalario();
}
