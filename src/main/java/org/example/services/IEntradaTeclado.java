package org.example.services;

public interface IEntradaTeclado {

    public String requestString(String cad);

    public char requestChar(String cad);

    public int requestInt(String cadena);

    public float requestFloat(String cadena);

    public double requestDouble(String cadena);

    public long requestLong(String cadena);

    public int requestAge(String cadena);

    public boolean continuar();

    public boolean requestBoolean(String cadena);
}
