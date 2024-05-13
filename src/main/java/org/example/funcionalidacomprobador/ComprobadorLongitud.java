package org.example.funcionalidacomprobador;

public class ComprobadorLongitud{
    public int comprobarLongitud(String password) {
        int seguridad = 0;

        if (password.length() > 12){
            seguridad = 3;
        } else if(password.length() >= 9) {
            seguridad = 2;
        } else if (password.length() > 6) {
            seguridad = 1;
        }

        return seguridad;
    }
}
