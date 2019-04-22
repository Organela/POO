

//Nome: André Luiz de Oliveira Cunha
//Matricula: 0050013100
import java.util.ArrayList;

public class Usuario{

	private String login;
	private String senha;	
	private ArrayList<Tweet> tweets;
	
public Usuario(String login, String senha) {
		this.tweets = new ArrayList<>();
		this.setLogin(login);
		this.setSenha(senha);
	
}
	public void Listar()//Tweet e Longin listados
	{	int i = 0;
         
        System.out.printf("\nLogin: %s\n\n", this.getLogin());
                
		for (i = 0; i < this.tweets.size(); i++) {
			
			Tweet tweet = this.tweets.get(i);
			System.out.println("Descrição:" + tweet.getDescricao());
		
		}
		
	}
	
        public void addTweet(Tweet t){
            
        	this.tweets.add(t);
            
        }
	
	public String getLogin() {
		
		return login;
		}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		
		if(senha.equalsIgnoreCase("poo"))// Verificando se a senha está correta
		this.senha = senha;
		
		else {
		
		System.out.println("Senha incorreta !!!");
		System.exit(0);
		
		}
	}
	
}
