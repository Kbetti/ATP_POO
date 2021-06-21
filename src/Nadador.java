
public class Nadador extends Atleta {
	
	private static final long serialVersionUID = 1L;
	
	protected String estilo;


	public Nadador (String nome, int idade, int numero, String categoria, String estilo) {
		super(nome, idade, numero, categoria);
		this.estilo = estilo;
	}
	
	@Override
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Idade: "    + this.idade    + " anos\n";
		retorno += "Número: "     + this.numero     + "\n";
		retorno += "Categoria: "  + this.categoria  + "\n";
		retorno += "Competindo: "  + competir()        + "\n";
		retorno += "Estilo: "+ this.estilo + "\n;";
		return retorno;
	}

	public String competir() {
		return "Nadando";
	}

}
