public class yenJapones extends Moneda{

    public yenJapones(double valor) {
        super("Yenes", valor);
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
        this.setValor(this.getValor() * 0.0075);
        this.setPais("Dolares Estadounidenses");
        return this;
    }

    @Override
    public Moneda AWon() {
        this.setValor(this.getValor() * 9.81);
        this.setPais("Wons sul-coreanos");
        return this;
    }

    @Override
    public Moneda ALibra() {
        this.setValor(this.getValor() * 0.0061);
        this.setPais("Libras Esterlinas");
        return this;
    }

    @Override
    public Moneda AYen() {
        return this;
    }

    @Override
    public Moneda AEuro() {
        this.setValor(this.getValor() * 0.0069);
        this.setPais("Euros");
        return this;
    }

    @Override
    public Moneda APeso() {
        this.setValor(this.getValor() * 1.57);
        this.setPais("Pesos Argentinos");
        return this;
    }
}
