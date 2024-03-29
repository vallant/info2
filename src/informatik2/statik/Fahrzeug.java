/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatik2.statik;

/**
 *
 * @author Stephan
 */
public class Fahrzeug
{

    protected final double hoehe;
    protected final double breite;
    protected double gesamtGewicht;
    protected final double achsAbstand;

    public Fahrzeug(double hoehe, double breite, double gesamtGewicht,
            double achsAbstand)
            throws Exception
    {
        if (hoehe <= 0)
        {
            throw new Exception("Hoehe muss groesser 0 sein");
        }

        if (breite <= 0)
        {
            throw new Exception("Breite muss groesser 0 sein");
        }

        if (gesamtGewicht <= 0)
        {
            throw new Exception("gesamtGewicht muss groesser 0 sein");
        }

        if (achsAbstand <= 0)
        {
            throw new Exception("achsAbstand muss groesser 0 sein");
        }

        this.hoehe = hoehe;
        this.achsAbstand = achsAbstand;
        this.breite = breite;
        this.gesamtGewicht = gesamtGewicht;
    }

    public Fahrzeug(LKW lkw)
    {
        this.hoehe = lkw.getHoehe();
        this.breite = lkw.getBreite();
        this.gesamtGewicht = lkw.getGesamtGewicht();
        this.achsAbstand = lkw.achsAbstand;
    }

    public double getHoehe()
    {
        return hoehe;
    }

    public double getBreite()
    {
        return breite;
    }

    public double getGesamtGewicht()
    {
        return gesamtGewicht;
    }

    public void setGesamtGewicht(double gesamtGewicht)
    {
        this.gesamtGewicht = gesamtGewicht;
    }

    public double getAchsenAbstand()
    {
        return achsAbstand;
    }

    @Override
    public String toString()
    {
        return String.format("Fahrzeug --> Hoehe: %.2f m, Breite: %.2f m , gesamtGewicht: "
                + "%.2f kg, Achsabstand: %.2f", hoehe, breite, gesamtGewicht, achsAbstand);
    }
}
