import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utilidades.UtilidadesPartidos;
import utilidades.UtilidadesPronosticos;

public class main {

    public static void main(String[] args) {
        // Verifica que se hayan pasado los argumentos necesarios
        if (args.length != 2) {
            System.out.println("Uso: java Main [archivo de partidos] [archivo de pronósticos]");
            return;
        }

        // Obtiene las rutas de los archivos de partidos y pronósticos
        String partidosPath = args[0];
        String pronosticosPath = args[1];

        // Carga los partidos y los pronósticos
        List<String> partidosString;
        List<String> pronosticosString;
        try {
            partidosString = Files.readAllLines(new File(partidosPath).toPath());
            pronosticosString = Files.readAllLines(new File(pronosticosPath).toPath());
        } catch (IOException e) {
            System.out.println("Error al cargar archivos: " + e.getMessage());
            return;
        }

        // Instancia los objetos de las clases correspondientes
        List<ResultadoPartido> partidos = utilidades.parsearLineas(partidosString);
        List<Pronostico> pronosticos = utilidades.parsearLineas(pronosticosString);

        // Verifica que haya la misma cantidad de partidos y pronósticos
        if (partidos.size() != pronosticos.size()) {
            System.out.println("La cantidad de partidos y pronósticos no coincide");
            return;
        }

      

        
       
            }
        
        
        
        
    }
}