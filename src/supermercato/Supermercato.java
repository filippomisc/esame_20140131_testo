package supermercato;

import java.util.*;

public class Supermercato {
	
	private Map<String, Corsia> corsie;
	private Map<String, Prodotto> prodotti;
	
	
	public Supermercato() {
		corsie = new HashMap<String, Corsia>();
		prodotti = new HashMap<String, Prodotto>();
		
	}

	public Map<String, Corsia> getCorsie() {
		return corsie;
	}

	public void aggiungiCorsia(String nome, int capienzaMassima){
		
		
			Corsia corsia = new Corsia(nome, capienzaMassima);
		
			corsie.put(nome, corsia);
		
	}
	
	public Prodotto catalogaProdotto(String codiceProdotto, String nomeProdotto, int volume, boolean daFrigo){
		
		Prodotto prodotto = new Prodotto(codiceProdotto, nomeProdotto, volume, daFrigo);
		
		if(!prodotti.containsKey(nomeProdotto))
			prodotti.put(nomeProdotto, prodotto);
			
		
		
		
		return prodotto;
	}	
	
	public Collection<Prodotto> elencoProdotti(){
		
		Collection<Prodotto> p = prodotti.values();
		
		List<Prodotto> listaProdotti = new ArrayList<Prodotto>(prodotti.values());
		
		Collections.sort(listaProdotti);
		
		return listaProdotti; 
	}
	
	public Prodotto cercaProdotto(String codiceProdotto) throws ProdottoInesistenteException{
		
		Prodotto prodotto = null;
		
		if(prodotti.containsKey(codiceProdotto))
			prodotto = prodotti.get(codiceProdotto);
//			return prodotto;
		else {
			throw new ProdottoInesistenteException();
			}
		return prodotto;
	}
	
	public void esponiProdotto(String nomeCorsia, Prodotto prodotto, int quantita){
		
	}

	public int calcolaPercentualeDiOccupazione(String nomeCorsia){
		return -1;
	}
	
	public Collection<String> elencoCodiciProdottoPerCorsia(String nomeCorsia){
		return null;
	}

	public int quantitaProdottoEsposto(Prodotto prodotto, String nomeCorsia){
		return -1;
	}
	
	public int quantitaProdottoEsposto(Prodotto prodotto){
		return -1;
	}
	
	public int apriScontrino(){
		return -1;
	}
	
	public void acquistaProdotto(int codiceScontrino, Prodotto prodotto, String nomeCorsia, int quantita){

	}
	
	public String dettagliScontrino(int codiceScontrino){
		return null;
	}
	
	public double chiudiScontrino(int codiceScontrino) throws ProdottoInesistenteException{
		return -1.0;
	}
	
	public void leggiFile(String nomeFile) {

	}	
	
}
