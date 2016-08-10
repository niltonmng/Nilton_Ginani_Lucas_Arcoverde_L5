package src.hotel;

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
            double valor = this.getEstadias().get(i).getValor();
            total += valor;
        }
        return total;
    }
    
    public String toString(){
        String retorno = "Estadias:\n";
        for(Estadia estadia : this.getEstadias()){
            String valor = String.format("%.2f" , estadia.getValor()); //  formata a string para quer saia apenas com duas casas decimais.
            valor = valor.replace("," , "."); // modifica  a saida, substituindo a virgula por um ponto.
            retorno += estadia.getNome() + " (" + estadia.getTipo() + "): " + estadia.getDias() + " dias com o preco de R$ " + valor;
        }
        return retorno;
    }
}