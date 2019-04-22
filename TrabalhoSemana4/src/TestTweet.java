
//Nome: André Luiz de Oliveira Cunha
//Matricula: 0050013100
import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
                
	
		
		System.out.println("Login: ");
		String login = input.next();
		
		System.out.println("Senha: ");
		String senha = input.next();
		
		Usuario usuario = new Usuario(login,senha);
		
		String teste = "sim";
		Tweet tweet = new Tweet();
                
		while(teste.equalsIgnoreCase("sim"))
		{	
			System.out.println("Entre com o texto de até 140 caracteres: ");
 			tweet.setDescricao(input.next());
			usuario.addTweet(tweet);
			
			
			System.out.println("Deseja Tweetar novamente? - Obs:Digite sim ou nao ");
			teste = input.next();
			
			
		}
		
		usuario.Listar();
		input.close();
		
		
	}

}
