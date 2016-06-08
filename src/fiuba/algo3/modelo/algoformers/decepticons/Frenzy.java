package fiuba.algo3.modelo.algoformers.decepticons;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Casillero;
import fiuba.algo3.modelo.Decepticon;

/**
 * Created by Mariano on 07/06/2016.
 */
public class Frenzy extends Decepticon {

    public Frenzy(int puntosDeVida, Casillero posicion){

        super(puntosDeVida, posicion);
        //this.estado = new FrenzyAlterno();
    }

    @Override
    public void atacar(AlgoFormer algoformer){

    }
}
