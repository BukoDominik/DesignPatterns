package patterns.structural.Bridge;

import java.util.List;

public interface Formatter {
    public void format(String header, List<Detail> details);
}
