package fiuba.algo3.Modelo;

public class AlgoFormer {

    private Casillero posicion;
    private int puntosDeVida;
    private int velocidad;
    private int ataque;
    private int distanciaAtaque;
    private EstadoAlgoformer estado;

    public AlgoFormer(int puntosDeVida, int velocidad, int ataque, int distanciaAtaque,int posicionX, int posicionY, EstadoAlgoformer estadoNuevo) {

        this.puntosDeVida = puntosDeVida;
        this.velocidad = velocidad;
        this.ataque = ataque;
        this.distanciaAtaque = distanciaAtaque;
        this.posicion = new Casillero(posicionX,posicionY);
        this.estado = estadoNuevo;
    }

    public Casillero getPosicion() {
        return posicion;
    }

    public void moverAcasillero(Casillero casillero) {

        if (estaEnRango(casillero, this.velocidad)) {
            this.posicion = casillero;
        }

    }



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
