package patterns.behavioral.chainOfResponsibility;

public interface Account {

    void next(String msg, Level... level);

}
