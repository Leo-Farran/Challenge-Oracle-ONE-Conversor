public class wonSulCoreano extends Moneda{

    public wonSulCoreano(double valor) {
        super("Wons Sul-Coreano", valor);
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
        this.setValor(this.getValor() * 0.00077);
        this.setPais("Dolares Estadounidenses");
        return this;
    }

    @Override
    public Moneda AWon() {
        return this;
    }

    @Override
    public Moneda ALibra() {
        this.setValor(this.getValor() * 0.00062);
        this.setPais("Libras Esterlinas");
        return this;
    }

    @Override
    public Moneda AYen() {
        this.setValor(this.getValor() * 0.10);
        this.setPais("Yenes");
        return this;
    }

    @Override
    public Moneda AEuro() {
        this.setValor(this.getValor() * 0.00071);
        this.setPais("Euros");
        return this;
    }

    @Override
    public Moneda APeso() {
        this.setValor(this.getValor() * 0.16);
        this.setPais("Pesos Argentinos");
        return this;
    }
}
