package conversorTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {
    public double ConvertirCelciusAFarenheit(double valor){
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+"ºC = "+farenheit+ "ºF");
        return farenheit;
    }

    public double ConvertirCeliusAKelvin(double valor){
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+"ºC = "+kelvin+ "K");
        return kelvin;
    }

    public double ConvertirFarenheitACelcius(double valor){
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+"ºF = "+celcius+"ºC");
        return celcius;
    }

    public double  ConvertirKelvinACelcius(double valor){
        double celcius =  valor - 273.15;
        celcius = (double) Math.round(celcius * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+"K = "+celcius+" ºC");
        return celcius;
    }

    public double ConvertirKelvinAFarenheit(double valor){
        double farenheit = valor - 273.15;
        farenheit =  farenheit * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, +valor+"K = "+farenheit+"ªF");
        return farenheit;
    }

    public double ConvertirFarenheitAKelvin(double valor){
        double kelvin = (valor - 32) / 1.8;
        kelvin = kelvin + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+"ªF = "+kelvin+"K");
        return kelvin;
    }
}
