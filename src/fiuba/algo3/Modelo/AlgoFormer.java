package fiuba.algo3.Modelo;

public abstract class AlgoFormer {

    private Casillero posicion;
    private int puntosDeVida;

    private EstadoAlgoformer estado;

    public AlgoFormer(int puntosDeVida, Casillero posicion ) {

        this.puntosDeVida = puntosDeVida;
        this.posicion = posicion;
    }

    public Casillero getPosicion() {
        return posicion;
    }

    public abstract void moverAcasillero(Casillero casillero);

    public abstract void atacar(AlgoFormer algoformer);

//    public void moverAcasillero(Casillero casillero) {
//
//        if (estaEnRango(casillero, this.velocidad)) {
//            this.posicion = casillero;
//        }
//
//    }



    private boolean estaEnRango(Casillero casillero, int distancia) {

        boolean estaEnRango;
        int distanciaX;
        int distanciaY;

        distanciaX = Math.abs(posicion.getX() - casillero.getX());
        distanciaY = Math.abs(posicion.getY() - casillero.getY());

        estaEnRango = ((distanciaX <= distancia) && (distanciaY <= distancia));

        return estaEnRango;

    }


}
