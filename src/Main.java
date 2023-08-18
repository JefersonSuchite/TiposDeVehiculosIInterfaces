import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculos vehiculos = new Vehiculos();

        System.out.println("¿Qué tipo de vehículos quieres ver?");
        System.out.println("1. Terrestres");
        System.out.println("2. Aéreos");
        System.out.println("3. Marinos");
        System.out.println("4. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                vehiculos.mostrarTerrestres();
                break;
            case 2:
                vehiculos.mostrarAereos();
                break;
            case 3:
                vehiculos.mostrarMarinos();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
