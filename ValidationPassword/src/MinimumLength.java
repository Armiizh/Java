public class MinimumLength extends PasswordChain {

    @Override
    boolean Checked(Password password) {
        if (password.getPass().length() < 5) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public String Done(Password password) {
        return " прошел валидацию на минимальные символы";
    }
    @Override
    public String NoDone(Password password) {
        return " не прошел валидацию на минимальные символы";
    }
}
