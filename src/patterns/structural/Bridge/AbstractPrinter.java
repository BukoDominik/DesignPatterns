package patterns.structural.Bridge;

import java.util.List;

public abstract class AbstractPrinter {
    public void print(Formatter formatter){
        formatter.format(getHeader(), getDetails());
}

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
