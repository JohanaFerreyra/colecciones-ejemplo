package mascotapp.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.println("Introducir nombre");
        String nombre = leer.next();

        System.out.println("Introducir apodo");
        String apodo = leer.next();

        System.out.println("Introducir tipo");
        String tipo = leer.next();

        Mascota m = new Mascota(nombre, apodo, tipo);

    //    mascotas.add(m);

        return m;
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista Mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());

    }

    /**
     * Crea Mascotas, todos chiquitos
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la
     * lista
     */
    public void fabricaChiquitos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));

        }
    }

    /**
     * Crear mascota pidiendo datos por teclado
     *
     * @param cantidad
     */
    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotacreada = crearMascota();

            agregarMascota(mascotacreada);

            System.out.println(mascotacreada.toString());

        }
    }

//    //TODO Añadir Try and Catch 
//    public void actualizarMascota(int index){
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//    }
//    
    public void actualizarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("----Actualizar-----");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al actualizar, El indice es erroneo");
        }
    }

    public void eliminarMascota(int index) {
        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar, El indice es erroneo");
        }
    }

}
