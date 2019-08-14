package Memento;

public class Originator {
	private String article;
	
	public void set(String newArticle)
	{
		System.out.println(newArticle);
		this.article = newArticle;
	}
	
	public Memento storeInMemento()
	{
		System.out.println("From Originator: Saving to Memento");
		
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento)
	{
		article = memento.getArticle();
		
		System.out.println("From Originator: Previous Article Saved in Memento\n" + article);
		
		return article;
	}
}
