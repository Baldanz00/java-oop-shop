import java.util.Random;

public class Prodotto {
/*
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva

Usare opportunamente i livelli di accesso (public, private), i costruttori,
i metodi getter e setter ed eventuali altri metodi di "utilità" per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random ✔
- il codice prodotto sia accessibile solo in lettura ✔
- gli altri attributi siano accessibili sia in lettura che in scrittura ✔
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

Nello stesso package aggiungere una classe Main con metodo main nella quale testare tutte le
funzionalità della classe Prodotto.
*/
    private String code;
    private String name;
    private String description;
    private double price;
    private static final double iva = 22.0;


    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random random = new Random();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getIva() { return iva; }

    public String getCode() { return code; }

    public Prodotto( String name, String description, double price) {
        this.code = generateCode(8); //codice random di 8 caratteri
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //metodo per generare il codice random
    private String generateCode(int lunghezza){ //la lunghezza mi dice quanti caratteri deve avere il codice
        StringBuilder stringBuilder = new StringBuilder(lunghezza);
        //StringBuilder è una classe  per costruire stringhe quando devi aggiungere caratteri uno alla volta.
        //Passando lunghezza al costruttore, si prealloca lo spazio necessario per evitare di riallocare memoria
        //continuamente mentre aggiungi caratteri.
        for(int i = 0; i < lunghezza; i++){
            int indice = random.nextInt(CHARACTERS.length()); //mi sceglie un carattere tra quelli ammessi (CHARACTERS)
            stringBuilder.append(CHARACTERS.charAt(indice));
        }
        return stringBuilder.toString();
    }

    //metodo per ottenere il prezzo base senza iva
    public double basePrice(){
        return price;
    }

    //metodo per ottenere il prezzo compreso di iva
    public String priceWithIVA(){
        double prezzoConIva = price * (1 + iva / 100);
        return String.format("%.2f", prezzoConIva);
    }

    //metodo per avere il nome concatenato codice-nome
    public String productName(){
        return code + "-" + name;
    }

}
