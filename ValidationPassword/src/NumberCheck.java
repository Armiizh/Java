public class NumberCheck extends PasswordChain {

    @Override
    boolean Checked(Password password) {
        if (password.getPass().contains(String.valueOf(1))||
                password.getPass().contains(String.valueOf(2))||
                        password.getPass().contains(String.valueOf(3))||
                                password.getPass().contains(String.valueOf(4))||
                                        password.getPass().contains(String.valueOf(5))||
                                                password.getPass().contains(String.valueOf(6))||
                                                        password.getPass().contains(String.valueOf(7))||
                                                                password.getPass().contains(String.valueOf(8))||
                                                                        password.getPass().contains(String.valueOf(9))) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String Done(Password password) {
        return " прошел валидацию, в пароле есть цифры";
    }
    @Override
    public String NoDone(Password password) {
        return " не прошел валидацию, в пароле нет цифр";
    }
}
