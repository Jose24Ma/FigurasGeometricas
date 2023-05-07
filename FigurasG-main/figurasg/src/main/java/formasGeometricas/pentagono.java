package formasGeometricas;

public class pentagono extends Formas
{
    private double lado;
    private double apotema;
    private double areap;
    private double perimetro;
    
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getAreap() {
        return areap;
    }
    public void setAreap(double areap) {
        this.areap = areap;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularPerimetro()
    {
        perimetro = lado * 6;
        return perimetro;
    }

    @Override
    public double calcularArea()
    {
        areap = calcularPerimetro() * apotema / 2;
        return areap;
    }

}
