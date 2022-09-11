import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.management.ServiceNotFoundException;

public class Gigasecond {
    private LocalDateTime momentDateTime; 

    public Gigasecond(LocalDate moment) {
        this.momentDateTime = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.momentDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return this.momentDateTime.plusSeconds(1000000000);
    }
}
