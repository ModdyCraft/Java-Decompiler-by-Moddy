/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddydev.java.decompiler;

import java.io.*;

/**
 *
 * @author Moddy
 */
public class MetodosArchivos {
    
    public void crearArchivo(String archiveName){
        File a = new File(archiveName);
        
        PrintWriter pw;
        
        try {
            pw = new PrintWriter(a);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(String archiveName, String text, Boolean overWrite, Boolean separateLines){
        File a = new File(archiveName);
        boolean b = !overWrite;
        
        if (!separateLines){
            try {
                PrintWriter pw = new PrintWriter( new FileWriter(a,overWrite));
                pw.write(text);
                pw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
            try {
                BufferedWriter bw = new BufferedWriter( new FileWriter(a, true));
                bw.write(text);
                bw.newLine();
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public boolean crearCarpeta(String carpetName){
        File a = new File(carpetName);
        boolean f = false;
        if(!a.exists()){
            f = a.mkdirs();
        }
        return f;
    }
}
