package labsheet08.question06;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private double balance;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        double oldBalance = this.balance;
        this.balance = newBalance;
        propertyChangeSupport.firePropertyChange("balance", oldBalance, newBalance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
