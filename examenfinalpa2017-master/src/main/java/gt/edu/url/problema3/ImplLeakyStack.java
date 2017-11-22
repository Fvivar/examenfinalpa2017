package gt.edu.url.problema3;

import gt.edu.url.problema3.CircularLinkedList.Node;

public class ImplLeakyStack<E> implements LeakyStack<E> {
	//Node
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

	private Node<E> tail = null;
	private int t=0;
	private int topSz;
	ImplLeakyStack(int sz)
	{
		this.topSz=sz;
	}
	
	@Override
	public int size() {
		return t;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t==1);
	}

	@Override
	public E saveHistory(E e) {
		
		if(t<=topSz)
		{
			if(t == 0) {
				tail = new Node<>(e, null);
				tail.setNext(tail);
			}else {
				Node<E> newest = new Node<>(e, tail.getNext());
				tail.setNext(newest);
			}
			tail=tail.getNext();
			t++;
		}
		else
		{
			if(isEmpty()) return null;
			Node<E> head = tail.getNext();
			if(head == tail) tail = null;
			else tail.setNext(head.getNext());

			return head.getElement();
			t--;
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		return null;
	}

	@Override
	public E actual() {
		if (isEmpty()) return null;
		return null;
	}

	@Override
	public E undo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
