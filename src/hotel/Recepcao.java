package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	ArrayList<Estadia> estadias;
	
	public Recepcao(){
		this.estadias = new ArrayList<Estadia>();
	}
	
	public ArrayList<Estadia> getEstadias(){
		return this.estadias;
	}
	
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception{
		Estadia novaEstadia = new Estadia(nome, tipo, idade, dias, valor);
		this.getEstadias().add(novaEstadia);
	}
	
	public void checkOut(String nome){
		for(int i = 0; i<this.getEstadias().size(); i++){
			if(this.getEstadias().get(i).getNome().equalsIgnoreCase(nome)){
				this.getEstadias().remove(i);
			}
		}
	}
	
	public int getNumDeHospedes(){
		return this.getEstadias().size();
	}
	
	public double getLucroTotal(){
		double total = 0;
		for(int i = 0; i<this.getEstadias().size();i++){
			int dias = this.getEstadias().get(i).getDias();
			double valor = this.getEstadias().get(i).getValor();
			total += dias * valor;
		}
		return total;
	}
	
	public String toString(){
		String retorno = "Total de estadias:\n";
		for(Estadia estadia : this.getEstadias()){
			retorno += estadia.toString()+ "\n";
		}
		return retorno;
	}
}