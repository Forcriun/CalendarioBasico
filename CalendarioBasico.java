
/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (Dídac Fernández Fernández)
 * @version (01/11/2017)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico.
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        day = 1;
        month = 1;
        year = 1;

    }

    /**
     * Sets the date for the calendar according to the values introduced
     * by the user.
     */
    public void setDate(int newDay,int newMonth,int newYear)
    {
        day = newDay;
        month = newMonth;
        year = newYear;

    }
}
