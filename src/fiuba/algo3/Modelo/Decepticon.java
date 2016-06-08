package fiuba.algo3.modelo;

/**
 * Created by fedek on 5/6/2016.
 */
public abstract class Decepticon extends AlgoFormer {

    public void recibirAtaqueDeAutobot(int ataque){

        this.puntosDeVida -= ataque;
        //this.verificarDanios()
    }

    public void recibirAtaqueDeDecepticon(int ataque){

        //throw DecepticonNoPuedeAtacarADecepticonException
    }

//    public Decepticon(int puntosDeVida, int velocidad, int ataque, int distanciaAtaque, int posicionX, int posicionY, EstadoAlgoformer estadoNuevo) {
//        super(puntosDeVida, velocidad, ataque, distanciaAtaque, posicionX, posicionY, estadoNuevo);
//    }
}
