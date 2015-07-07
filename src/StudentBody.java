/**
 * Created by edgar971 on 7/6/15.
 */
public class StudentBody {
    public static void main(String[] args) {
        //school address
        Address school = new Address("2484 Street Ave.", "Green Bay", "WI", 54303);

        //Albert's info
        Address ahome = new Address("1245 Day St.", "Green Bay", "WI", 54311);
        Student albert = new Student("Albert", "Appleseed", ahome,school, 99.5, 85.4,90.5);

        //Edgar's Info
        Address ehome = new Address("3040 Pecan Blv.", "Green Bay", "WI", 54311);
        Student edgar = new Student("Edgar", "Pino", ehome, school);
        //set edgars test scores
        edgar.setTestScores(1, 89.9);
        edgar.setTestScores(2,97.5);
        edgar.setTestScores(3,95.2);

        //output data
        System.out.println(albert.toString());
        System.out.println();
        System.out.println(edgar.toString());




    }
}
