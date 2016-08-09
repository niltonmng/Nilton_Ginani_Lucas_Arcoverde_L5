package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) throws Exception{
		if(valor < 0){
			throw new Exception("O valor nao pode ser menor que zero.");
		}
		if(dias <= 0){
			throw new Exception("A quantidade de dias nao pode ser menor ou igual a zero.");
		}
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public Animal getAnimal() {
		return animal;
	}

	public double getValor() {
		return valor;
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
	
	public String getNome(){
		return this.getAnimal().getNome();
	}
	
	public String getTipo(){
		return this.getAnimal().getTipo();
	}
	
	public int getIdade(){
		return this.getAnimal().getIdade();
	}
	
	public String toString(){
		return this.getDias() + " " + this.getValor() + " " + this.getAnimal().toString();
	}
	
}