import java.util.ArrayList;

public class Undo {
    // 1. Crear una variable privada y estática que represente la única instancia del Singleton
    private static Undo instance;
    private ArrayList<String> list = new ArrayList<>();

    // 2. Crear un método público y estático que permita a las otras clases obtener la instancia del Singleton
    public static Undo getInstance() {
        // 3. Implementar el mecanismo de "lazy initialization"
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    public void add(String cmd){
        instance.list.add(cmd);
    }
    public void delete(String cmd){
        instance.list.removeIf(element -> element.equals(cmd));
    }
    public void show(){
        System.out.println(instance.list);
    }
    // Constructor privado para evitar que se instancien objetos de la clase desde otras clases
    private Undo() { }
}

