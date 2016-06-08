package fiuba.algo3.modelo.algoformers.autobots;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Autobot;
import fiuba.algo3.modelo.Casillero;
import fiuba.algo3.modelo.estados.autobots.OptimusHumanoide;

/**
 * Created by Mariano on 07/06/2016.
 */
public class Optimus extends Autobot {

    public Optimus(int puntosDeVida, Casillero posicion){

        super(puntosDeVida, posicion);
        this.estado = new OptimusHumanoide();
    }

    @Override
    public void moverAcasillero(Casillero casillero){

    }

    @Override
    public void atacar(AlgoFormer algoformer){

    }
}


