package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vertex v=new Vertex("1");
		Vertex v1=new Vertex("2");
		Vertex v2=new Vertex("3");
		Vertex v3=new Vertex("4");
		Vertex v4=new Vertex("5");
	
		List<Vertex> list=new ArrayList<>();
		
		//add neighbour
		v.addNeighbour(v1);
		v.addNeighbour(v2);
		v2.addNeighbour(v3);
		v3.addNeighbour(v4);
		
		//add vertices to the list
		list.add(v);
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		
		DFS dfs=new DFS();
		dfs.dfs(list);
		
		
		
		
	}

}
