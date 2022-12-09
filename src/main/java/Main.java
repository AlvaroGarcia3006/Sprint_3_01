import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Menú:");
            System.out.println("1· Añadir comando");
            System.out.println("2· Eliminar comando");
            System.out.println("3· Listar comandos");
            System.out.println("0· Salir del proograma");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Introduzca comando");
                    Undo.getInstance().add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Introduzca comando");
                    Undo.getInstance().delete(sc.nextLine());
                    break;
                case 3:
                    Undo.getInstance().show();
                    break;
                default:
                    System.out.println("Escoja una opción válida");
                    break;

            }
        } while(option !=0);
    }
}