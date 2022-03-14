package mascotapp.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {
        
    private Scanner leer;
    private List<String> mascotas;
   
    
    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    
    public void crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;  
        
       mascotas.add(mascota);
        
    }
    
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la lista Mascotas son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad = " + mascotas.size());
        
    }
    
    
    
    
}
