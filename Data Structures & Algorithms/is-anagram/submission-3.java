class Solution {
    public boolean isAnagram(String s, String t) {
        

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> checkedChars = new HashMap<>();

        for(char myChar: s.toCharArray()){
            checkedChars.put(myChar, checkedChars.getOrDefault(myChar, 0) + 1);
        }

        for(char myChar: t.toCharArray()){
            if(!checkedChars.containsKey(myChar)){
                return false;
            }
            if(checkedChars.get(myChar) == 0){
                return false;
            }
            checkedChars.put(myChar, checkedChars.get(myChar) - 1);
        }

        return true;
        

    }
}
