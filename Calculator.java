public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] vals = s.split(" ");
      MyDeque stack = new MyDeque();
      for(x:vals){
        if(x=="+") stack.addLast(stack.removeLast()+stack.removeLast());
        else if(x=="-") stack.addLast(0-stack.removeLast()+stack.removeLast());
        else if(x=="*") stack.addLast(stack.removeLast()*stack.removeLast());
        else if(x=="/") stack.addLast(1/stack.removeLast()*stack.removeLast());
        else stack.addLast(Integer.parseInt(x));
      }
      return stack.getLast();
    }
}
