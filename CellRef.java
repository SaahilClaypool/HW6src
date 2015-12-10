// class for capturing references to cells in formulas

class CellRef implements IFormula {
  String cellname;
  
  CellRef(String cellname) {
    this.cellname = cellname;
  }
  
  // does formula reference other cells?
  public boolean noRefs() {
    return false;
  }
  
  // compute value of formula
  public int valueOf() {
    // replace or edit the next line as part of your work
    throw new RuntimeException("Unresolved cell reference");
  }
}
