package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

private static final int _TOTAL_REJECTED = 0;
private int totalRejected = _TOTAL_REJECTED;

	public int reportRejected() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			setTotalRejected(getTotalRejected() + 1);
		}
		else {
			super.countIn(in);
		}
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
