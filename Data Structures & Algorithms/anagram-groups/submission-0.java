class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> words = new HashMap<>();

        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!words.containsKey(sortedStr)){
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                words.put(sortedStr, anagrams);
            } else {
                List<String> anagrams = words.get(sortedStr);
                anagrams.add(str);
            }
        }
        return new ArrayList<>(words.values());
    }
}
