class Solution {
    public boolean isPalindrome(String s) {

        String lowerCased = s.toLowerCase();
        boolean isPalindrome = true;
        int i = 0;
        int j = s.length() - 1;
        while(isPalindrome){

            //Si la i es mayor que j, significa que la i ya paso la mitad del string, por lo que ya es palindromo
            if(i >= j){
                break;
            }
            
            char front = lowerCased.charAt(i);
            char rear = lowerCased.charAt(j);

            //Si el caracter no es letra o digito, lo ignoramos alv
            if(!Character.isLetterOrDigit(front)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(rear)){
                j--;
                continue;
            }
            
            if(front == rear){
                i++;
                j--;
            } else{
                isPalindrome = false;
                break;
            }

        } //while

        return isPalindrome;
        
    }
}
