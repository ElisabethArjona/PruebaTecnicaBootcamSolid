package org.example.comprobador;

import org.example.funcionalidacomprobador.ComparadorCaracter;
import org.example.funcionalidacomprobador.ComprobadorLetra;
import org.example.funcionalidacomprobador.ComprobadorLongitud;
import org.example.funcionalidacomprobador.ComprobadorNumero;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ComprobadorContrasena implements IComprobadorContrasena{

    private final ComparadorCaracter comparadorCaracter;

    private final ComprobadorLetra comprobadorLetra;

    private final ComprobadorNumero comprobadorNumero;

    private final ComprobadorLongitud comprobadorLongitud;

    private String password;

    public ComprobadorContrasena() {
        this.comparadorCaracter = new ComparadorCaracter();
        this.comprobadorLetra = new ComprobadorLetra();
        this.comprobadorNumero = new ComprobadorNumero();
        this.comprobadorLongitud = new ComprobadorLongitud();
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public int comprobarLogitud() {
        return comprobadorLongitud.comprobarLongitud(password);
    }

    @Override
    public int comprobarNumero() {
        return comprobadorNumero.comprobarNumero(password);
    }

    @Override
    public int comprobarLetra() {
        return comprobadorLetra.comprobarLetra(password);
    }

    @Override
    public int comprobarCaracter() {
        return comparadorCaracter.comprobarCaracter(password);
    }
}
