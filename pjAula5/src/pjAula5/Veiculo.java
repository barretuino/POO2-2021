package pjAula5;

public class Veiculo {
	//Atributos
	private String placa;
	private String transportadora;
	private int pesoBruto;
	private int pesoTara;
	
	//Métodos
	public int getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(int pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public int getPesoTara() {
		return pesoTara;
	}
	public void setPesoTara(int pesoTara) {
		this.pesoTara = pesoTara;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}		
}