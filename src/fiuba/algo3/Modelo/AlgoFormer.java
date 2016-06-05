package fiuba.algo3.Modelo;

/**
 * Created by Mariano on 05/06/2016.
 */
public class AlgoFormer {

    private int puntosDeVida;
    private int velocidad;
    private int ataque;
    private int distanciaAtaque;
    private EstadoAlgoformer estado;

    public AlgoFormer(int puntosDeVida, int velocidad, int ataque, int distanciaAtaque, EstadoAlgoformer estado){

        this.puntosDeVida = puntosDeVida;
        this.velocidad = velocidad;
        this.ataque = ataque;
        this.distanciaAtaque = distanciaAtaque;
        this.estado = estado;
    }
}
