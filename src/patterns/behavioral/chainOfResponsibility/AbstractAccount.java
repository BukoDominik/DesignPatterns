package patterns.behavioral.chainOfResponsibility;


import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

public abstract class AbstractAccount implements Account{
    EnumSet<Level> accesPermissions ;
    Account nextLink ;

    public AbstractAccount(Level... levels) {
        this.accesPermissions = EnumSet.copyOf(Arrays.asList(levels));
    }

    public void setNextLink(Account nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void next( String msg, Level... level) {
        if (!Collections.disjoint(accesPermissions,EnumSet.copyOf((Arrays.asList(level))))){
            System.out.println(this.getClass().getName() + " " + msg);
        }
        if (nextLink != null){
            nextLink.next(msg, level);
        }
    }
}
