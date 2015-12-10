// The interface for formulas
  
interface IFormula {
  // does formula reference other cells?
  boolean noRefs();
  // compute value of formula; starter code throws exception on cellRefs
  int valueOf() ;
}





