package LDE;

public class Pessoa<T extends Comparable<T>> {
	
	private String Nome=null;
	private String Idade=null;
	
	public Pessoa(String nome, String idade){
		Nome=nome;
		Idade=idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIdade() {
		return Idade;
	}

	public void setIdade(String idade) {
		Idade = idade;
	}

	
	
}
