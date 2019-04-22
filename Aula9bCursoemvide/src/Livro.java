
public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int ToPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, String autor, int toPaginas, Pessoa leitor) {
		
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setToPaginas(toPaginas);
		this.setAberto(false);
		this.setPagAtual(0);
		this.setLeitor(leitor);
	}







	public String detalhes() {
		return "Livro [titulo=" + titulo + ", \n autor="
				+  autor + ", \n ToPaginas=" + ToPaginas 
				+ ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", \n leitor=" + leitor.getNome() +
				"\n, idade = " +leitor.getIdade() +
				"\n, sexo ="+ leitor.getSexo() + "]";
	}






	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getToPaginas() {
		return ToPaginas;
	}

	public void setToPaginas(int toPaginas) {
		ToPaginas = toPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.setAberto(true);
	}


	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
	}


	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p > this.getToPaginas()) {
		this.setPagAtual(0);
		}
		else {	
		this.setPagAtual(p);
		}
	}


	@Override
	public void avancar() {
		// TODO Auto-generated method stub
		this.setPagAtual(this.getPagAtual() + 1);
	}


	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.setPagAtual(this.getPagAtual() - 1);
	}
	
}
