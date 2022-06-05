import java.util.*;
class EVA2_14_FINAL {
    public static void main (String []args){
        class EstudiantePosgrado extends Persona{
        }
        final class Estudiante extends Persona{
            private string numeroControl;
            public Estudiante(){
            }
            public Estudiante (String numeroControl){
                this.numeroControl=numeroControl;
            }
            public Estudiante (String numeroControl, String Nombre){
                super(Nombre);
                this.numeroControl=numeroControl;
            }
          }   
    }
}