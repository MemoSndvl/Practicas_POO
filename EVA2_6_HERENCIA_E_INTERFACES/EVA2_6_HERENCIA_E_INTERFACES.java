import java.util.*;
public class EVA2_6_HERENCIA_E_INTERFACES {
    public static void main(String[] args) {
        public interface MuestraDatos {
            public void imprimirDatos();
        }
    }
    public class Persona {
        private String nombre;
        private int Edad;
        
        public Persona(){
        this.nombre = ("");
        this.Edad = 0;
    }
}
public class Estudiante extends Persona implements MuestraDatos {
    private String numeroControl;

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void imprimirDatos() {
        
    }
}
}