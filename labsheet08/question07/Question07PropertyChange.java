package labsheet08.question07;

public class Question07PropertyChange {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();
        account.addPropertyChangeListener(event -> {
            System.out.println("Property: " + event.getPropertyName());
            System.out.println("Old balance: " + event.getOldValue());
            System.out.println("New balance: " + event.getNewValue());
        });

        account.setBalance(5000);
    }
}
