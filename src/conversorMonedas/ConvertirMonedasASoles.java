package conversorMonedas;

import javax.swing.*;

public class ConvertirMonedasASoles {

    //Dólares a Soles
    public void ConvertirDolaresASoles (double valor){
        double monedaDolar = valor * 3.69890;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Tienes S/ "+monedaDolar+" Soles");
    }

    //Euros a Soles
    public void ConvertirEuroASoles (double valor){
        double monedaEuro = valor * 4.00243;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaEuro+" Soles");
    }

    //Libras Esterlinas a Soles
    public void ConvertirLibrasEsterlinasASoles (double valor){
        double monedaLibra = valor * 4.66894;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaLibra+" Soles");
    }

    //Pesos Mexicanos a Soles
    public void ConvertirPesosMexicanosASoles (double valor){
        double monedaMexico = valor * 0.219962;
        monedaMexico = (double) Math.round(monedaMexico * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaMexico+" Pesos Soles");
    }

    //Yenes a Soles
    public void ConvertirYenesASoles (double valor){
        double monedaYen = valor * 0.0253401;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaYen+" Soles");
    }

    //Wones a Soles
    public void ConvertirWonesASoles (double valor){
        double monedaWon = valor * 0.00278712;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaWon+" Soles");
    }

    //Pesos Colombianos a Soles
    public void ConvertirPesosColombianosASoles (double valor){
        double monedaPesosColombia = valor * 0.00278712;
        monedaPesosColombia = (double) Math.round(monedaPesosColombia * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaPesosColombia+" Soles");
    }

    //Pesos Argentinos a Soles
    public void ConvertirPesosArgentinosASoles (double valor){
        double monedaPesosArgentina = valor * 0.00278712;
        monedaPesosArgentina = (double) Math.round(monedaPesosArgentina * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaPesosArgentina+" Soles");
    }

    //Real Brasilero a Soles
    public void ConvertirRealesASoles (double valor){
        double monedaRealBr = valor * 0.755739;
        monedaRealBr = (double) Math.round(monedaRealBr * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaRealBr+" Soles");
    }

    // Peso Chileno a Soles
    public void ConvertirPesosChilenosASoles (double valor){
        double monedaPesoChile = valor *  0.00434433;
        monedaPesoChile = (double) Math.round(monedaPesoChile * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ "+monedaPesoChile+" Soles");
    }
}
