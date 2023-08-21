public class Junior extends Worker {
    public Junior(double salary, double Exp) {
        super("Junior", new double[] {salary}, new double[] {Exp});
    }
    public double Salary() {
        return 1000;
    }
    public double Exp() {
        return 1;
    }
}
