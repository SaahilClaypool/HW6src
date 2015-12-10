import java.util.HashMap;
import java.util.LinkedList;

class Spreadsheet implements ISpreadsheet {
  Spreadsheet(){
    cells = new HashMap<>();
  }
  HashMap<String, IFormula> cells;
  // associates the given cellname with the given formula
  //   such that subsequent references to the cell yield the formula
  public void editContents(String cellname, IFormula expr) {
    cells.put(cellname, expr);
  }
  
  // compute the current value of the named cell
  public Integer lookupValue(String forcell) throws CyclicFormulaException {
    // replace this with actual code

    return lookupValue(forcell, new LinkedList<String>());
  }
  public Integer lookupValue(String forcell, LinkedList<String> used) throws CyclicFormulaException {
    return cells.get(forcell).valueOf(this,used);
  }

}