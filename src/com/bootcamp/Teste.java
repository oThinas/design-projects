package com.bootcamp;

import com.bootcamp.facade.Facade;
import com.bootcamp.singleton.SingletonEager;
import com.bootcamp.singleton.SingletonLazy;
import com.bootcamp.singleton.SingletonLazyHolder;
import com.bootcamp.strategy.ComportamentoAgressivo;
import com.bootcamp.strategy.ComportamentoDefensivo;
import com.bootcamp.strategy.ComportamentoNormal;
import com.bootcamp.strategy.IComportamento;
import com.bootcamp.strategy.Robo;

public class Teste {
    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy
        IComportamento normal = new ComportamentoNormal();
        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Thinas", "01153-000");
    }
}