package yourworkhere;

public interface IAccountManager {

    public boolean withdraw(double amount);

    public boolean deposit(double amount);

    public abstract IAccountManager getAccountManager();

}