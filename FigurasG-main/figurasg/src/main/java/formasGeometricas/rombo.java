package formasGeometricas;

public class rombo extends Formas
{
    private double ladoR;
    private double perimetroR;
    private double diagonalMayorR;
    private double diagonalMenorR;
    private double areaR;
   
    public double getLadoR() {
        return ladoR;
    }
    public void setLadoR(double ladoR) {
        this.ladoR = ladoR;
    }
    public double getPerimetroR() {
        return perimetroR;
    }
    public void setPerimetroR(double perimetroR) {
        this.perimetroR = perimetroR;
    }
    public double getDiagonalMayorR() {
        return diagonalMayorR;
    }
    public void setDiagonalMayorR(double diagonalMayorR) {
        this.diagonalMayorR = diagonalMayorR;
    }
    public double getDiagonalMenorR() {
        return diagonalMenorR;
    }
    public void setDiagonalMenorR(double diagonalMenorR) {
        this.diagonalMenorR = diagonalMenorR;
    }
    public double getAreaR() {
        return areaR;
    }
    public void setAreaR(double areaR) {
        this.areaR = areaR;
    }

    @Override
    public double calcularPerimetro()
    {       
            perimetroR = ladoR * 4;
            return perimetroR;
    }
    @Override
    public double calcularArea()
    {
            areaR = diagonalMayorR * diagonalMenorR / 2;
            return areaR;
    }
}
