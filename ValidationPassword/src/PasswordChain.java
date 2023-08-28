public abstract class PasswordChain implements Validation {

    private PasswordChain next;

    public void setNext(PasswordChain next) {
        this.next = next;
    }

    public String getValidation(Password password) {
        if (Checked(password) == true) {
            System.out.print("Пароль " + "'" + password.getPass() + "'");
            return Done(password);
        }
        else if (Checked(password) == false) {
            System.out.print("Пароль " + "'" + password.getPass() + "'");
            return NoDone(password);
        }
        else if (next != null) {
            return next.getValidation(password);
        } else
            throw new IllegalArgumentException("Не верный");
    }
    abstract boolean Checked(Password password);
}
