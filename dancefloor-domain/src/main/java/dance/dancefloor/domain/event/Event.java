package dance.dancefloor.domain.event;

import dance.dancefloor.domain.common.EventStatusType;
import dance.dancefloor.domain.common.PostalAddress;
import dance.dancefloor.domain.common.Thing;
import dance.dancefloor.domain.organization.Organization;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Event extends Thing {
    private LocalTime doorTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private String about;
    private boolean isAccessibleForFree;
    private int maximumAttendeeCapacity;
    private String typicalAgeRange;
    private EventStatusType status;
    private PostalAddress venue;

    private List<Organization> sponsors = new ArrayList<>();
    private List<Organization> organizers = new ArrayList<>();
    private List<Organization> founders = new ArrayList<>();
}
