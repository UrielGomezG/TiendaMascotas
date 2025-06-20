import java.util.List;

public class Cliente {
    public String nombre;
    List<Animal> mascotas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.mascotas = mascotas;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Animal> getMascotas() {
        return mascotas;
    }
    public void setMascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }  
}
