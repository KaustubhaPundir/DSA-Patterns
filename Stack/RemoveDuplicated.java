class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        StringBuilder result=new StringBuilder("");
        int length= s.length();
        stack.push(s.charAt(0));
        for(int i=1;i<length;i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        result.reverse();

        return result.toString();
    }    
}
