import java.lang.Math;

public class Ponto
{
    private double posEixoX;
    private double posEixoY;
    
    public Ponto(double posEixoX, double posEixoY){
        this.posEixoX = posEixoX;
        this.posEixoY = posEixoY;
    }
    
    public void setPosEixoX(double posEixoX){
        this.posEixoX = posEixoX;
    }
    
    public double getPosEixoX(){
        return posEixoX;
    }
    
    public void setPosEixoY(double posEixoY){
        this.posEixoY = posEixoY;
    }
    
    public double getPosEixoY(){
        return posEixoY;
    }
    
    public double CalcularDistancia(double posEixoX, double posEixoY){
        return (Math.pow((this.posEixoX - posEixoX),2) + (Math.pow((this.posEixoY - posEixoY),2)));
    }
}