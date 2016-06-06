package fiuba.algo3.Modelo;

/**
 * Created by Mariano on 05/06/2016.
 */
public class Casillero {

    private int posicionX;

    private int posicionY;


    public Casillero(int x, int y){
        posicionX = x;
        posicionY = y;
    }

    public int getX() {

        return posicionX;

    }


    public int getY() {

        return posicionY;
    }
}