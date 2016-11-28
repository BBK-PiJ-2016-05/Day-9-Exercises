public class ArrayStack<T extends Number> implements Stack<T> {
	private Number[] contents;
	private int headIndex;
	
	public ArrayStack(){
		contents = new Number[10];
		headIndex = 0;
	}
	
	public void push(T newElement) {
		contents[headIndex] = newElement;
		headIndex++;
	}
	
	public T pop() {
		if (headIndex == 0) {
			return null;
		}
	headIndex--;
	T result = (T) contents[headIndex];
	contents[headIndex] = null;
	return result;
	}
	
	public boolean checkEmptiness(){
		if (headIndex == 0) {
			return true;
		}
		return false;
	}
	
}