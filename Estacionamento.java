import java.util.ArrayList;



public class Estacionamento {
	
	String endereco;
	int VagasDispon;
	int PrecoCarro;
	int precoMoto;
	
	ArrayList<Veiculo>automoveis = new ArrayList();

	
	public void addVeiculo(Veiculo veiculo){	
		automoveis.add(veiculo);		

	}
	public String qtdsVeiculo(){
		
		return automoveis.size()+"";
	}
	


}
