public class Pension {
    static double calculateTime(int numYear, int numMonth, int numDay) {
        return numYear + numMonth * 30.0 + numDay * 360.0;
    }
    static double calculatePension(double time, double avgSalary, double lastSalary, int option) {
        if(option == 0) {
            return lastSalary;
        }
        else {
            double limit = avgSalary * 50 * 0.7;
            if(avgSalary < limit) {
                return avgSalary;
            }
            else {
                return limit;
            }
        }
    }
    public static void main(String[] args) {
        //main code goes here
    }
}
