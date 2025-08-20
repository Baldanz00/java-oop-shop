
import java.util.Random;

public class Prodotto {

    /*Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” 
per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando 
codice-nome */

public int codice;
public String nome;
public String descrizone;
public double prezzo;
public double iva;

//costruttore che accetta parametri
public Prodotto(String nome, String descrizone, double prezzo, double iva){
    this.codice = generaCodice(); //metodo per generare il codice random
    this.nome = nome;
    this.descrizone = descrizone;
    this.prezzo = prezzo;
    this.iva = iva;
}

//metodo per generare il codicd random
public int generaCodice(){
    Random random = new Random();
    return random.nextInt(9999) + 1000; //genera un codice random in quel range che io ho deciso
    }

//metodo per avere il prezzo base:
public double prezzo(){
    return prezzo;
}

//metodo per avere il prezzo con iva
public double prezzoConIva(){
    return prezzo + (prezzo * iva/100);
}

//nome esteso
public String toString(){
    return nome + "-" + descrizone + prezzo + " € " + ", prezzo con iva: " + prezzoConIva();
}
}
