public class Salary {
    public static void main(String[] args) {
        int salary1 = 50000;
        int increase = 2000;

        for (int year = 1; year <= 5; year++) {
            salary1 = salary1 + increase;
            System.out.println("Salary After year " + year + ": " + salary1);
        }
    }
}

