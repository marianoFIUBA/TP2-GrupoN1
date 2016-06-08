package fiuba.algo3.modelo;

/**
 * Created by Mariano on 05/06/2016.
 */
public interface EstadoAlgoformer {

    public void atacar(AlgoFormer algoFormer);
    public void moverA(Casillero casillero);
    public EstadoAlgoformer cambiarEstado();
}
