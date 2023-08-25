package conversorTemperatura;

import javax.swing.*;

public class functionTemperatura {
    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double Minput){
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opcion para convertir","Temperatura",
                JOptionPane.PLAIN_MESSAGE,null, new Object[]{ "Grados Celcius a Grados Farenheit","Grados Celcius a Kelvin","Grados Farenheit a Grados Celcius",
                        "Kelvin a Grados Celcius","Kelvin a Grados Farenheit", "Grados Farenheit  a Kelvin"},"Seleccion")).toString();

        switch (opcion){
            case "Grados Celcius a Grados Farenheit":
                temperatura.ConvertirCelciusAFarenheit(Minput);
                break;
            case "Grados Celcius a Kelvin":
                temperatura.ConvertirCeliusAKelvin(Minput);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatura.ConvertirFarenheitACelcius(Minput);
                break;
            case "Kelvin a Grados Celcius":
                temperatura.ConvertirKelvinACelcius(Minput);
                break;
            case "Kelvin a Grados Farenheit":
                temperatura.ConvertirKelvinAFarenheit(Minput);
            case "Grados Farenheit  a Kelvin":
                temperatura.ConvertirFarenheitAKelvin(Minput);
                break;
        }
    }
}
