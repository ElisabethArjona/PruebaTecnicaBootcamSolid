package org.example;

import org.example.services.GestorUsuario;

public class App 
{
    public static void main( String[] args )
    {
        GestorUsuario gestorUsuario = new GestorUsuario();
        gestorUsuario.introducirContrasena();
    }

}

