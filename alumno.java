public class alumno extends usuario{
    private String Sede;

    public alumno(String nombre, String apellido, String userName, String Password, String sede) {
        super(nombre, apellido, userName, Password);
        Sede = sede;
    }

    public alumno(String sede) {
        Sede = sede;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    
}
