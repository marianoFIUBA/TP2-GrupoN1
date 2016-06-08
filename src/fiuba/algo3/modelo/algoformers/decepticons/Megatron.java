package fiuba.algo3.modelo.algoformers.decepticons;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Casillero;
import fiuba.algo3.modelo.Decepticon;
import fiuba.algo3.modelo.estados.decepticons.MegatronHumanoide;

/**
 * Created by Mariano on 07/06/2016.
 */
public class Megatron extends Decepticon {

    public Megatron(int puntosDeVida, Casillero posicion){

        super(puntosDeVida, posicion);
        this.estado = new MegatronHumanoide();
    }

    @Override
    public void moverAcasillero(Casillero casillero){


    }

    @Override
    public void atacar(AlgoFormer algoformer){

    }
}
