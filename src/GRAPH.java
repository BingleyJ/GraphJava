
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
		resetMatrix();
	}
	
	public void resetMatrix(){
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				matrix[i][j] = 0;
	}	}	}
	
	public void addVertex(char inLabel){
		vertexArr[totalVertices++]= new VERTEX(inLabel);
	}
	
	public void addEdge(int inSource, int inDest){
		matrix[inSource][inDest] = 1;
		matrix[inDest][inSource] = 1;

	}
	
	public void drawVertex(int inVertex){
		
	}
	
	public void breadthFS(){
		
	}
	
	public void DepthFS(){
		
	}
	
}

	