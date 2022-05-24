package com.bootcamp.strategy;

public class Teste {
    public static void main(String[] args) {
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
    }
}
