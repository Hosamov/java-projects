public class MegabytesConverter {
  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(-1);
  }
  
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    int mb = 1024; //kb
    if(kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kiloBytes + " KB = " + (kiloBytes / mb) + " MB" + " and " + (kiloBytes % mb) + " KB" );
    }
  }
}
