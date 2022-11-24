package org.araujo.comodo;

public class Quarto extends Comodo {

    private static Quarto quarto = new Quarto();

    private Quarto() {}

    public static Quarto getInstancia() {
        return quarto;
    }
}
