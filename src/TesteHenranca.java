
public class TesteHenranca {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Pedro");
		pf.setEmail("pedro@gmail.com");
		pf.setEmail("123.456.789-00");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Colegio Santo Inacio");
		pj.setEmail("santoinacio-rio@santoinacio.com.br");
		pj.setEmail("33.544.370/0031-64");
		
		System.out.println(pf.getNome() + " estuda em " + pj.getNome());

	}

}
