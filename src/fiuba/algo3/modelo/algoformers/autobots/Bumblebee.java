package fiuba.algo3.modelo.algoformers.autobots;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Autobot;
import fiuba.algo3.modelo.Casillero;
import fiuba.algo3.modelo.estados.autobots.BumblebeeAlterno;

/**
 * Created by Mariano on 07/06/2016.
 */
public class Bumblebee extends Autobot {

    public Bumblebee(int puntosDeVida, Casillero posicion){

        super(puntosDeVida, posicion);
        this.estado = new BumblebeeAlterno();
    }

    @Override
    public void moverAcasillero(Casillero casillero){

    }

    @Override
    public void atacar(AlgoFormer algoformer){

    }

}
