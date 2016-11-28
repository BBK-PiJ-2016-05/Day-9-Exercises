public class UseGenericStack {

	public static void main(String[] args) {
		UseGenericStack launcher = new UseGenericStack();
		launcher.launch();
	}
	
	public void launch() {
		ArrayStack<Double> myStack = new ArrayStack<>();
		System.out.println(myStack.checkEmptiness());
		Double firstNumber = 12.4;
		Double secondNumber = 13.9;
		myStack.push(firstNumber);
		myStack.push(secondNumber);
		System.out.println(myStack.checkEmptiness());
		System.out.println(myStack.pop());
	}
}
