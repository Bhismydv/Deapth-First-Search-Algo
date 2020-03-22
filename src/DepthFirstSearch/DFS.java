package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;
	
	//constructor instantiated
	public DFS(){
	this.stack=new Stack<>();
	}
	public void dfs(List<Vertex> vertexList){
		
		//travers
		for(Vertex v:vertexList){
			//check the vertex is visited or not
			if(!v.isVisited()){
				//set visited
				v.setVisited(true);
				dfsWithStack(v);
				
				//for recursive
				
			//	dfsRecursive(v);
			}
		}
		
	}
	
	//for recursive
/*
	public void dfsRecursive(Vertex v){
		System.out.println(v+" ");
		for(Vertex vertex:v.getNeighbourList()){
		if(!vertex.isVisited()){
		vertex.setVisited(true);
		dfsRecursive(vertex);
		}
		}
		}
		*/
	
	//for stack
	private void dfsWithStack(Vertex rootVertex) {
		//stack is lifo structure
		
		//order this route to do stack
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		//stack is not empty
		while(!stack.isEmpty()){
			Vertex actualVertex=this.stack.pop();
			//print
			System.out.println(actualVertex+" ");
			
			//visit the neighours
			for(Vertex v:actualVertex.getNeighbourList()){
				//if we haven't visited
				if(!v.isVisited()){
					//set visited
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}
}
