public class UniqueChars {
  public static void main(String[] args){
    System.out.printf("%s\n",uniqueChecker("qwertyuiopasdfghjkl"));
    System.out.printf("%s\n", uniqueChecker("helloworld"));
  }

  public static boolean uniqueChecker(String string){
    boolean[] arr = new boolean[128];
    for(int i = 0; i < string.length(); i++){
      int charVal = string.charAt(i);
      if(arr[charVal]){
        return false;
      }
      arr[charVal] = true;
    }
    return true;
  }
}

