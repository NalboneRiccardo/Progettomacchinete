/**
 * 
 */
package iis.torriani.tpsi.gruppo2;

/**
 * @author nalbone21703
 *
 */
public class Macchinetta {
	public int numP;
	private Prodotto[] elenco;
	public Macchinetta(int max) {
		this.elenco= new Prodotto[max];
		this.numP=0;
	}
	public void aggiungiProdotto(Prodotto nuovo){
		elenco[numP]=nuovo;
		numP++;
	}
	public String elenco() {
		String tmp="";
		for(int i=0; i<numP; i++) {
			tmp+=elenco[i].toString() +"\n";
		}
	return tmp;	
	}
	public Prodotto cercaProdotto(String cercato) {
		for(int i=0; i<numP; i++) {
			if(cercato.equals(elenco[i].getNome())) {
				return elenco[i];
			}
			else {
				return null;
			}
		}
	}
	public float restituisciResto (String codcerc, float credito) {
		int resto=0;
		for(int i=0; i<numP; i++) {
			if(codcerc.equals(elenco[i].getCod())) {
				if(credito>elenco[i].getPrezzo) {
					resto=credito-elenco[i].getPrezzo();
					return resto;
				}
				else {
					System.out.println("credito insufficiente");
				}
			}
		}
			
	}
}
