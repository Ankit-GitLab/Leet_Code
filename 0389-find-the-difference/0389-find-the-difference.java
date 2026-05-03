import java.util.HashSet;

class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<Character> set = new HashSet<>();

        for (char c : t.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        return set.iterator().next();
    }
}