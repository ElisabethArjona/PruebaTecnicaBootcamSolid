package org.example.funcionalidacomprobador;

public class ComparadorCaracter{

    public int comprobarCaracter(String contrasena) {
        int seguridad = 0;
        if (contrasena.matches(".*[^a-zA-Z0-9].*")){
            seguridad = 2;
        }
        return seguridad;
    }
}
