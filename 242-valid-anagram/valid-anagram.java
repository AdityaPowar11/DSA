class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> tp = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!tp.containsKey(ch)) {
                tp.put(ch, 1);
            } else {
                tp.put(ch, tp.get(ch) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!mp.containsKey(ch) || !tp.containsKey(ch)) {
                return false;
            }

            if (!mp.get(ch).equals(tp.get(ch))) {
                return false;
            }
        }

        return true;
    }
}