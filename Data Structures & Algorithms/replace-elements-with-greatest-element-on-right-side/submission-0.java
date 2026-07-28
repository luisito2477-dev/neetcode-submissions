class Solution {
    public int[] replaceElements(int[] arr) {

        int maxValue = -1;
        int aux;

        for(int i = arr.length - 1; i > - 1; i--){

            
            if(arr[i] > maxValue){
                aux = arr[i];
                arr[i] = maxValue;
                maxValue = aux;
            } else {
                 arr[i] = maxValue;
            }
        } 

        return arr;
    }
}