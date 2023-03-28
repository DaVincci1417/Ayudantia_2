import java.util.ArrayList;

public class Diseñador extends Empleado{
    private ArrayList<String> herrramientasDiseñoDominadas = new ArrayList<>();

    //Constructor
    public Diseñador(String nombre, String salario, String cargo){
        super(nombre, salario, cargo);
    }

    //Getter and Setter
    public ArrayList<String> getHerrramientasDiseñoDominadas() {
        return herrramientasDiseñoDominadas;
    }
    private void setHerrramientasDiseñoDominadas(ArrayList<String> herrramientasDiseñoDominadas) {
        this.herrramientasDiseñoDominadas = herrramientasDiseñoDominadas;
    }
}
