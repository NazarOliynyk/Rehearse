package Testing_J_Unit_Tutorial1.Tutorial1;

// in reality this class is no longer necessary because there is @Test in TestCalculator class

public class RunTest {
    public static void main(String[] args) {
        TestCalculator testCalculator = new TestCalculator();
        try {
            testCalculator.testCalc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
