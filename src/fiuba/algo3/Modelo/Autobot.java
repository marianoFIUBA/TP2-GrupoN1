package fiuba.algo3.modelo;

/**
 * Created by fedek on 5/6/2016.
 */
public abstract class Autobot extends AlgoFormer {

    public void recibirAtaqueDeAutobot(int ataque){
        //throw AutobotNoPuedeAtacarAAutobotException
    }

    public void recibirAtaqueDeDecepticon(int ataque){

        this.puntosDeVida -= ataque;
    }
//    public Autobot(int puntosDeVida, int velocidad, int ataque, int distanciaAtaque, int posicionX, int posicionY, EstadoAlgoformer estadoNuevo) {
//        super(puntosDeVida, velocidad, ataque, distanciaAtaque, posicionX, posicionY, estadoNuevo);
//    }
}
