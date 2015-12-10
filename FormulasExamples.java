// This class shows you how formulas work.  You do not need
//   to include it as part of your final solution (but
//   nothing will break if you do)

import tester.*;

class FormulasExamples {
  FormulasExamples(){}
  
  Num num2 = new Num(2);
  Num num5 = new Num(5);
  CellRef a10 = new CellRef("a10");
  Plus f1 = new Plus(num2, num5);
  Plus f2 = new Plus(a10, num5);
  
  boolean test1(Tester t) {
    return t.checkExpect(num2.noRefs(),true);
  }
/*
  boolean test2(Tester t) {
    return t.checkExpect(num2.valueOf(),2);
  }
 */
  boolean test3(Tester t) {
    return t.checkExpect(a10.noRefs(),false);
  }
  
  boolean test4(Tester t) {
    return t.checkExpect(f1.noRefs(), true);
  }

 // boolean test5(Tester t) {
   //   return t.checkExpect(f1.valueOf(), 7);
  //}
  
  boolean test6(Tester t) {
    return t.checkExpect(f2.noRefs(), false);
  }

}