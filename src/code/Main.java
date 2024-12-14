package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

//Clase para generar archivos .java usando las librerías JFlex.jar y Java_cup 
public class Main {
     public static void main(String[] args) throws Exception {
         // Usa el directorio actual como base
         String baseDir = System.getProperty("user.dir");
         
         //Construir las rutas relativas usando baseDir
         String ruta1 = Paths.get(baseDir, "src", "code", "Lexer.flex").toString();
         
         generar(ruta1);
         
     }

    private static void generar(String ruta1) throws IOException, Exception {
        File archivo;
        
        //Generación de archivos con FLEX usando rutas relativas
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        
    }
}
