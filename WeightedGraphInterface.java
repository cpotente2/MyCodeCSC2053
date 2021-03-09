import java.util.Queue;

//---------------------------------------------------------------------------
// WeightedGraphInterface.java       by Dale/Joyce/Weems           Chapter 10
//
// Interface for classes that implement a directed graph with weighted edges.
// Vertices are objects of class T and can be marked as having been visited.
// Edge weights are integers.
// Equivalence of vertices is determined by the vertices' equals method.
//
// General precondition: Except for the addVertex and hasVertex methods, 
// any vertex passed as an argument to a method is in this graph.
//---------------------------------------------------------------------------


	

public interface WeightedGraphInterface<T>
{
  public boolean isEmpty();
  // Returns true if this graph is empty; otherwise, returns false.

  public boolean isFull();
  // Returns true if this graph is full; otherwise, returns false.
  
  public void addVertex(T vertex);
  // Preconditions:   This graph is not full.
  //                  vertex is not already in this graph.
  //                  vertex is not null.
  //
  // Adds vertex to this graph.

  public boolean hasVertex(T vertex);
  // Returns true if this graph contains vertex; otherwise, returns false.

  public void addEdge(T fromVertex, T toVertex, int weight);
  // Adds an edge with the specified weight from fromVertex to toVertex.

  public int weightIs(T fromVertex, T toVertex);
  // If edge from fromVertex to toVertex exists, returns the weight of edge;
  // otherwise, returns a special “null-edge” value.

  public Queue<T> getToVertices(T vertex);
  // Returns a queue of the vertices that vertex is adjacent to.
  

  public void clearMarks();
  // Unmarks all vertices.

  public void markVertex(T vertex);
  // Marks vertex.

  public boolean isMarked(T vertex);
  // Returns true if vertex is marked; otherwise, returns false.
  
  public T getUnmarked();
  // Returns an unmarked vertex if any exist; otherwise, returns null.
}
