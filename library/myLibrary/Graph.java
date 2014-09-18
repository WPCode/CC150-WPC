package myLibrary;

public class Graph{
	
	public Vertice[] vertices;
	public int count;
	
	public Graph(int count){
		this.vertices = new Vertice[count];
		this.count = 0;
	}
	
	public void addVertice(Vertice node){
		vertices[count++]=node;
	}
	
	public Vertice[] getNodes(){
		return this.vertices;
	}
}