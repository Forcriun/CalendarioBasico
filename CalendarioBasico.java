
/**
 * This class acts as a basic calendar that lets the user change the default
 * value of its objects (1-1-1). The user can advance the date one step
 * at a time or set it at will. It can also return the date as a string
 * in "dd-mm-yy" format.
 * 
 * The calendar doesn't validate the values entered by the user, and it
 * doesn't check if the given year is a leap year. Only the years between
 * 2000 and 2099 will be taken into consideration. Every month will have
 * 30 days.
 *
 * @author (Dídac Fernández Fernández)
 * @version (01/11/2017)
 */
public class CalendarioBasico
{
    // Stores the day
    private int day;
    //Stores the month
    private int month;
    // Stores the year
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
     * by the user. Keep in mind the year will be entered as a two digit
     * maximum value (e.g.: 16 for the year 2016, and 7 for the year 2007).
     */
    public void fijarFecha(int newDay,int newMonth,int newYear)
    {
        day = newDay;
        month = newMonth;
        year = newYear;

    }

    /**
     * Advances the date one day, and considering every month of the year has
     * 30 days and every year has 12 months, it acts accordingly so for both
     * the month and the year values.
     */
    public void avanzarFecha()
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

    /**
     * Returns the date as a string in the given format ("01-01-01").
     */
    public String obtenerFecha()
    {
        String stringD = day + "-";
        String stringM = month + "-";
        String stringY = year + "";
        if(day < 10){
            stringD = "0" + day + "-";
        }
        if(month < 10){
            stringM = "0" + month + "-";
        }
        if(year < 10){
            stringY = "0" + year;
        }
        return stringD + stringM + stringY;
    }
}
