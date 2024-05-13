package org.example.puntuador;

public interface IPuntuador {
    boolean comprobarSeguridad();

    void puntuarPassword(String password);

    int getSeguridad();
}
