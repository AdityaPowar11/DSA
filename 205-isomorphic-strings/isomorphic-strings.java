class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> mp = new HashMap<>();
        HashSet <Character> h = new HashSet<>();

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            Character tch = t.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch) != tch) 
                        return false;
                 } 
                 else if(h.contains(tch)){
                    return false;
                    }
                 else 
                 mp.put(ch,tch);
                 h.add(tch);
        }

        return true;
    }
}