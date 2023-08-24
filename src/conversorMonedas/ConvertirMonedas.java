package conversorMonedas;

import javax.swing.*;

public class ConvertirMonedas {

    //Soles a Dólares
    public void ConvertirSolesADolares (double valor){
        double monedaDolar = valor / 3.69890;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Tienes $ "+monedaDolar+" Dólares");
    }

    //Soles a Euros
    public void ConvertirSolesAEuro (double valor){
        double monedaEuro = valor / 4.00243;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes € "+monedaEuro+" Euros");
    }

    //Soles a Libras Esterlinas
    public void ConvertirSolesALibrasEsterlinas (double valor){
        double monedaLibra = valor / 4.66894;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes  "+monedaLibra+" Libras Esterlinas");
    }

    //Soles a Pesos Mexicanos
    public void ConvertirSolesAPesosMexicanos (double valor){
        double monedaMexico = valor / 0.219962;
        monedaMexico = (double) Math.round(monedaMexico * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaMexico+" Pesos Mexicanos");
    }

    //Soles a Yenes
    public void ConvertirSolesAYenes (double valor){
        double monedaYen = valor / 0.0253401;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaYen+" Yen japonés");
    }

    //Soles a Wones
    public void ConvertirSolesAWones (double valor){
        double monedaWon = valor /  0.00278712;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaWon+" Wones");
    }

    //Soles a Pesos Colombianos
    public void ConvertirSolesAPesosColombianos (double valor){
        double monedaPesosColombia = valor /  0.00278712;
        monedaPesosColombia = (double) Math.round(monedaPesosColombia * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaPesosColombia+" Pesos Chilenos");
    }

    //Soles a Pesos Argentinos
    public void ConvertirSolesAPesosArgentinos (double valor){
        double monedaPesosArgentina = valor /  0.00278712;
        monedaPesosArgentina = (double) Math.round(monedaPesosArgentina * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaPesosArgentina+" Pesos Argentinos");
    }

    //Soles a Real Brasilero
    public void ConvertirSolesAReales (double valor){
        double monedaRealBr = valor /   0.755739;
        monedaRealBr = (double) Math.round(monedaRealBr * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaRealBr+" Reales");
    }

    // Soles a Peso Chileno
    public void ConvertirSolesAPesosChilenos (double valor){
        double monedaPesoChile = valor /  0.00434433;
        monedaPesoChile = (double) Math.round(monedaPesoChile * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaPesoChile+" Pesos Chilenos");
    }




}
