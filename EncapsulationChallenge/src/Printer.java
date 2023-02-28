public class Printer {

  private int tonerLevel; // percentage of how much toner is left
  private int pagesPrinted; // total pages printed by the printer
  private boolean duplex; // can print duplex

  public Printer(int tonerLevel, boolean duplex) {
    this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
    this.duplex = duplex;
    this.pagesPrinted = 0;
  }

  public int addToner(int tonerAmount) {
    if ((tonerAmount < 1) || ((this.tonerLevel + tonerAmount) > 100)) {
      return -1;
    }
    this.tonerLevel += tonerAmount;
    return this.tonerLevel;
  }

  public int printPages(int pages) {
    int pagesToPrint = (duplex) ? (Math.round((float) pages / 2)) : pages;
    pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
    return pagesToPrint;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }
}
