package hotel;

public class Animal {

	private String nome;
	private String tipo;
	private int idade;

	public Animal(String nomeAnimal, String tipoAnimal, int idadeAnimal)
			throws Exception {
		if (nomeAnimal == null || nomeAnimal.trim().isEmpty()) {
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}
		if (tipoAnimal == null || tipoAnimal.trim().isEmpty()) {
			throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
		}
		if (idadeAnimal <= 0) {
			throw new Exception("Idade de um animal nao pode ser abaixo de 0");
		}
		this.nome = nomeAnimal;
		this.tipo = tipoAnimal;
		this.idade = idadeAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	public boolean equals(Object Obj) {
		if (Obj instanceof Animal) {
			Animal outroAnimal = (Animal) Obj;
			if (this.getNome().equalsIgnoreCase(outroAnimal.getNome())
					&& this.getTipo().equalsIgnoreCase(outroAnimal.getTipo())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public String toString() {
		return this.getNome() + " (" + this.getIdade() + ") " + this.getTipo();
	}
}