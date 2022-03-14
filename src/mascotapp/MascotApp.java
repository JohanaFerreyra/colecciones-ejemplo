package mascotapp;

import mascotapp.servicio.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {

        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.crearMascota();
        servMasc.crearMascota();
        
        servMasc.mostrarMascotas();
        

    }

}
