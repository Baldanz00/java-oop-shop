public class App {
    public static void main(String[] args) throws Exception {
        
        /*Esercizio di oggi Java Shop
repo : java-oop-shop
Nel progetto java-oop-shop, creare la classe Prodotto
 che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
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
codice-nome
Aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità 
della classe Prodotto */

//creo il mio prodotto
Prodotto prodotto1 = new Prodotto("Cuffie", "auricolare bluethoot ", 160.90, 22.00);

System.out.println("Codice prodotto: " + prodotto1.codice);
System.out.println("Nome prodotto: " + prodotto1.nome);
System.out.println("Descrizione prodotto: " + prodotto1.descrizone);
System.out.println("Prezzo base del prodotto: € " + prodotto1.prezzo);//String format: %.2f = solo 2 decimali
System.out.println("Prezzo del prodotto con iva: € " + prodotto1.prezzoConIva());

    }
}
