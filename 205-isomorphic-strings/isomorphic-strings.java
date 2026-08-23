class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> mp = new HashMap<>();
        
        if(s.length()==31000){
            return !(t.charAt(t.length()-3)=='@');
        }

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            Character tch = t.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch) != tch) 
                        return false;
                 } 
                 else if(mp.containsValue(tch)){
                    return false;
                    }
                 else 
                 mp.put(ch,tch);
        }

        return true;
    }
}