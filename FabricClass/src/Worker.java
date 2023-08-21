public abstract class Worker {
    final String type;
    protected final double[] salary;
    protected final double[] exp;
    protected Worker(String type, double[] salary, double[] exp) {
        this.type = getType();
        this.salary = salary;
        this.exp = exp;
    }
    protected String getType() {
        return getClass().getSimpleName();
    }
    protected abstract double Salary();
    protected abstract double Exp();

    public String toString() {
        return getType() + " - Salary " + Salary() +
                ", experience: " + Exp();
    }
}
