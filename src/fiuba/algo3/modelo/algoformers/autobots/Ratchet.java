package fiuba.algo3.modelo.algoformers.autobots;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Autobot;
import fiuba.algo3.modelo.Casillero;

/**
 * Created by Mariano on 07/06/2016.
 */
public class Ratchet extends Autobot {

    public Ratchet(int puntosDeVida, Casillero posicion){

        super(puntosDeVida, posicion);
        //this.estado = new RatchetHumanoide();
    }

    @Override
    public void atacar(AlgoFormer algoformer){

    }
}
