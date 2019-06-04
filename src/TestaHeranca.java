
public class TestaHeranca {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Pedro");
		pf.setEmail("pedro@gmail.com");
		pf.setCpf("123.456.789-00");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Colégio Santo Inácio");
		pj.setEmail("santoinacio-rio@santoinacio.com.br");
		pj.setCnpj("33.544.370/0031-64");
		
		System.out.println(pf.getNome() + " estuda em " + pj.getNome());
	}

}
