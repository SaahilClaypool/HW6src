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
  public Integer lookupValue(String forcell) throws CyclicFormulaException , EmptyCellException{


    return lookupValue(forcell, new LinkedList<String>());
  }

  /**
   * computes value of given cell.
   * @param forcell : target cell
   * @param used : Takes in to account each cell that has already been visited
   * @return
   * @throws CyclicFormulaException
   * @throws EmptyCellException
     */
  public Integer lookupValue(String forcell, LinkedList<String> used) throws CyclicFormulaException, EmptyCellException {
    IFormula f = cells.get(forcell);
    if(f == null){
      throw new EmptyCellException(forcell);
    }
    return cells.get(forcell).valueOf(this,used);
  }

}