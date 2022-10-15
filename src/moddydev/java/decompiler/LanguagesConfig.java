/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddydev.java.decompiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Moddy
 */
public class LanguagesConfig {
    
    public ArrayList<String> languges(){
        ArrayList<String> l = new ArrayList<>();
        l.add("es");
        return l;
    }
    
    public String sL(String l, String k){
        Map<String, Map> languages = new HashMap<>();
        
        // Español //
        Map<String, String> es = new HashMap<>();
        
        // Menu
        es.put("File", "File");
        es.put("New","Nuevo");
        es.put("Clear Log", "Borrar registro");
        es.put("About", "Acerca de");
        es.put("Exit", "Salir");
        
        // Labels
        es.put("Route", "Ruta de acceso");
        es.put("Folder with files", "Carpeta con Archivos");
        es.put("Destination folder", "Carpeta de Destino");
        es.put("Output", "Salida");
        
        // Buttons
        es.put("Generate Command", "Generar Comando");
        es.put("Generate File", "Generar Archivo");
        es.put("EXECUTE", "EJECUTAR");
        es.put("Copy", "Copiar");
        
        languages.put("es", es);
        
        
        
        Map<String, String> legungageSelected = languages.get(l);
        String valor = legungageSelected.get(k);
        return valor;
    }
}
