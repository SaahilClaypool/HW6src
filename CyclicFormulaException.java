class CyclicFormulaException extends Exception {
  String cellname;

  // catch upon eval
  CyclicFormulaException (String cellname) {
    this.cellname = cellname;
  }

  /**
   * determines if two cyclic exceptions are the same
   * @param o
     * @return
     */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CyclicFormulaException that = (CyclicFormulaException) o;

    return !(cellname != null ? !cellname.equals(that.cellname) : that.cellname != null);

  }

}