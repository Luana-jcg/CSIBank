
public class TestaConstrutor {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(); // Construtor padr�o
		
		p1.setNome("Pedro");
		p1.setEmail("pedro@gmail.com");
		
		Pessoa p2 = new Pessoa("Luisa", "luisa@gmail.com"); // Sobrecarga

	}

}
