public class CommanAndResult {
    final String command;
    final String result;

    public CommanAndResult(String command, String result) {
        this.command = command;
        this.result = result;
        System.out.println("command: "+ this.command + ", result: "+ this.result);
    }
}
