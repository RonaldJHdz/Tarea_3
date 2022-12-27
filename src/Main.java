public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        persona.setNombre("Ronaldo");
        persona.setTelefono(123456);
        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int tel = persona.getTelefono();
        System.out.printf("%s %d %d",nombre, edad, tel);

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}