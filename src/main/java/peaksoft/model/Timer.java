package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {

    private Long nanoTime = System.nanoTime();


    public Long getTime() {
        return nanoTime;
    }


}
