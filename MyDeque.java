public class MyDeque<E>{
  private E[] data;
  private int size, start, end; //Start as 0 because of int default

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];

  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }
  /*
  public String toString(){ }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
  */
}
