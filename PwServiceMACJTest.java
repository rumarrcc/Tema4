package pio.daw.macj.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceMACJTest {

    public static void main(String[] args) {
        PwServiceCajamarca servicio = new PwServiceCajamarca(new BasicPasswordEncryptor());
        String password = "miSuperPassword";
        String passwordEncriptada = servicio.encriptarContrasena(password);
        System.out.println("Prueba de alumno Cajamarca");
        System.out.println("La contrasena encriptada es: "+passwordEncriptada);


        //verificacion

        boolean contrasenaValida = servicio.verificarContrasena(password, passwordEncriptada);
        System.out.println("La contrasena es valida: " + contrasenaValida);



    }
}
