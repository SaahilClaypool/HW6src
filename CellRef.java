// class for capturing references to cells in formulas

import java.util.LinkedList;

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
  public int valueOf(ISpreadsheet sheet, LinkedList<String> used) throws CyclicFormulaException, EmptyCellException {

    if(used.contains(cellname)){
      throw new CyclicFormulaException(cellname);
    }
    else{
      used = (LinkedList<String>) used.clone();
      used.add(cellname);
      return sheet.lookupValue(cellname, used);

    }
    //throw new RuntimeException("Unresolved cell reference");
  }
}
