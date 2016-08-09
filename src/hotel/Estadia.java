package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;

	public Estadia(String nomeAnimal, String tipoAnimal, int idadeAnimal,
			int qtdDias, double valorTotal) throws Exception {
		if (valorTotal < 0) {
			throw new Exception("O valor nao pode ser menor que zero.");
		}
		if (qtdDias <= 0) {
			throw new Exception(
					"A quantidade de dias nao pode ser menor ou igual a zero.");
		}
		this.animal = new Animal(nomeAnimal, tipoAnimal, idadeAnimal);
		this.valor = valorTotal;
		this.dias = qtdDias;
	}

	public Animal getAnimal() {
		return this.animal;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getNome() {
		return this.getAnimal().getNome();
	}

	public String getTipo() {
		return this.getAnimal().getTipo();
	}

	public int getIdade() {
		return this.getAnimal().getIdade();
	}

	public String toString() {
		return this.getNome() + ", " + this.getTipo() + ", " + this.getDias()
				+ " com o preco de R$ " + this.getValor();
	}

}