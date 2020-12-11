package dll;

/**
 * @author Kevin Williams 
 * N number : N00854140
 * 
 */
import java.lang.StringBuilder;
import java.util.NoSuchElementException;

public class DoubleLinkedList<E>{


	private Node<E> front;
	private Node<E> rear;
	private int size;

	public DoubleLinkedList()
	{
		front =null;
		rear = null;
		size = 0;
	}




	public int size() 
	{
		return size;
	}



	public void addToRear(E data)
	{
		rear = new Node (rear,data, null); 
		if(front==null)
			front =rear;

		if(rear.getPrev()!=null)
			rear.getPrev().setNext(rear);
		size++;
	}

	public void addToFront(E data) {
		front = new Node(null,data,front);
		if(size ==0)
			rear = front;
		if(front.getNext()!=null)
			front.getNext().setPrev(front);
		size++;


	}


	// should throw NoSuchElementException if it can't remove


	public E removeFromRear() {
		E temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else if(size ==1 )
		{
			temp=rear.getData();
			front = null;
			rear=null;

		}
		else
		{
			//if(rear!=null)
			temp = rear.getData();
			
			rear =rear.getPrev();
			rear.setNext(null);


		}
		size--;
		return temp; 

	}
	// should throw NoSuchElementException if it can't remove
	public E removeFromFront() 
	{

		E temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else if(size ==1 )
		{
			temp=front.getData();
			front = null;
			rear=null;
		}
		else
		{
			temp=front.getData();
			front = front.getNext();
			front.setPrev(null);

		}
		size--;
		return temp; 

	}

	// takes in 0 based position, should throw NoSuchElementException if it can't remove
	public E get(int pos)
	{
		E current;
		int count;
		Node <E> temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else

		{
			count = 0;
			temp = front; 
			while((count!=pos)&&(temp!=null))
			{
					count++;	
				temp=temp.getNext();
			}
			
			if(pos>size)
			{
				throw new NoSuchElementException("Element not in Doubly Linked List");
			}
			
		}
		return temp.getData();
	}



	public String toString()
	{
		StringBuilder theString = new StringBuilder();
		Node <E > current = front;

		while (current!=null)

		{
			theString.append(current.getData().toString()+"\n");
			current =current.getNext();
		}
		return theString.toString();
	}

	public String reverseString()
	{
		StringBuilder theString = new StringBuilder();
		Node <E > current = rear;
		
		while (current!=null)
		{
			
			theString.append(current.getData().toString()+"\n");
			current = current.getPrev();
		}
		return theString.toString();
	}





}
