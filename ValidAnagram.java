class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int freqS[] = new int[26];
        int freqT[] = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            int indexS = chS - 'a';
            int indexT = chT - 'a';
            freqS[indexS]++;
            freqT[indexT]++;
        }
        for(int j = 0; j < 26; j++){
            if(freqS[j] != freqT[j]){
                return false;
            }
        }
        return true;
}
}