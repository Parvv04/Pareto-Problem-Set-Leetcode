class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> hashmap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String word = strs[i];
            int[] freq = new int[26];
            for(int j = 0; j < word.length(); j++){
                int index = word.charAt(j) - 'a';
                freq[index]++;
            }
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < 26; k++) {
                sb.append(freq[k]);
                sb.append('#');
            }
            String signature = sb.toString();

            if(!hashmap.containsKey(signature)){
                hashmap.put(signature, new ArrayList<>());
            }
            hashmap.get(signature).add(word);
        }
        output.addAll(hashmap.values());
        return output;        
    }
}