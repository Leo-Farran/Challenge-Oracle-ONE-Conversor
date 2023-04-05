public class Euro extends Moneda{

    public Euro(double valor) {
        super("Euro/s", valor);
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
        return this;
    }

    @Override
    public Moneda ADolar() {
        this.setValor(this.getValor() * 1.08);
        this.setPais("Dolares Estadounidenses");
        return this;
    }

    @Override
    public Moneda AWon() {
        this.setValor(this.getValor() * 1416.17);
        this.setPais("Wons sul-coreanos");
        return this;
    }

    @Override
    public Moneda ALibra() {
        this.setValor(this.getValor() * 0.88);
        this.setPais("Libras Esterlinas");
        return this;
    }

    @Override
    public Moneda AYen() {
        this.setValor(this.getValor() * 144.26);
        this.setPais("Yenes");
        return this;
    }

    @Override
    public Moneda APeso() {
        this.setValor(this.getValor() * 226.59);
        this.setPais("Pesos Argentinos");
        return this;
    }
}
