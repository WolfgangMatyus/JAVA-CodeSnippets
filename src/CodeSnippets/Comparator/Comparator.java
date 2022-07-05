package CodeSnippets.Comparator;



public class Comparator {

    public static void main(String[] args) {


        //System.out.println(Flight.compareTo(Flight o));
        //System.out.println(compare(Flight o));
    }

    public static int compare(Flight o1, Flight o2) {
        return o1.getDeparture().compareTo(o2.getDeparture());
    }
}

class Flight{
    //public int flightID;
    public String flightID;
    private DateTime departure;

    public DateTime getDeparture() {
        return departure;
    }

    public void setDeparture(DateTime departure) {
        this.departure = departure;
    }
    public int compareTo(Flight o){
        // if flightID is integer
        //Integer.compare(this.flightID, o.flightID);
        return this.flightID.compareTo(o.flightID);
    }

}

class DateTime implements Comparable<DateTime>{
    private int year, month, day, hour, min;

    public DateTime(DateTime o) {
        this.year = o.year;
        this.month = o.month;
        this.day = o.day;
        this.hour = o.hour;
        this.min = o.min;
    }

    public DateTime(int year, int month, int day, int hour, int min) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
    }

    public long timestamp() {
        return ((((year * 100 + month) * 100 + day) * 100 + hour) * 100 + min);
    }

    @Override
    public int compareTo(DateTime o) {
        return Long.compare(timestamp(), o.timestamp());
    }
}