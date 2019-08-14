package Memento;

public class Memento {
	private String article;
	
	public Memento(String articleSave)
	{
		this.article = articleSave;
	}
	
	public String getArticle()
	{
		return this.article;
	}
}
