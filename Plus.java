// Class for addition formulas

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
  public int valueOf() {
    return this.left.valueOf() + this.right.valueOf();
  }

}