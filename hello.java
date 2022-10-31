/**
 * hello
 */

public class hello {

    public static void main(String[] args) {

        alumno alumno1 = new alumno("Carlos", "Gomez", "cgomez", "1234", "Arequipa"); 
        System.out.println(alumno1.getNombre());

        /* 
        usuario user = new usuario("Victor", "Lliuya", "vlliuyav", "1234");
        System.out.println("Nombre: "+user.getNombre());
        System.out.println("Apellido: "+user.getApellido());
        System.out.println("User Name:"+user.getUserName());
        System.out.println("Contraseña:"+user.getPassword());
        System.out.println("");
        System.out.println("Cambio de contraseña: ");
        user.setPassword("hola123");
        System.out.println("Se ha realizado el cambio de la contraseña");
        System.out.println("Contrseña nueva: "+user.getPassword());

        user.cerrar_sesion();
        

        usuario user = new usuario();
        user.setNombre("Certus");
        user.setApellido("SLJ");
        user.setUserName("certus123");
        user.setPassword("12345678");

        System.out.println(user.getNombre()+ " "+user.getApellido());
        */
    }
}