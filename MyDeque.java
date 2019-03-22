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
      if(x=data.length) x=0;
      ans+=data[x]+" ";
    }
    return ans+"}";
  }

  public void addFirst(E element){
    if(element==null) throw(NullPointerException e);
    if(size==data.size) resize();
    if(start==0) start=data.length;
    data[--start]=element; //prefix -- returns the new value instead of old
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    newData = (E[])new Object[data.length*2];
    for(int x=start, int i=0;x!=end;x++,i++){
      if(x=data.length) x=0;
      newData[i]=data[x];
    }
    data=newData;
  }
  /*
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
  */
}
