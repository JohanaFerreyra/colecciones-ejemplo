package mascotapp;

import mascotapp.servicio.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {

        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.fabricaMascota(2);
        servMasc.mostrarMascotas();
        
        servMasc.actualizarMascota(0);
        servMasc.mostrarMascotas();
        
        servMasc.eliminarMascota(1);
        servMasc.mostrarMascotas();
    }

}
