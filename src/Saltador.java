
public class Saltador extends Atleta {
	
	private static final long serialVersionUID = 1L;
	
	protected String tipoDeSalto;


	public Saltador(String nome, int idade, int numero, String categoria, String tipoDeSalto) {
		super(nome, idade, numero, categoria);
		this.tipoDeSalto = tipoDeSalto;
	}
	
	
	@Override
	public String toString() {
		String retorno = super.toString();
		retorno += "Tipo de Salto: "+ this.tipoDeSalto + "\n;";
		return retorno;
	}
	

	public String competir() {
		return "Saltando";
	}

}
