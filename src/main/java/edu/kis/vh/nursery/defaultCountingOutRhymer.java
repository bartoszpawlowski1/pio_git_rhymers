package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int _ARRAY_SIZE = 12;

	private static final int _TOTAL = -1;

	private int[] NUMBERS = new int[_ARRAY_SIZE];

	public int total = _TOTAL;

	public void countIn(int in) {
		if (!isFull()) {
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == _TOTAL;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return _TOTAL;
		}
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return _TOTAL;
		return NUMBERS[total--];
	}

}
