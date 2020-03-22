package DepthFirstSearch;

import java.util.List;
import java.util.ArrayList;

public class Vertex {

	//vertices
	private String name;
	//check the vertex visited or not
	private boolean visited;
	//store the reference neighbour list or adjacent list
	private List<Vertex> neighbourList;
	
	//constructor
	public Vertex(String name){
		this.name=name;
		this.neighbourList=new ArrayList<>();
	}
	
	public void addNeighbour(Vertex vertex){
		//add the vertex to the  neighbourList 
		this.neighbourList.add(vertex);
	}
	
	//generate getter and setters
	
	public String toString(){
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
}
