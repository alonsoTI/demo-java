
public class usuario {
    private String nombre;
    private String apellido;
    private String userName;
    private String password;

    public usuario(String nombre, String apellido, String userName, String Password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.password = Password;
    }

    public usuario(){
        System.out.println("Objeto usuario creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void cerrar_sesion(){
        System.out.println("Se cierra la sesión");
    }

}
