package hotel;

public class Animal {
	
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade)throws Exception{
		if(nome.trim().isEmpty() || nome.equals(null)){
			throw new Exception("Nome não pode ser vazio ou nulo");
		}
		if(tipo.trim().isEmpty() || tipo.equals(null)){
			throw new Exception("Tipo não pode ser vazio ou nulo");
		}
		if(idade <= 0){
			throw new Exception("Idade não pode ser menor ou igual a zero");
		}
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	
	public boolean equals(Object novoObjeto){
		if(novoObjeto instanceof Animal){
			Animal novoAnimal = (Animal) novoObjeto;
			if(this.getNome().equalsIgnoreCase(novoAnimal.getNome())){
				if(this.getTipo().equalsIgnoreCase(novoAnimal.getTipo())){
					if(this.getIdade() == novoAnimal.getIdade()){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public String toString(){
		return this.getNome() + " (" + this.getIdade() +") " + this.getTipo();
	}
	
}