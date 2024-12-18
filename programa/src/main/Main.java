package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Clase para generar archivos .java usando las librerías JFlex.jar y Java_cup 
public class Main {
     public static void main(String[] args) throws Exception {
         // Usa el directorio actual como base
         String baseDir = System.getProperty("user.dir");
         
         //Construir las rutas relativas usando baseDir
         String ruta2 = Paths.get(baseDir, "src", "ParserLexer", "lexer.flex").toString();
         String[] rutaS = {
            "-parser", "parser", Paths.get(baseDir, "src", "ParserLexer", "parser.cup").toString()
        };
         
         // Llamada al método para generar los archivos
         generar(ruta2, rutaS);
         
     }

    private static void generar(String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        
        //Generación de archivos con FLEX usando rutas relativas
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        
        // Generación de archivos con CUP
        java_cup.Main.main(rutaS);
        
        // Rutas relativas para sym.java y Sintax.java
        Path baseDir = Paths.get(System.getProperty("user.dir"));
        Path rutaSym = baseDir.resolve("src/ParserLexer/sym.java");
        
        //Elimina archivos existentes antes de mover los archivos generados actualizados
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
            baseDir.resolve("sym.java"),
            rutaSym
        );

        Path rutaSin = baseDir.resolve("src/ParserLexer/parser.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
            baseDir.resolve("parser.java"),
            rutaSin
        );
    }
}