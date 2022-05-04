package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int _ARRAY_SIZE = 12;

	private static final int _FULL=_ARRAY_SIZE-1;
	private static final int _PEEKABOO_ERROR=-1;
	private static final int _TOTAL = -1;

	private final int[] NUMBERS = new int[_ARRAY_SIZE];

	public int getTotal() {
		return total;
	}

	public int total = _TOTAL;

	public void countIn(int in) {
		if (!isFull()) {
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == _TOTAL;
	}
		
	private boolean isFull() {
		return total == _FULL;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return _PEEKABOO_ERROR;
		}
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return _TOTAL;
		return NUMBERS[total--];
	}

}
