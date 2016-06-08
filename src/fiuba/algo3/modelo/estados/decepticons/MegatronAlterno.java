package fiuba.algo3.modelo.estados.decepticons;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Casillero;
import fiuba.algo3.modelo.EstadoAlgoformer;

/**
 * Created by Mariano on 07/06/2016.
 */
public class MegatronAlterno implements EstadoAlgoformer {

    private int ataque;
    private int distancia;
    private int velocidad;

    public void atacar(AlgoFormer algoformer){}

    public void moverA(Casillero casillero){}

    public EstadoAlgoformer cambiarEstado(){

        return new MegatronHumanoide();
    }
}
