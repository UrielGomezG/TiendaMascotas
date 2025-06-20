import java.util.List;

public class Tienda {
    private List<Animal> inventario;

    public Tienda(List<Animal> inventario) {
        this.inventario = inventario;
    }
    public boolean venderAnimal(Cliente c, Animal a) {
        if (inventario.contains(a)) {
            if (c.getMascotas().contains(a)) {
             System.out.println("El cliente ya tiene este animal.");
            return false; 
            }
                 c.getMascotas().add(a);
            inventario.remove(a);
            System.out.println("Animal vendido");
            return true; 
        } else {
            System.out.println("Fijate que ese pokemon no esta");
            return false; 
        }
    }
    public void reabastecer(Animal a, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inventario.add(a); 
        }
        System.out.println("Se agrego la cantidad de " + cantidad + " todos estos animales de " + a.getNombre() + " al inventario.");
    }
}
