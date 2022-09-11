import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.management.ServiceNotFoundException;

public class Gigasecond {
    public LocalDate momentDate;

    public LocalDateTime momentDateTime; 

    public Gigasecond(LocalDate moment) {
        this.momentDate = moment;
    }

    public Gigasecond(LocalDateTime moment) {
        this.momentDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        if (this.momentDateTime != null) {
            return this.momentDateTime.plusSeconds(1000000000);
        } else {
            return this.momentDate.atStartOfDay().plusSeconds(1000000000);
        }
    }
}
