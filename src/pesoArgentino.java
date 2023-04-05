public class pesoArgentino extends Moneda{

    public pesoArgentino(double valor) {
        super("Pesos Argentinos", valor);
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
    public Moneda ADolar() {
        this.setValor(this.getValor() * 0.0048);
        this.setPais("Dolares Estadounidenses");
        return this;
    }

    @Override
    public Moneda AWon() {
        this.setValor(this.getValor() * 6.25);
        this.setPais("Wons sul-coreanos");
        return this;
    }

    @Override
    public Moneda ALibra() {
        this.setValor(this.getValor() * 0.0039);
        this.setPais("Libras Esterlinas");
        return this;
    }

    @Override
    public Moneda AYen() {
        this.setValor(this.getValor() * 0.64);
        this.setPais("Yenes");
        return this;
    }

    @Override
    public Moneda AEuro() {
        this.setValor(this.getValor() * 0.0044);
        this.setPais("Euros");
        return this;
    }

    @Override
    public Moneda APeso() {return this;};
}
