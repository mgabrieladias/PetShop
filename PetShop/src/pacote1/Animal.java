package pacote1;


public class Animal {
	
	private String nome;
	private String especie;
	private String raca;
	private String dataNascimento;
	private String proprietario;
	
	
	public Animal(String nome, String especie, String raca, String dataNascimento, String proprietario) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.dataNascimento = dataNascimento;	
		this.proprietario = proprietario;
	}



	public Animal() {
		
		this.nome = "Thor";
		this.especie = "Cachorro";
		this.raca = "Pastor Belga";
		this.dataNascimento = "01/01/2021";
		this.proprietario = "Maria";
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String toString() {
		return "Nome: " + nome + ", Espécie: " + especie + ", Raça: " + raca + ", Data de Nascimento: " + dataNascimento + ", Proprietario: " + proprietario;
	
	}
}

