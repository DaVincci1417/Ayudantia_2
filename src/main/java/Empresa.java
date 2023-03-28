import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Proyecto> proyectos = new ArrayList<>();

    //Constructor
    public Empresa(){

    }

    //Agregar Empleados
    public void agregarEmpleados(String nombre, String salario, String cargo){
        if(cargo.equalsIgnoreCase("Desarrollador")){
            empleados.add(new Desarrollador(nombre, salario, cargo));
        }
        if(cargo.equalsIgnoreCase("Diseñador")){
            empleados.add(new Diseñador(nombre, salario, cargo));
        }
        if(cargo.equalsIgnoreCase("Gerente Proyecto")){
            empleados.add(new GerenteProyecto(nombre, salario, cargo));
        }
    }

    //Agregar Proyectos
    public void agregarProyecto(String nombre, String descripcion){
        proyectos.add(new Proyecto(nombre, descripcion));
    }

    //Asignar empleados a proyectos
    public void asignarEmpleadoParaProyecto(String nombreEmpleado, String nombreProyecto){
        if(buscarProyectoPorNombre(nombreProyecto) != null){
            if(buscarEmpleadoPorNombre(nombreEmpleado) != null){
                buscarProyectoPorNombre(nombreProyecto).agregarEmpleados(buscarEmpleadoPorNombre(nombreEmpleado));
            }else{
                System.out.println("No se ha encontrado el empleado.");
            }
        }else{
            System.out.println("No se ha encontrado el proyecto.");
        }
    }

    //Buscar empleados y proyectos por el nombre
    public Empleado buscarEmpleadoPorNombre(String nombreEmpleado){
        int posicion = -1;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equalsIgnoreCase(nombreEmpleado)){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return empleados.get(posicion);
        } else {
            return null;
        }
    }
    public Proyecto buscarProyectoPorNombre(String nombreProyecto){
        int posicion = -1;
        for (int i = 0; i < empleados.size(); i++) {
            if (proyectos.get(i).getNombre().equalsIgnoreCase(nombreProyecto)){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return proyectos.get(posicion);
        } else {
            return null;
        }
    }

    //Calcular salario total de los empleados
    public String calcularSalarioTotal(){
        if(empleados == null){
            return null;
        }
        int salarioTotal = 0;
        for(int i = 0; i < empleados.size(); i++){
            salarioTotal = salarioTotal + Integer.parseInt(empleados.get(i).getSalario());
        }
        return Integer.toString(salarioTotal);
    }
}
