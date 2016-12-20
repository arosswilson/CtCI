public class UniqueChars {
  public static void main(String[] args){
    System.out.printf("%s\n",uniqueChecker("qwertyuiopasdfghjkl"));
    System.out.printf("%s\n", uniqueChecker("helloworld"));
  }

  // public static boolean uniqueChecker(String string){
  // this assumes we're using 128 possible characters.
  //   boolean[] arr = new boolean[128];
  //   for(int i = 0; i < string.length(); i++){
  // convert character to it's int value
  //     int charVal = string.charAt(i);
  //     if(arr[charVal]){
  //       return false;
  //     }
  //     arr[charVal] = true;
  //   }
  //   return true;
  // }
  public static boolean uniqueChecker(String s) {
    int checker = 0; //this is actually a bit array we're assuming the the string is lowercase and only has a - z since this will give us only 32 places in the array
    for (int i = 0; i < s.length(); i++) {
      //subtracting a normalizes the values so you'll get 0 - 25 with 'a' - 'z'
      int val = s.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) {
        //the & for bitwise comparisons checks to see if the new bit val on the right is in the bitarray on the left. if so it returns the 'val' otherwise, it returns 0.
        return false;
      }
      checker |= (1 << val);
    }
    return true;
  }
}

