package org.example.services;

import org.example.comprobador.ComprobadorContrasena;
import org.example.comprobador.IComprobadorContrasena;
import org.example.puntuador.IPuntuador;
import org.example.puntuador.Puntuador;

public class GestorUsuario implements IGestorUsuario{

    private final IEntradaTeclado entradaTeclado;

    private final IPuntuador puntuador;



    public GestorUsuario(){
        this.entradaTeclado = new EntradaTeclado();
        this.puntuador = new Puntuador();
    }


    @Override
    public void introducirContrasena() {
        String password = entradaTeclado.requestString("Introduce la contraseña para analizar");

        puntuador.puntuarPassword(password);

        if(!puntuador.comprobarSeguridad()){
            String conf = entradaTeclado.requestString("Su nivel de fortaleza es: " + puntuador.getSeguridad() + ". ¿Está seguro de que quiere continuar? (S/N)");
            if ("S".equalsIgnoreCase(conf)){
                System.out.println("Contraseña aceptada");
            } else {
                System.out.println("Contraseña denegada");
            }
        } else {
            System.out.println("Su nivel de fortaleza es: " + puntuador.getSeguridad() + ". Contraseña aceptada.");
        }
    }
}
