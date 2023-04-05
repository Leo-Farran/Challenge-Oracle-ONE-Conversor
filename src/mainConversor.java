import javax.swing.*;
import java.util.Objects;


public class mainConversor {
    public static void main(String[] args) {
        String[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
        String [] monedas = {
                "De Peso Argentino a Dolar USA",
                "De Peso Argentino a Yen",
                "De Peso Argentino a Libra Esterlina",
                "De Peso Argentino a Euro",
                "De Peso Argentino a Won sul-coreano",
                "De Dolar USA a Peso Argentino",
                "De Yen a Peso Argentino",
                "De Libra Esterlina a Peso Argentino",
                "De Euro a Peso Argentino",
                "De Won a Peso Argentino"
        };

        int continua;

        String capturaMonto;

        double monto;


        JOptionPane.showMessageDialog(null, "Hola, bienvenido a tu conversor");

        do {
            String opcionSeleccionada = (String)JOptionPane.showInputDialog(null,
                    "Elije entre los conversores disponibles",
                    "Conversores",JOptionPane.PLAIN_MESSAGE,
                    null, opciones, opciones[0]);

            if(Objects.equals(opcionSeleccionada, "Conversor de Monedas")) {
                String parSeleccionado = (String)JOptionPane.showInputDialog(null,
                        "Elije entre los pares de monedas disponibles",
                        "Conversor de Monedas", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);
                if (parSeleccionado != null){
                    try {
                         capturaMonto = JOptionPane.showInputDialog(null,
                                "Ingrese el monto a convertir");


                         monto = Double.parseDouble(capturaMonto);

                        switch (parSeleccionado) {
                            case "De Peso Argentino a Dolar USA":
                                Moneda pesoDolar = new pesoArgentino(monto);
                                pesoDolar.ADolar();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + pesoDolar.getValor() + " Dolares");
                                break;
                            case "De Peso Argentino a Euro":
                                Moneda pesoEuro = new pesoArgentino(monto);
                                pesoEuro.AEuro();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + pesoEuro.getValor() + " Euros");
                                break;
                            case "De Peso Argentino a Libra Esterlina":
                                Moneda pesoLibra = new pesoArgentino(monto);
                                pesoLibra.ALibra();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + pesoLibra.getValor() + " Libras Esterlinas");
                                break;
                            case "De Peso Argentino a Yen":
                                Moneda pesoYen = new pesoArgentino(monto);
                                pesoYen.AYen();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + pesoYen.getValor() + " Yenes");
                                break;
                            case "De Peso Argentino a Won sul-coreano":
                                Moneda pesoWon = new pesoArgentino(monto);
                                pesoWon.AWon();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + pesoWon.getValor() + " Wones");
                                break;
                            case "De Dolar USA a Peso Argentino":
                                Moneda dolarPeso = new dolarEEUU(monto);
                                dolarPeso.APeso();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + dolarPeso.getValor() + " Pesos");
                                break;
                            case "De Yen a Peso Argentino":
                                Moneda yenPeso = new yenJapones(monto);
                                yenPeso.APeso();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + yenPeso.getValor() + " Pesos");
                                break;
                            case "De Libra Esterlina a Peso Argentino":
                                Moneda libraPeso = new libraEsterlina(monto);
                                libraPeso.APeso();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + libraPeso.getValor() + " Pesos");
                                break;
                            case "De Euro a Peso Argentino":
                                Moneda euroPeso = new Euro(monto);
                                euroPeso.APeso();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + euroPeso.getValor() + " Pesos");
                                break;
                            case "De Won a Peso Argentino":
                                Moneda wonPeso = new wonSulCoreano(monto);
                                wonPeso.APeso();
                                JOptionPane.showMessageDialog(null, "Equivalen a: "
                                        + wonPeso.getValor() + " Pesos");
                                break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + parSeleccionado);

                        }
                    }catch(NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "No ingresaste ningún valor");
                        ex.printStackTrace();
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "El formato ingresado no es correcto");
                        ex.printStackTrace();
                    }
                }

            }else if (Objects.equals(opcionSeleccionada, "Conversor de Temperatura")){
                JOptionPane.showMessageDialog(null,"Este conversor está en desarrollo");
            }
            continua = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);
        }while (continua == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }
}

