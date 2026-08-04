class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char aux = s.charAt(i);
 
            switch(aux){
                case ']':
                    
                    if(stack.isEmpty() || stack.peek() != '['){
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':

                    if(stack.isEmpty() || stack.peek()  != '{'){
                        return false;
                    }
                    stack.pop();
                    break;
                case ')':

                    if(stack.isEmpty() || stack.peek() != '('){
                        return false;
                    }
                    stack.pop();
                    break;
                default:
                    stack.push(aux);
            }

        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;

    }
}
