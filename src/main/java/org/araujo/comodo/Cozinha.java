package org.araujo.comodo;

public class Cozinha extends Comodo {

    private static Cozinha cozinha = new Cozinha();

    private Cozinha() {}

    public static Cozinha getInstancia() {
        return cozinha;
    }
}
