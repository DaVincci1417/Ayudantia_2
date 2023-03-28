import java.util.ArrayList;

public class Desarrollador extends Empleado{
    private ArrayList<String> lengProgramacionDominados = new ArrayList<>();

    //Constructor
    public Desarrollador(String nombre, String salario, String cargo){
        super(nombre, salario, cargo);
    }

    //Getter and Setter
    public ArrayList<String> getLengProgramacionDominados() {
        return lengProgramacionDominados;
    }
    private void setLengProgramacionDominados(ArrayList<String> lengProgramacionDominados) {
        this.lengProgramacionDominados = lengProgramacionDominados;
    }
}
