// The interface for formulas

import java.util.LinkedList;

/**
 * interface to represent shared operations by formulas
 */
interface IFormula {
  // does formula reference other cells?
  boolean noRefs();

  /**
   *  compute value of formula; starter code throws exception on cellRefs
   *
   * @param aSheet : sheet that the formula is connected to
   * @param usedCells : cells that have already been visited for purpose of cycli
   * @return
   * @throws CyclicFormulaException
   * @throws EmptyCellException
     */

  int valueOf(ISpreadsheet aSheet, LinkedList<String> usedCells) throws CyclicFormulaException, EmptyCellException;
}





