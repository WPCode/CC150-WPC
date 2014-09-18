package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import myLibrary.Graph;
import myLibrary.Vertice;

public class FourTwo {
	
	/*
		Given a "directed" graph, design an algorithm to find out whether there is a route between two nodes.
	*/

	public static void main(String[] args){

		Graph g = createGraph(9);

		System.out.println(g.count);

		Vertice[] vert = g.getNodes();
		
		System.out.println(findRouteDFS(g, vert[0], vert[5]));

		//System.out.println(findRouteBFS(g, vert[0], vert[5]));

		//System.out.println(findRouteBFS2(g, vert[0], vert[6]));

	}

	
	
	private static boolean findRouteBFS2(Graph g, Vertice vertice1, Vertice vertice2) {
		// TODO Auto-generated method stub
		LinkedList<Vertice> queue = new LinkedList<Vertice>();
		queue.add(vertice1);
		boolean found = false;
		while(!queue.isEmpty()){
			Vertice head = queue.poll();
			System.out.print(head.vertice + "-");
			if(head == vertice2){
				return true;
			}
			for(Vertice v : head.adjacence){
				if(!v.isVisited){
					v.isVisited = true;
					queue.add(v);
				}
			}
		}
		return false;
	
	}
	
	
	private static boolean findRouteDFS(Graph g, Vertice vertice1, Vertice vertice2) {
		// TODO Auto-generated method stub

		Stack<Vertice> stack = new Stack<Vertice>();
		stack.push(vertice1);
		boolean found = false;
		while(!stack.isEmpty()){
			Vertice node = stack.peek();
			if(node == vertice2){
				found = true;
				break;
			}else{
				System.out.print(node.vertice + " -> ");

				Vertice nextUnvisited = node.getNextUnvisited();

				if(nextUnvisited == null){
					node.isVisited = true;
					stack.pop();
				}else{
					stack.push(nextUnvisited);
				}
			}		
		}
		System.out.println();
		if(found){
			while(!stack.empty())
				System.out.print(stack.pop().vertice + " <- ");	
			return true;
		}else{
			return false;
		}
	}

	private static Graph createGraph(int c) {

		Graph g = new Graph(c);
		
		Vertice node0 = new Vertice("A", 3);
		Vertice node1 = new Vertice("B", 1);
		Vertice node2 = new Vertice("C", 0);
		Vertice node3 = new Vertice("D", 1);
		Vertice node4 = new Vertice("E", 1);
		Vertice node5 = new Vertice("F", 0);
		Vertice node6 = new Vertice("G", 0);
		Vertice node7 = new Vertice("H", 1);
		Vertice node8 = new Vertice("I", 0);


		node0.addAdjacent(node1);
		node0.addAdjacent(node2);
		node0.addAdjacent(node3);
		node3.addAdjacent(node4);
		node4.addAdjacent(node5);
		node1.addAdjacent(node7);
		node7.addAdjacent(node8);

		
		g.addVertice(node0);
		g.addVertice(node1);
		g.addVertice(node2);
		g.addVertice(node3);
		g.addVertice(node4);
		g.addVertice(node5);
		g.addVertice(node6);
		g.addVertice(node7);
		g.addVertice(node8);


		return g;
	}
}