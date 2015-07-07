
/**
 * Created by edgar pino on 7/6/15.
 */
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double testOne, testTwo, testThree, averageScore;
    //Constructor
    public Student(String first, String last, Address home, Address school, double one, double two, double three){
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testOne = one;
        testTwo = two;
        testThree = three;
    }
    //overload constructor
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testOne = 0;
        testTwo = 0;
        testThree = 0;
    }
    //set test score
    public void setTestScores(int index, double value) {

        switch (index) {
            case 1: testOne = value;
                break;
            case 2: testTwo = value;
                break;
            case 3: testThree = value;
                break;

        }
    }

    //return test score
    public double getTestScores(int index) {
        double value;
        switch (index) {
            case 1: value =  testOne;
                break;
            case 2: value =  testTwo;
                break;
            case 3: value = testThree;
                break;
            default: value = 0;
        }

        return value;

    }

    //get average test score

    public double getAverageScore() {
        return (testOne + testTwo + testThree ) / 3;
    }

    //return string
    public String toString() {
        String results;
        results = firstName + " " + lastName + "\n";
        results  += "Home Address:\n" + homeAddress + "\n";
        results += "School Address:\n" + schoolAddress + "\n";
        results += "Test Scores:\n" + testOne + ", " + testTwo + ", " + testThree + "\n";
        results += "Average Test Score:\n" + getAverageScore();

        return results;
    }
}
