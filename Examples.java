// two easy test cases to make sure you've implemented
//   the right interface for autograding.  Add your
//   test cases to this class.

import tester.*;

class Examples {
  
  Examples(){}
  
  // The tests here are commented out because the Spreadsheet class
  //   methods throw exceptions that these methods don't catch.
  // Uncomment these tests cases once you have actual contents
  //   in those two methods
  
  /*
  // test that we can add two cell refs
  boolean testSimplePlusCellRefs(Tester t) {
    ISpreadsheet s = new Spreadsheet();
    s.editContents("a10", new Num(5));
    s.editContents("b10", new Num(3));
    s.editContents("c10", new Plus(new CellRef("a10"), 
                                   new CellRef("b10")));
    return t.checkExpect(s.lookupValue("c10"),
                         8);
  }
  */

  /*
  // test that cell refs grab current value of cells
  boolean testUpdateCellRefs(Tester t) {
    ISpreadsheet s = new Spreadsheet();
    s.editContents("a10", new Num(5));
    s.editContents("b10", new Num(3));
    s.editContents("c10", new Plus(new CellRef("a10"), 
                                   new CellRef("b10")));
    s.editContents("a10", new Num(9));
    return t.checkExpect(s.lookupValue("c10"),
                         12);
  }
  */
  
}