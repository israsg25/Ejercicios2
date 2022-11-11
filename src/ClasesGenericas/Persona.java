package ClasesGenericas;

public class Persona {
    private String nombre;
    private  int edad;
    private String sexo;
    private String direccion;

    public Persona(String  nombre, int edad, String Sexo, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Sexo;
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public String getDireccion(){
        return direccion;
    }
    @Override
    public String toString(){
        return "Nombre: "+ nombre +"\nEdad: "+edad+"\nSexo: "+sexo+"\nDireccion: "+direccion;
    }

}
