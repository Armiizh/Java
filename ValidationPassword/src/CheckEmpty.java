public class CheckEmpty extends PasswordChain {

    @Override
    boolean Checked(Password password) {
        if (password.getPass().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public String Done(Password password) {
        return " прошел валидацию на пустоту";
    }
    @Override
    public String NoDone(Password password) {
        return " не прошел валидацию на пустоту";
    }
}
