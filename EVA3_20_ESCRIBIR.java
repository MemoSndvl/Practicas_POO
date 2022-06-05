import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Eva3_20_ESCRIBIR {
    public static void main(String[] args) {
        Path ruta = Paths.get("c:/Archivo/texto1.txt") 
                OutputStream abrirArchivo;
                OUtputStreamWriter escribirArh;
                BufferedWriter excribirtexto;
                try{
                abrirArchivo = Files.newOutputStream(ruta);
                escribirArh = new OutputStreamWriter(abrirArchivo);
                excribirtexto = new BufferedWriter(escribirArh);
                excribirtexto.write("Hola mundooo");
                excribirtexto.flush();
                excribirtexto.fush();
                excribirtexto.close();           
}  
                catch(IOException ex){
                ex.printStacktTrace;
            }
    }    
}