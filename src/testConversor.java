public class testConversor {
    public static void main(String[] args) {
        Moneda test = new wonSulCoreano(10);
        System.out.println("En este objeto tienes: $" + test.getValor() + " " + test.getPais());

        Moneda test2 = new pesoArgentino(400);
        System.out.println("En este objeto tienes: $" + test2.getValor() + " " + test2.getPais());

        test.APeso().AWon();
        System.out.println(test.getValor() + " " + test.getPais());

        test.AWon();
        System.out.println(test.getValor() + " " + test.getPais());
    }
}
