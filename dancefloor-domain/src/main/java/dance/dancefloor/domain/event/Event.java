package dance.dancefloor.domain.event;

import dance.dancefloor.domain.common.Thing;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Event extends Thing {
    private LocalTime doorTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private String about;
    private boolean isAccessibleForFree;
    private int maximumAttendeeCapacity;
    private String typicalAgeRange;
}
