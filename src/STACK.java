//Stack Implementation 


public class STACK {
	
	private int mSize;
	private int top;
	private int[] stackArr;
	
	public STACK(int inSize){
		this.mSize = inSize;
		stackArr = new int[mSize];
		this.top = -1;
	}
	
	public void push (int inPush){
		stackArr[++top] = inPush; //pre-increment operator
	}
	
	public int pop (int inPop){
		return (stackArr[top--]);//post increment operator
	}

	public boolean emptyStack(){
		if (top == -1)
			return true;
		else
			return false;
	}
	
	public int peek(){
		return stackArr[top];
	}

	public boolean fullStack(){
		if (top > -1)
			return true;
		else 
			return false;
	}
}
