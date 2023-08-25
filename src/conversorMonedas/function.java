package conversorMonedas;

import javax.swing.*;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasASoles soles = new ConvertirMonedasASoles();

    public void ConvertirMonedas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras Esterlinas", "De Soles a Pesos Mexicanos",
                                "De Soles a Yenes", "De Soles a Wones", "De Soles a Pesos Colombianos", "De Soles a Pesos Argentinos",
                                "De Soles a Real Brasilero", "De Soles a Pesos Chilenos"}, "Selección")).toString();
        switch (opcion) {
            case "De Soles a Dólares":
                monedas.ConvertirSolesADolares(Minput);
                break;
            case "De Soles a Euros":
                monedas.ConvertirSolesAEuro(Minput);
                break;
            case "De Soles a Libras Esterlinas":
                monedas.ConvertirSolesALibrasEsterlinas(Minput);
                break;
            case "De Soles a Pesos Mexicanos":
                monedas.ConvertirSolesAPesosMexicanos(Minput);
                break;
            case "De Soles a Yenes":
                monedas.ConvertirSolesAYenes(Minput);
                break;
            case "De Soles a Wones":
                monedas.ConvertirSolesAWones(Minput);
                break;
            case "De Soles a Pesos Colombianos":
                monedas.ConvertirSolesAPesosColombianos(Minput);
                break;
            case "De Soles a Pesos Argentinos":
                monedas.ConvertirSolesAPesosArgentinos(Minput);
                break;
            case "De Soles a Real Brasilero":
                monedas.ConvertirSolesAReales(Minput);
                break;
            case "De Soles a Pesos Chilenos":
                monedas.ConvertirSolesAPesosChilenos(Minput);
                break;
        }

    }

    public void ConvertirSoles (double Minput){

    }
}
