/**
 * Created by Saahil on 12/11/2015.
 */
public class EmptyCellException extends Exception {
    String cellname;
    EmptyCellException (String name){
        this.cellname = name;
    }

}
