// class for simple formulas consisting of just a single number

import java.util.LinkedList;

class Num implements IFormula {
  int value;
  Num(int value) {
    this.value = value;
  }
  
  // does formula reference other cells?
  public boolean noRefs() {
    return true;
  }
  
  // compute value of formula
  public int valueOf(ISpreadsheet s, LinkedList<String > used) {
    return this.value;
  }
 
}