public class Main {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setEdad(23);
        persona.setNombre("alejandro");
        persona.setTelefono(123456789);
        System.out.println("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad()+" Telefono: "+persona.getTelefono());

    }
}

class Persona{
    private int edad,telefono;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}