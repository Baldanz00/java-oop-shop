//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Prodotto p1 = new Prodotto("Telefono", "Iphone 17 pro max", 1199.99);
    Prodotto p2 = new Prodotto("Cuffie", "Airpods 2 pro", 249.99);
    System.out.println("Il primo prodotto è: " + p1.productName() + ", descrizione: " + p1.getDescription() + "\n Il prezzo base è: " + p1.basePrice() + "€" + "\n Il prezzo complessivo di IVA è: " + p1.priceWithIVA() + "€");
    System.out.println("Il primo prodotto è: " + p2.productName() + ", descrizione: " + p2.getDescription()+ "\n Il prezzo base è: " + p2.basePrice() + "€" + "\n Il prezzo complessivo di IVA è:  " + p2.priceWithIVA() + "€");

}
