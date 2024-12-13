package pio.daw.macj.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceCajamarca {
    private BasicPasswordEncryptor encriptadorContrasena;

    public PwServiceCajamarca(BasicPasswordEncryptor encriptadorContrasena){
        this.encriptadorContrasena=encriptadorContrasena;}

        public String encriptarContrasena(String contrasena) {
            return encriptadorContrasena.encryptPassword(contrasena);

        }
        public boolean verificarContrasena(String contrasena, String contrasenaEnctriptada){
            return encriptadorContrasena.checkPassword(contrasena, contrasenaEnctriptada);

        }
}

