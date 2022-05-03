package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


	private static final int PEEKABOO_ERROR=-1;
	private static final int TOTAL_SIZE=-1;
	private static final int NUMBERS_SIZE=12;
	private static final int NUMBERS_FULL=NUMBERS_SIZE-1;
	private final int[] NUMBERS = new int[NUMBERS_SIZE];

	public int total = TOTAL_SIZE;

	public void countIn(int in) {
		if (!isFull()) {
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == TOTAL_SIZE;
	}
		
	public boolean isFull() {
		return total == NUMBERS_FULL;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return PEEKABOO_ERROR;
		}
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return TOTAL_SIZE;
		return NUMBERS[total--];
	}

}
