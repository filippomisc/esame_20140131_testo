package supermercato;

public class ProdottoDaFrigo extends Prodotto{
	
	private int temperaturaDiConservazione;

	public ProdottoDaFrigo(String codice, String nome, int volume, boolean daFrigo, int temperaturaDiConservazione) {
		super(codice, nome, volume, daFrigo);
		this.temperaturaDiConservazione = temperaturaDiConservazione;
	}

	public int getTemperaturaDiConservazione(){
		return temperaturaDiConservazione;
	}

	public void setTemperaturaDiConservazione(int temperaturaDiConservazione){
		this.temperaturaDiConservazione = temperaturaDiConservazione;
	}

	@Override
	public String getCodice() {
		return super.getCodice();
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public int getVolume() {
		return super.getVolume();
	}

	@Override
	public void setPrezzoListino(double prezzo) {
		super.setPrezzoListino(prezzo);
	}

	@Override
	public double getPrezzoListino() {
		return super.getPrezzoListino();
	}

	@Override
	public void setPercentualeSconto(int percentualeSconto) {
		super.setPercentualeSconto(percentualeSconto);
	}

	@Override
	public int getPercentualeSconto() {
		return super.getPercentualeSconto();
	}

	@Override
	public boolean isDaFrigo() {
		return super.isDaFrigo();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public String toString() {
		return "ProdottoDaFrigo [temperaturaDiConservazione=" + temperaturaDiConservazione + ", getCodice()="
				+ getCodice() + ", nome= " + getNome() + ", volume=" + getVolume() + ", prezzoListino()="
				+ getPrezzoListino() + ", percentuale=" + getPercentualeSconto() + ", daFrigo="
				+ isDaFrigo() + "]";
	}

}
