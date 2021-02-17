
public class ProvaMacchinette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Macchinetta m1=new Macchinetta(10);
		Cibo c1=new Cibo("1a", 2.39f, "Twix", 250);
		Cibo c2=new Cibo("2a", 5.09f, "Panino", 1000);
		Cibo c3=new Cibo("3a", 3.15f, "Arachidi", 730);
		Bevanda b1=new Bevanda("1b", 2.51f, "Acqua", 150);
		Bevanda b2=new Bevanda("2b", 3.52f, "Fanta", 100);
		Bevanda b3=new Bevanda("3b", 3.51f, "Coca-cola", 100);
		
    m1.aggiungiProdotto(c1);
		m1.aggiungiProdotto(c2);
		m1.aggiungiProdotto(c3);
		m1.aggiungiProdotto(b1);
		m1.aggiungiProdotto(b2);
		m1.aggiungiProdotto(b3);
		
    System.out.println(m1.elenco());
		System.out.println(m1.cercaProdotto("Acqua"));
		System.out.println(m1.restituisciResto("3b", 4.50f));
		System.out.println(m1.cercaProdotto("Twix"));
		System.out.println(m1.restituisciResto("2a", 7.00f));
		
		
	}

}
