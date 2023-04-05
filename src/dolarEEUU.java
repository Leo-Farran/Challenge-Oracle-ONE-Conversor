public class dolarEEUU extends Moneda {
    public dolarEEUU(double valor) {
        super("Dolares EEUU", valor);
    }

    @Override
    public String getPais() {
        return super.getPais();
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public Moneda AEuro() {
        this.setValor(this.getValor() * 0.92);
        this.setPais("Euros");
        return this;
    }

    @Override
    public Moneda ADolar() {
        return this;
    }

    @Override
    public Moneda AWon() {
        this.setValor(this.getValor() * 1306.47);
        this.setPais("Wons sul-coreanos");
        return this;
    }

    @Override
    public Moneda ALibra() {
        this.setValor(this.getValor() * 0.81);
        this.setPais("Libras Esterlinas");
        return this;
    }

    @Override
    public Moneda AYen() {
        this.setValor(this.getValor() * 133.15);
        this.setPais("Yenes");
        return this;
    }

    @Override
    public Moneda APeso() {
        this.setValor(this.getValor() * 209.04);
        this.setPais("Pesos Argentinos");
        return this;
    }
}
