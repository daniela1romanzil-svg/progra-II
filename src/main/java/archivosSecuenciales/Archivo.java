/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivosSecuenciales;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Archivo {
    private List<String> contenido;
    //constructor

    public Archivo() {
        contenido =new ArrayList<>();
    }
    //metodos
    public void crearArchivo(){
        Path path=Paths.get("E:\\Documentos INCOS\\PROGRAMACION II\\archivos2SISAD2026\\src\\main\\java\\archivosSecuenciales");
    }
    
}
