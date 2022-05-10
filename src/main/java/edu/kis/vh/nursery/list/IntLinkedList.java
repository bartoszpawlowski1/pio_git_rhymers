package edu.kis.vh.nursery.list;

public class IntLinkedList {
	
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		/**
		 * Konstruktor ustawiajacy wartosc wezla
		 * @param i nowa wartosc wezla
		 */
		public Node(int i) {
			setValue(i);
		}

		/**
		 * Metoda umozliwiajaca pobranie wartosci wezla
		 * @return wartosc wezla
		 */
		public int getValue() {
			return value;
		}

		/**
		 * Metoda umozliwiajaca ustawienie wartosci wezla
		 * @param value nowa wartosc wezla
		 */
		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * Pobranie poprzedniego wezla
		 * @return porzedni wezel
		 */
		public Node getPrev() {
			return prev;
		}

		/**
		 * Ustawienie poprzedniego wezla
		 * @param prev nowy wezel
		 */
		public void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Pobranie nastepnego wezla
		 * @return nastepny wezel
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * Ustawienie nastepnego wezla
		 * @param next nowy wezel
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}


	private Node last;
	private int i;

	/**
	 * Metoda umozliwiajaca wstawienie nowego wezla do listy
	 * @param i wartosc nowego wezla
	 */
	public void push(int i) {
		if (getLast() == null) {
			setLast(new Node(i));
		}
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	/**
	 * Metoda sprawdzajaca czy lista jest pusta
	 * @return true jest lista jest pusta, false jesli znajduja sie w niej elementy
	 */
	private boolean isEmpty() {
		return getLast() == null;
	}

	/**
	 * Metoda sprawdzajaca czy lista jest pelna
	 * @return false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Metoda umozliwiajaca pobranie wartosci ostatniego wezla
	 * @return wartosc ostatniego wezla na liscie
	 */
	public int top() {
		if (isEmpty()) {
			return -1;
		}
		return getLast().getValue();
	}

	/**
	 * Metoda umozliwiajaca usuniecie ostatniego wezla z listy
	 * @return wartosc usunietego wezla
	 */
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	/**
	 * Pobranie ostatniego wezla z listy
	 * @return ostatni wezel z listy
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Ustawienie ostatniego wezla na liscie
	 * @param last nowy wezel
	 */
	public void setLast(Node last) {
		this.last = last;
	}
}
