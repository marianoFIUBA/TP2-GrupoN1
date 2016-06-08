package fiuba.algo3.modelo;

public abstract class AlgoFormer {

    protected Casillero posicion;
    protected int puntosDeVida;

    protected EstadoAlgoformer estado;

    public AlgoFormer(int puntosDeVida, Casillero posicion ) {

        this.puntosDeVida = puntosDeVida;
        this.posicion = posicion;
    }

    public Casillero getPosicion() {
        return posicion;
    }

    public abstract void moverAcasillero(Casillero casillero);

    public abstract void atacar(AlgoFormer algoformer);

    public void cambiarEstado(){

        this.estado.cambiarEstado();
    }

//    public void moverAcasillero(Casillero casillero) {
//
//        if (estaEnRango(casillero, this.velocidad)) {
//            this.posicion = casillero;
//        }
//
//    }



    protected boolean estaEnRango(Casillero casillero, int distancia) {

        boolean estaEnRango;
        int distanciaX;
        int distanciaY;

        distanciaX = Math.abs(posicion.getX() - casillero.getX());
        distanciaY = Math.abs(posicion.getY() - casillero.getY());

        estaEnRango = ((distanciaX <= distancia) && (distanciaY <= distancia));

        return estaEnRango;

    }


}
