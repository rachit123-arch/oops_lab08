package labsheet08.question06;

public class Question06AccountBean {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();
        account.addPropertyChangeListener(event ->
            System.out.println("Balance changed from " + event.getOldValue()
                + " to " + event.getNewValue()));

        account.setBalance(1000);
        account.setBalance(1250);
    }
}
