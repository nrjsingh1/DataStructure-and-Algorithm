package stack_queue;

public class Stack {

	public int arraySize;
	public int top;
	int stackArray[];
	
	public boolean isStackEmpty() {
		
		return (top<0);
	}
	
	public boolean isStackFull() {
		return (top>=arraySize-1);
	}
	
	
	Stack(int arraySize){
		top =-1;
		this.arraySize=arraySize;
		stackArray = new int[arraySize];
		
	}
	
	public void push(int x) {
		if(!isStackFull()) {
			stackArray[++top]=x;
			System.out.println("Pushed in stack-"+x+" top of stack -"+stackArray[top]+" top-"+top);
		}
		else
			System.out.println("Stack OverFLow error");
	}
	
	public int pop() {
		
		if(!isStackEmpty()) {
			System.out.println("top "+top+" element popped "+stackArray[top]);
			
			return stackArray[top--];
		}
		else {
			System.out.println("stack Underflow");
			return top;
		}
			
	}
	
	
	
}
