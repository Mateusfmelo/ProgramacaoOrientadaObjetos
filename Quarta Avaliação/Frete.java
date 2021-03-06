public abstract class Frete implements Fretavel {
    private double distancia, valorPorKm;

    public Frete(double distancia, double valorPorKm) {
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

}