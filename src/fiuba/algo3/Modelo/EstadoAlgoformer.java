package fiuba.algo3.Modelo;

/**
 * Created by Mariano on 05/06/2016.
 */
public interface EstadoAlgoformer {

    public void atacar(AlgoFormer algoFormer);
    public void moverA(Casillero casillero);
    public EstadoAlgoformer cambiarEstado();
}
