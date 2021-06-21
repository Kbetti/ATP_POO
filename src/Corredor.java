
public class Corredor extends Atleta {
	
	private static final long serialVersionUID = 1L;
	
	protected String prova;


	public Corredor (String nome, int idade, int numero, String categoria, String prova) {
		super(nome, idade, numero, categoria);
		this.prova = prova;
	}
	
	
	@Override
	public String toString() {
		String retorno = super.toString();
		retorno += "Prova: "+ this.prova + "\n;";
		return retorno;
	}

	public String competir() {
		return "Correndo";
	}

}