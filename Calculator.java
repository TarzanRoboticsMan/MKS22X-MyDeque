public class Calculator{
  public static void main(String[]args){
    System.out.println(eval(args[0]));
  }
  /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, separated by spaces.
  */
  public static double eval(String s){
    String[] vals = s.split(" ");
    MyDeque<Double> stack = new MyDeque<Double>();
    for(String x:vals){
      System.out.println(x); System.out.println(stack);
           if("+".equals(x)) stack.addLast(stack.removeLast()+stack.removeLast());
      else if("-".equals(x)) stack.addLast(0-stack.removeLast()+stack.removeLast());
      else if("*".equals(x)) stack.addLast(stack.removeLast()*stack.removeLast());
      else if("/".equals(x)) stack.addLast(1/stack.removeLast()*stack.removeLast());
      else if("%".equals(x)){
        Double last = stack.removeLast();
        stack.addLast(stack.removeLast()%last);
      }
      else stack.addLast(Double.parseDouble(x));
      System.out.println(stack); System.out.println("\n");
    }
    return stack.getLast();
  }
}
