package org.araujo.comodo;

public class Banheiro extends Comodo {

    private static Banheiro banheiro = new Banheiro();

    private Banheiro() {}

    public static Banheiro getInstancia() {
        return banheiro;
    }
}
