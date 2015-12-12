// The interface for formulas

import java.util.LinkedList;

interface IFormula {
  // does formula reference other cells?
  boolean noRefs();
  // compute value of formula; starter code throws exception on cellRefs
  int valueOf(ISpreadsheet s, LinkedList<String> usedCells) throws CyclicFormulaException, EmptyCellException;
}





