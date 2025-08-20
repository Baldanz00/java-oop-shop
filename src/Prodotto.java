
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

//costruttore che accetta parametri obbligatori
public Prodotto(String nome, String descrizone, double prezzo, double iva){
    // this.codice = generaCodice(); //metodo per generare il codice random
    this(); //-> si riferisce al Prodotto che non accetta parametri che si trova a Prodotto.java.42
    this.nome = nome;
    this.descrizone = descrizone;
    this.prezzo = prezzo;
    this.iva = iva;
}

//metodo per generare il codice random --> nel costruttore
// public int  generaCodice(){
//     Random random = new Random();
//     return random.nextInt(9999) + 1000; //genera un codice random in quel range che io ho deciso
//     }
//correzione codice random nel cotruttore e no un metodo:
public Prodotto(){
    Random random = new Random();
    this.codice = random.nextInt(9999) + 1000;
}
//metodo per avere il prezzo base:
public double prezzo(){
    return prezzo;
}

//metodo per avere il prezzo con iva
public double prezzoConIva(){
    return prezzo + (prezzo * iva/100);
}

//nome esteso: si usa il metodo toString per poter concatenare le stringhe, altimenti apparirebbe una sequenza alfa numerica.
public String toString(){
    return nome + "-" + descrizone + prezzo + " € " + ", prezzo con iva: " + prezzoConIva();
}
}
