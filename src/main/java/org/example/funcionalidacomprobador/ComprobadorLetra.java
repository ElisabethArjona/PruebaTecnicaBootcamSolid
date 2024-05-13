package org.example.funcionalidacomprobador;

public class ComprobadorLetra {
    public int comprobarLetra(String password) {
        int seguridad = 0;
        boolean mayus;
        boolean minus;

        mayus = password.matches(".*[A-Z].*");
        minus = password.matches(".*[a-z].*");

        if (mayus && minus) {
            seguridad += 2;
        }
        if ( minus || mayus) {
            seguridad +=1 ;
        }
        return seguridad;
    }
}
