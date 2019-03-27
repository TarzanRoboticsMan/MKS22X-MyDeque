import java.util.NoSuchElementException;

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

  public String toString(){
    String ans="{";
    for(int x=start;x!=end;x++){
      if(x==data.length) x=0;
      ans+=data[x]+" ";
    }
    return ans+"}";
  }

  public void addFirst(E element){
    if(element==null) throw new NullPointerException();
    if(size==data.length) resize();
    if(start==0) start=data.length;
    data[--start]=element; //prefix -- returns the new value instead of old
  }

  public void addLast(E element){
    if(element==null) throw new NullPointerException();
    if(size==data.length) resize();
    if(++end==data.length) end=0;
    data[end]=element;
  }

  public E removeFirst(){
    if(size==0) throw new NoSuchElementException();
    int oldStart = start;
    if(++start==data.length) start=0; //assigns then pulls value
    return data[oldStart];
  }
  public E removeLast(){
    if(size==0) throw new NoSuchElementException();
    int oldEnd = end;
    if(--end==-1) end=data.length-1; //assigns then pulls value
    return data[end];
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    E[] newData = (E[])new Object[data.length*2];
    int newEnd=0;
    for(int x=start;x!=end;x++){
      if(x==data.length) x=0;
      newData[newEnd++]=data[x]; //Pulls value of newEnd and THEN adds 1
    }
    newData[newEnd]=data[end];
    data=newData;
    start=0; end=newEnd;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }
}
