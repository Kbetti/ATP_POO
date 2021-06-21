
public class Saltador extends Atleta {
	
	private static final long serialVersionUID = 1L;
	
	protected String tipoDeSalto;


	public Saltador(String nome, int idade, int numero, String categoria, String tipoDeSalto) {
		super(nome, idade, numero, categoria);
		this.tipoDeSalto = tipoDeSalto;
	}
	
	
	@Override
	public String toString() {
		String retorno = "";
		retorno += "Nome: "     + this.nome     + "\n";
		retorno += "Idade: "    + this.idade    + " anos\n";
		retorno += "Número: "     + this.numero     + "\n";
		retorno += "Categoria: "  + this.categoria  + "\n";
		retorno += "Competindo: "  + competir()        + "\n";
		retorno += "Tipo de Salto: "+ this.tipoDeSalto + "\n;";
		return retorno;
	}
	

	public String competir() {
		return "Saltando";
	}

}
