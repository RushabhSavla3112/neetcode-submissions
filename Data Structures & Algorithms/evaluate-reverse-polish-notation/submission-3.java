class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numLists = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String ithtoken = tokens[i];
            if (ithtoken.equals("+") || ithtoken.equals("-") || ithtoken.equals("*") || ithtoken.equals("/")){
                int a = numLists.pop();
                int b = numLists.pop();
                // System.out.println(ithtoken+"  "+ a+ " "+b);
                int val =0;
                if(ithtoken.equals("+")){
                    val = a+b;
                }else if(ithtoken.equals("-")){
                    val = b-a;
                }else if(ithtoken.equals("*")){
                    val = a*b;
                }else if(ithtoken.equals("/")){
                    val = b/a;
                }
                numLists.push(val);
                // System.out.println("value= "+ val+"  "+numLists.peek());
            }else{
                numLists.push(Integer.parseInt(ithtoken));
            }
        }
        return numLists.pop();
    }
}