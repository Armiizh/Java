public class Middle extends Worker {
    public Middle(double salary, double Exp) {
        super("Middle", new double[] {salary}, new double[] {Exp});
    }
    public double Salary() {
        return 2000;
    }
    public double Exp() {
        return 2;
    }
}
