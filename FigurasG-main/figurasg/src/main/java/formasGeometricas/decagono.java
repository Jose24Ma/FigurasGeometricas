package formasGeometricas;

public class decagono extends Formas
{
    private double ladoD;
    private double perimetroD;
    private double apotemaD;
    private double areaD;

    public double getLadoD() {
        return ladoD;
    }
    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }
    public double getPerimetroD() {
        return perimetroD;
    }
    public void setPerimetroD(double perimetroD) {
        this.perimetroD = perimetroD;
    }
    public double getApotemaD() {
        return apotemaD;
    }
    public void setApotemaD(double apotemaD) {
        this.apotemaD = apotemaD;
    }
    public double getAreaD() {
        return areaD;
    }
    public void setAreaD(double areaD) {
        this.areaD = areaD;
    }

    @Override
    public double calcularPerimetro()
    {
        perimetroD = ladoD*5;
        return perimetroD;
    }
    @Override
    public double calcularArea()
    {
         areaD = (calcularPerimetro()* apotemaD )/2;
         return areaD;
    }
}
