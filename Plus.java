// Class for addition formulas

import java.util.LinkedList;

class Plus implements IFormula {
  IFormula left;
  IFormula right;
  
  Plus(IFormula left, IFormula right) {
    this.left = left;
    this.right = right;
  }
  
  // does formula reference other cells?
  public boolean noRefs() {
    return this.left.noRefs() && this.right.noRefs();
  }
  
  // compute value of formula

  /**
   * takes in a list of previously used strings. If current cell has been used throws an error
   *
   * @param sheet
   * @param used
   * @return
     */
  public int valueOf(ISpreadsheet sheet, LinkedList<String> used) throws CyclicFormulaException {

    return this.left.valueOf(sheet,used) + this.right.valueOf(sheet,used);
  }

}