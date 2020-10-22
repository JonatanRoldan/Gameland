
package url.modulo.login;

import url.controladorBD.Login;


public interface ValidarUsuario {
    boolean validardatos(String usuario, String contraseña);
    Login Getusuarioconfirmado();
}
