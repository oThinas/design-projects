package com.bootcamp.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author oThinas
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
