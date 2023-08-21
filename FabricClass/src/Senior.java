public class Senior extends Worker {
    public Senior(double salary, double Exp) {
        super("Senior", new double[] {salary}, new double[] {Exp});
    }
    public double Salary() {
        return 5000;
    }
    public double Exp() {
        return 5;
    }
}
