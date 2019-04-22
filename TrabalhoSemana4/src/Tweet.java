
//Nome: André Luiz de Oliveira Cunha
//Matricula: 0050013100

public class Tweet {
private String descricao = new String();





public String getDescricao() {
	String erro = "Erro!!!Seu texto possui mais de 140 caracteres!!!";//Testando se o texto possui mais de 140 caracteres
	if(this.descricao.length() <= 140)
	return descricao;
	else
	return erro;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}


}

