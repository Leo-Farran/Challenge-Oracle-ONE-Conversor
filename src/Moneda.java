public abstract class Moneda implements conversorDeMonedas {

    private String pais;

    private double valor;

    protected Moneda(String pais, double valor) {
        this.pais = pais;
        this.valor = valor;
    }


    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
