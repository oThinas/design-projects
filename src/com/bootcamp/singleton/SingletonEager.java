package com.bootcamp.singleton;

/**
 * Singleton "apressado"
 * 
 * @author oThinas
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
