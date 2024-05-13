package org.example.comprobador;

public interface IComprobadorContrasena {
    public int comprobarLogitud();
    public int comprobarNumero();
    public int comprobarLetra();
    public int comprobarCaracter();

    public void setPassword(String password);

}
