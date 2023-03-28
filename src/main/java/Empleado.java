public abstract class Empleado {
    private String nombre;
    private String salario;
    private String cargo;

    //Constructor
    public Empleado(String nombre, String salario, String cargo){
        setNombre(nombre);
        setSalario(salario);
        setCargo(cargo);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setSalario(String salario) {
        this.salario = salario;
    }
    private void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
