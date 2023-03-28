import java.util.Random;
import java.util.Scanner;

public class Launcher {
    public static void main (String [] args){
        principal();
    }

    public static void principal(){
        Empresa empresa = new Empresa();
        Scanner leer = new Scanner(System.in);
        int opc = -1;
        do{
            menu();
            opc = leer.nextInt();
            seleccion(opc, empresa);
        }while (opc !=0);
        System.out.println("Ha Salido.");
        System.exit(0);
    }

    public static void menu(){
        System.out.println(
                "0. Salir." + "\n" +
                        "1. Agregar proyecto." + "\n" +
                        "2. Agregar empleado." + "\n" +
                        "3. Asignar empleado a un proyecto." + "\n" +
                        "4. Calcular dinero total de los salarios."
        );
    }

    public static void seleccion(int opc, Empresa empresa){
        Scanner leer = new Scanner(System.in);
        switch (opc) {
            case 0:
                break;
            case 1:
                try {
                    empresa.agregarProyecto("Nombre",
                            "Descripcion Generica"
                    );
                    System.out.println("Se ha ingresado el proyecto.");
                }catch (Exception e){
                    System.out.println("Ha ocurrio algo, intentelo de nuevo");
                }
                break;
            case 2:
                try {
                    empresa.agregarEmpleados("Nombre",
                            generarSalarioAleatorios(),
                            generarCargoAleatorio()
                    );
                    System.out.println("Se ha registrado el empleado.");
                }catch (Exception e){
                    System.out.println("Ha ocurrio algo, intentelo de nuevo");
                }
                break;
            case 3:
                try {
                    String nombreProyecto;
                    String nombreEmpleado;
                    System.out.println("Ingrese el nombre del proyecto que desea asignarle el empleado.");
                    nombreProyecto = leer.nextLine();
                    System.out.println("Ingrese el nombre del empleado.");
                    nombreEmpleado = leer.nextLine();
                    empresa.asignarEmpleadoParaProyecto(nombreEmpleado, nombreProyecto);
                    System.out.println("El empleado se ha asignado al proyecto.");
                }catch (Exception e){
                    System.out.println("Ha ocurrido algo, intentelo de nuevo.");
                }
                break;
            case 4:
                System.out.println(
                        "El dinero que se debe pagar en salario es: " + empresa.calcularSalarioTotal()
                );
                break;
            default:
                System.out.println("Agregue una opción valida");
        }

    }

    public static String generarSalarioAleatorios(){
        Random numero = new Random();
        String numeroAleatorio = "";
        for(int i = 0; i < 7; i++){
            numeroAleatorio = numeroAleatorio + Integer.toString(numero.nextInt(10));
        }
        return numeroAleatorio;
    }
    public static String generarCargoAleatorio(){
        Random numero = new Random();
        int numeroAleatorio = numero.nextInt(3);
        if(numeroAleatorio == 0){
            return "Desarrollador";
        }
        if(numeroAleatorio == 1){
            return "Diseñador";
        }
        if(numeroAleatorio == 2){
            return "Gerente Proyecto";
        }
        return null;
    }
}
