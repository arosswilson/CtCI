public class CheckPermutation {
  public static void main(String[] args){
    System.out.printf("%s\n",permChecker("qwerty", "ewrtqy"));
    System.out.printf("%s\n", permChecker("blah", "help"));
  }

  public static boolean permChecker(String string1, String string2){
    if(string1.length() != string2.length()){
      return false;
    }
    return sort(string1).equals(sort(string2));
  }

  private static String sort(String string){
    String[] arr = string.split("");
    java.util.Arrays.sort(arr);
    return String.join("",arr);
  }
}