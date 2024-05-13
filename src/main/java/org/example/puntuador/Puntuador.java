package org.example.puntuador;

import org.example.comprobador.ComprobadorContrasena;
import org.example.comprobador.IComprobadorContrasena;

import java.io.*;
import java.util.Properties;

public class Puntuador implements IPuntuador {

    private final IComprobadorContrasena comprobadorContrasena;
    private final int UMBRAL_DEFAULT = 8;

    private int umbral;

    private int seguridad = 0;


    public Puntuador() {
        this.comprobadorContrasena = new ComprobadorContrasena();
        Properties properties= new Properties();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("configuration.properties");
        try {
            properties.load(is);
            umbral = Integer.parseInt((String) properties.get("UMBRAL"));
        } catch (FileNotFoundException e) {
            umbral = UMBRAL_DEFAULT;
        } catch (IOException e) {
            umbral = UMBRAL_DEFAULT;
        }
    }

    @Override
    public boolean comprobarSeguridad(){
        return seguridad >= umbral;
    }

    @Override
    public void puntuarPassword(String password){
        comprobadorContrasena.setPassword(password);
        seguridad += comprobadorContrasena.comprobarCaracter();
        seguridad += comprobadorContrasena.comprobarLetra();
        seguridad += comprobadorContrasena.comprobarLogitud();
        seguridad += comprobadorContrasena.comprobarNumero();
    }

    @Override
    public int getSeguridad() {
        if (seguridad == 9)
            return 10;
        return seguridad;
    }
}
