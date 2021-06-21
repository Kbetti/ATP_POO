import java.io.Serializable;



public abstract class Atleta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected String nome;
	protected int idade;
	protected int numero;
	protected String categoria;
	
	
	public Atleta(String nome, int idade, int numero, String categoria) {
		this.nome = nome;
		this.idade = idade;
		this.numero = numero;
		this.categoria = categoria;
	}

	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Idade: "    + this.idade    + " anos\n";
		retorno += "Número: "     + this.numero     + "\n";
		retorno += "Categoria: "  + this.categoria  + "\n";
		retorno += "Competindo: "  + competir()        + "\n";
		return retorno;
	}
	
	public abstract String competir();
	
}
