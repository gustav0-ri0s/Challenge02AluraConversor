package conversorTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {
    public double ConvertirCelciusAFarenheit(double valor){
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+" Grados Celcius son "+farenheit+ " Grados Farenheit ");
        return farenheit;
    }

    public double ConvertirCeliusAKelvin(double valor){
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+" Grados Celcius son "+kelvin+ " Kelvin ");
        return kelvin;
    }

    public double ConvertirFarenheitACelcius(double valor){
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+" Grados Farenheit son "+celcius+"º Celcius");
        return celcius;
    }

    public double  ConvertirKelvinACelcius(double valor){
        double celcius =  valor - 273.15;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+" Kelvin son "+celcius+" º Celcius");
        return celcius;
    }

    public void ConvertirKelvinAFarenheit(double valor){
        double farenheit = ConvertirKelvinACelcius(valor);
        farenheit =  ConvertirCelciusAFarenheit(farenheit);
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+" Kelvin son "+farenheit+" Grados Farenheit");
    }

    public void ConvertirFarenheitAKelvin(double valor){
        double kelvin = ConvertirFarenheitACelcius(valor);
        kelvin = ConvertirCeliusAKelvin(valor);
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+" Grados Farenheit son "+kelvin+" Kelvin");
    }
}
