//import java.util.Deque;
//import java.util.ArrayDeque;

class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> deque = new ArrayDeque<>();
        int aux;
        int aux2;
        for(String operation: operations){
            switch(operation) {
                case "+": // sum of the two previous scores
                    aux = deque.pop();
                    aux2 = deque.peek();
                    deque.push(aux);
                    deque.push(aux + aux2);
                    break;
                case "D": //double the previous score
                    aux = deque.peek();
                    deque.push(aux * 2);
                    
                    break;
                case "C": //remove the previous score
                    deque.pop();
                    break;
                default:
                    // code block
                    deque.push(Integer.parseInt(operation));
                }
        }

        int sum = 0;

        while(!deque.isEmpty()){
            sum += deque.pop();
        } 

        return sum;
        
    }
}