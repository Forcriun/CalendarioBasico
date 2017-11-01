
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

    /**
     * Advances the date one day, and considering every month of the year has 30
     * days, it acts accordingly so for both the month and the year values.
     */
    public void advanceDate()
    {
        day += 1;
        if(day == 31){
            day = 1;
            month += 1;
        }
            if(month == 13){
                month = 1;
                year += 1;
            }
                if(year == 100){
                    year = 1;
                }
    }
}
