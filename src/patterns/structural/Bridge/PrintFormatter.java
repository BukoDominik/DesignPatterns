package patterns.structural.Bridge;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public void format(String header, List<Detail> details) {
        System.out.println("Title: " + header);
        for (Detail detail :
                details) {
            System.out.println(detail.getLabel() + " " + detail.getValue());
        }
    }
}
