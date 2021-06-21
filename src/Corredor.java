
public class Corredor extends Atleta {
	
	private static final long serialVersionUID = 1L;
	
	protected String prova;


	public Corredor (String nome, int idade, int numero, String categoria, String prova) {
		super(nome, idade, numero, categoria);
		this.prova = prova;
	}
	
	
	@Override
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Idade: "    + this.idade    + " anos\n";
		retorno += "Número: "     + this.numero     + "\n";
		retorno += "Categoria: "  + this.categoria  + "\n";
		retorno += "Competindo: "  + competir()        + "\n";
		retorno += "Prova: "+ this.prova + "\n;";
		return retorno;
	}

	public String competir() {
		return "Correndo";
	}

}