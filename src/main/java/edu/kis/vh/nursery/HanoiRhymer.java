package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

private static final int _TOTAL_REJECTED = 0;
int totalRejected = _TOTAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		}
		else {
			super.countIn(in);
		}
	}
}
