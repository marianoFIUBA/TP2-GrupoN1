package fiuba.algo3.Modelo;

/**
 * Created by Mariano on 07/06/2016.
 */
public class MegatronHumanoide implements EstadoAlgoformer {

    private int ataque;
    private int distancia;
    private int velocidad;

    public void atacar(AlgoFormer algoformer){}

    public void moverA(Casillero casillero){}

    public EstadoAlgoformer cambiarEstado(){

        return new MegatronAlterno();
    }
}
