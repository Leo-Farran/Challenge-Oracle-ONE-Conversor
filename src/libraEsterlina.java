public class libraEsterlina extends Moneda{

    public libraEsterlina(double valor) {
        super("Libras Esterlinas", valor);
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
        this.setValor(this.getValor() * 1.14);
        this.setPais("Euros");
        return this;
    }

    @Override
    public Moneda ADolar() {
        this.setValor(this.getValor() * 1.23);
        this.setPais("Dolares Estadounidenses");
        return this;
    }

    @Override
    public Moneda AWon() {
        this.setValor(this.getValor() * 1610.01);
        this.setPais("Wons sul-coreanos");
        return this;
    }

    @Override
    public Moneda ALibra() {
        return this;
    }

    @Override
    public Moneda AYen() {
        this.setValor(this.getValor() * 164.23);
        this.setPais("Yenes");
        return this;
    }

    @Override
    public Moneda APeso() {
        this.setValor(this.getValor() * 257.69);
        this.setPais("Pesos Argentinos");
        return this;
    }
}
