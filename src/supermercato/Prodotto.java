package supermercato;

public class Prodotto implements Comparable<Prodotto>{
	
	private String codice;
	private String nome;
	private int volume;
	private boolean daFrigo;
	private double prezzo;
	private int percentualeSconto;
	
	public Prodotto(String codice, String nome, int volume, boolean daFrigo) {
		this.codice = codice;
		this.nome = nome;
		this.volume = volume;
		this.daFrigo = daFrigo;
		this.prezzo = 0.0;
		this.percentualeSconto = 0;
	}
	
	public String getCodice(){
		return codice;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getVolume(){
		return volume;
	}

	public void setPrezzoListino(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getPrezzoListino() {
		return prezzo;
	}

	public void setPercentualeSconto(int percentualeSconto) {
		this.percentualeSconto=percentualeSconto;
	}

	public int getPercentualeSconto() {
		return percentualeSconto;
	}

	public boolean isDaFrigo(){
		return daFrigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}

	@Override
	public int compareTo(Prodotto prodotto) {
		// TODO Auto-generated method stub
		return (int) -(this.getPrezzoListino()-prodotto.getPrezzoListino());
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", volume=" + volume + ", daFrigo=" + daFrigo
				+ ", prezzo=" + prezzo + ", percentualeSconto=" + percentualeSconto + "]";
	}
	
}
