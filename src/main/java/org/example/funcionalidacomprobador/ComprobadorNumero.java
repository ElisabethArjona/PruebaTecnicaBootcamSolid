package org.example.funcionalidacomprobador;

public class ComprobadorNumero {
    public int comprobarNumero(String password) {
        int seguridad = 0;
        if (password.matches(".*[0-9].*")){
            seguridad = 1;
        }
        return seguridad;
    }
}
