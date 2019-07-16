package patterns.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        AbstractAccount balance = new BalanceAccount(Level.BALANCE);
        AbstractAccount auth = new AuthAccount(Level.AUTHORIZATION);
        auth.setNextLink(balance);
        AbstractAccount login = new LoginAccount(Level.LOGIN);
        login.setNextLink(auth);

        login.next( "Logging with credentials DBuko", Level.LOGIN);
        login.next( "Authorizing user Dbuko", Level.AUTHORIZATION);
        login.next( "Sending 100 PLN", Level.BALANCE);

    }}