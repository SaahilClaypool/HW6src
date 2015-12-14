// two easy test cases to make sure you've implemented
//   the right interface for autograding.  Add your
//   test cases to this class.

import tester.*;

import javax.imageio.spi.IIOServiceProvider;

class Examples {

  Examples(){}
  /*
  TEST CASE 1
    ISpreadsheet s = new Spreadsheet();
    s.editContents("a10", new Num(5));
    s.editContents("b10", new Num(3));
    s.editContents("c10", new Plus(new CellRef("a10"),
                                   new CellRef("b10")));
    s.lookupValue("c10") should return 8
   */

  // test case one, basic test

  boolean testSimplePlusCellRefs(Tester t) {
    try {
      ISpreadsheet s = new Spreadsheet();
      s.editContents("a10", new Num(5));
      s.editContents("b10", new Num(3));
      s.editContents("c10", new Plus(new CellRef("a10"),
              new CellRef("b10")));
      return t.checkExpect(s.lookupValue("c10"),
              8);
    } catch (CyclicFormulaException e) {
      return t.checkExpect(false, true);
    } catch (EmptyCellException e) {
      return t.checkExpect(false, true);
    }
  }

  boolean testCyclicTwoPaths(Tester t){
    try{
      ISpreadsheet s = new Spreadsheet();
      s.editContents("1" , new Plus(new CellRef("2"), new CellRef("2")));
      s.editContents("2", new Num(2));
      return t.checkExpect(s.lookupValue("1"), 4);
    } catch (EmptyCellException e) {
      return t.checkExpect(false,true);
    } catch (CyclicFormulaException e) {
      return t.fail("CYCLIC");
    }
  }

  boolean test2(Tester t) {
    try {
      ISpreadsheet s = new Spreadsheet();
      s.editContents("a10", new Num(5));
      s.editContents("b10", new Num(3));
      s.editContents("c10", new Plus(new CellRef("a10"),
              new CellRef("b10")));
      s.editContents("a10", new Num(9));
      return  t.checkExpect(s.lookupValue("c10"),12);
    } catch (CyclicFormulaException e) {
      return t.checkExpect(false, true);
    } catch (EmptyCellException e) {
      return t.checkExpect(false, true);
    }
  }
  public boolean testCyclic (Tester t){
    ISpreadsheet s = new Spreadsheet();
    try{
      s.editContents("a10", new CellRef("a10"));
      s.lookupValue("a10");


    } catch (CyclicFormulaException e) {
      //e.printStackTrace();
      return t.checkExpect(e.equals(new CyclicFormulaException("a10")), true);
    } catch(EmptyCellException e){
      return t.checkExpect(false, true);
    }

    return false;
  }

  // test an indirect cyclic reference
  public boolean testCyclicSecondLevel (Tester t){
    try{
      ISpreadsheet s = new Spreadsheet();
      s.editContents("1", new CellRef("2"));
      s.editContents("2", new CellRef("3") );
      s.editContents("3", new Plus(new CellRef("2"), new Num(1)));
      s.lookupValue("1");
      return t.checkExpect(false, true);
    }
    catch(CyclicFormulaException e){



      return t.checkExpect(e.equals(new CyclicFormulaException("2")), true);

    } catch (EmptyCellException e) {
      return t.checkExpect(false, true);
    }
  }
  // The tests here are commented out because the Spreadsheet class
  //   methods throw exceptions that these methods don't catch.
  // Uncomment these tests cases once you have actual contents
  //   in those two methods
  

  // test that we can add two cell refs



  // test that cell refs grab current value of cells
  boolean testUpdateCellRefs(Tester t) {
    try {
      ISpreadsheet s = new Spreadsheet();
      s.editContents("a10", new Num(5));
      s.editContents("b10", new Num(3));
      s.editContents("c10", new Plus(new CellRef("a10"),
              new CellRef("b10")));
      s.editContents("a10", new Num(9));
      return t.checkExpect(s.lookupValue("c10"),
              12);
    }
    catch(Exception e){
      return t.checkExpect(true,false);
    }
  }


}