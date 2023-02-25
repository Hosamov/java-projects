public class StringMethods {
  public static void main(String[] args) {
    
    String birthDate = "25/11/1982";
    int startingIndex = birthDate.indexOf("1982");
    System.out.println("startingIndex = " + startingIndex);
    System.out.println("Birth year = " + birthDate.substring(startingIndex));

    System.out.println("Month = " + birthDate.substring(3, 5));

    String newDate = String.join("/", "25", "11", "1982");
    System.out.println("newDate = " + newDate);

    // Valid but inefficient (using concat):
    newDate = "25";
    newDate = newDate.concat("/");
    newDate = newDate.concat("11");
    newDate = newDate.concat("/");
    newDate = newDate.concat("1982");
    System.out.println("newDate = " + newDate);

    // Using normal concatination (also inefficient, but more efficient than above):
    newDate = "25" + "/" + "11" + "/" + "1982";
    System.out.println("newDate = " + newDate);

    // Method chaining example:
    newDate = "25".concat("/").concat("11").concat("/").concat("1982");
    System.out.println("newDate = " + newDate);

    //Replace methods:
    System.out.println(newDate.replace('/', '-'));
    System.out.println(newDate.replace("2", "00"));

    System.out.println(newDate.replaceFirst("/", "-")); // replace first 
    System.out.println(newDate.replaceAll("/", "---")); // replace all 

    // Repeat method:
    System.out.println("ABC\n".repeat(3)); // repeat string 3 times
    System.out.println("-".repeat(20)); // repeat '-' 3 times

    // Indent method:
    System.out.println("ABC\n".repeat(3).indent(8)); 
    System.out.println("-".repeat(20)); 

    System.out.println("    ABC\n".repeat(3).indent(-2)); // un-indent two spaces
    System.out.println("-".repeat(20)); 
  }
}
