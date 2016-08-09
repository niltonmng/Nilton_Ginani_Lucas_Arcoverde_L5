package hotel;

public class Hotel {

	private Recepcao recepcao;
	
	public Hotel(){
		this.recepcao = new Recepcao();
	}
	
	public Recepcao getRecepcao(){
		return this.recepcao;
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception{
		this.getRecepcao().checkIn(nome, tipo, idade, dias, valor);
	}
	
	public void checkOut(String nome){
		this.getRecepcao().checkOut(nome);
	}
	
	public int getNumDeHospedes(){
		return this.getRecepcao().getNumDeHospedes();
	}
	
	public double getLucroTotal(){
		return this.getRecepcao().getLucroTotal();
	}
	
	public String toString(){
		String retorno = "Hotel P2\n";
		return retorno + this.getRecepcao().toString();
	}
	
}
