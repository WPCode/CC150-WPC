package myLibrary;

public class Vertice{
	
	public Vertice[] adjacence;
	public int adjacentCount;
	public String vertice;
	public boolean isVisited;
	
	public Vertice(String element, int adjacentLength){
		this.adjacence = new Vertice[adjacentLength];
		this.vertice = element;
		this.adjacentCount = 0;
		this.isVisited = false;
	}
	
	public void addAdjacent(Vertice node){
		this.adjacence[adjacentCount++] = node;
	}
	
	public String getVertice(){
		return this.vertice;
	}
	
	public Vertice[] getAdjacence(){
		return this.adjacence;
	}
	
	public Vertice getNextUnvisited(){
		for(int i=0;i<adjacentCount;i++){
			if(!adjacence[i].isVisited){
				return adjacence[i];
			}
		}
		return null;
	}
}