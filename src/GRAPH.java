
public class GRAPH {
	private VERTEX[] vertexArr;
	private int[][] matrix;
	private int totalVertices;
	private STACK stack;
	private QUEUE queue;
	private int size;
	
	public GRAPH(int inSize){
		this.size = inSize;
		totalVertices = 0;
		vertexArr = new VERTEX[size];
		matrix = new int[size][size];
	}
}
