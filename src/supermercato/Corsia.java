package supermercato;

public class Corsia {
	
	private String nome;
	private int capienzaMax;
	
	
	public Corsia(String nome, int capienzaMax) {
		this.nome = nome;
		this.capienzaMax = capienzaMax;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCapienzaMax() {
		return capienzaMax;
	}


	public void setCapienzaMax(int capienzaMax) {
		this.capienzaMax = capienzaMax;
	}


	@Override
	public String toString() {
		return "Corsia [nome=" + nome + ", capienzaMax=" + capienzaMax + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Corsia other = (Corsia) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
