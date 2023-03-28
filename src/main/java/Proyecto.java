import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    //Constructor
    public Proyecto(String nombre, String descripcion){
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    //Agregar empleados
    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
}
