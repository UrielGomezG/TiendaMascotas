import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        Animal perro1 = new Perro("LaNena", 2);
        Animal gato1 = new Gato("LaGatina", 1);

        List<Animal> inventario = new ArrayList<>();
        inventario.add(perro1);
        inventario.add(gato1);

        Tienda tienda = new Tienda(inventario);

        Cliente cliente = new Cliente("Juan");
        cliente.setMascotas(new ArrayList<>());

        tienda.venderAnimal(cliente, perro1);
        tienda.venderAnimal(cliente, gato1);

        System.out.println("Mascotas de " + cliente.getNombre() + ":");
        for (Animal a : cliente.getMascotas()) {
            System.out.println("Nombre: " + a.getNombre() + ", Edad: " + a.getEdad());
        }

    }
}
