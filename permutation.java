public class permutation {
    public void main(String[] args){
        System.out.printf("%s\n",permutation("abcde", "edcba"));
        System.out.printf("%s\n", permutation("helloworld", "helloporld"));
    }
    boolean permutation(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int[] letter_array = new int[128];

        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letter_array[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            letter_array[c]--;
            if (letter_array[c] < 0){
                return false;
            }
        }

        return true;
    }
}