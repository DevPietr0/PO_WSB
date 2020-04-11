package javaapplication14;

public class JavaApplication14 {

    public static void main(String[] args) {
        
        // Rejestracja nowego konta
        Konto a = new Konto("Piotr", "Sałata");
        
        // Operacje na koncie
        a.wyplata(150);
        a.wplata(22.50);
        a.wplata(-22.50);
        a.wyplata(47.62);
        a.wyplata(400);
        
        // Sprawdzenie środków na koncie
        a.stanKonta();
    }   
    
}

class Konto
{
    Konto (String imie, String nazwisko)
    {   
        this.imie = imie;
        this.nazwisko = nazwisko;
        id++;
        //System.out.println("ID: "+id);
        System.out.println();
        System.out.println("Tworzenie klienta "+imie+" "+nazwisko);
        System.out.println("Utworzenie konta z saldem: "+saldo);
    }
    String imie;
    String nazwisko;
    int id = 0;
    double saldo = 500;
    
    void wyplata (double kwota1)
    {
        boolean isTrue = saldo >= kwota1 || kwota1 > 0;
        
        if (saldo >= kwota1 && kwota1 > 0)
            {
                saldo -= kwota1;
                System.out.println("Wypłata: "+kwota1+" "+(isTrue));
            }
        else if (saldo < kwota1 || kwota1 < 0)
            {   
                System.out.println("Wypłata: " + kwota1+" " + (!isTrue));
            }
    }
    void wplata (double kwota2)
    {
        boolean isTrue = kwota2 > 0 || kwota2 <= 0;
        
        if (kwota2 > 0)
        {
            saldo += kwota2;
            System.out.println("Wpłata: " + kwota2 + " " + (isTrue));
        }
        else if (kwota2 <= 0)
        {
            System.out.println("Wpłata: " + kwota2 + " " + (!isTrue));
        }
        
    }
    void stanKonta ()
    {
        System.out.println("Klient ["+nazwisko+", "+imie+"] ma saldo "+saldo);
    }
}