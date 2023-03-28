import java.util.ArrayList;

public class GerenteProyecto extends Empleado{
    private ArrayList<Proyecto> proyectosManejados = new ArrayList<>();

    //Constructor
    public GerenteProyecto(String nombre, String salario, String cargo){
        super(nombre, salario, cargo);
    }

    //Getter and Setter
    public ArrayList<Proyecto> getProyectosManejados() {
        return proyectosManejados;
    }
    private void setProyectosManejados(ArrayList<Proyecto> proyectosManejados) {
        this.proyectosManejados = proyectosManejados;
    }
}
