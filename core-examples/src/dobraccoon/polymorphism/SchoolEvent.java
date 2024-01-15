package dobraccoon.polymorphism;

import java.time.LocalDateTime;

public abstract class SchoolEvent {
    LocalDateTime startDateTime;
    LocalDateTime endDateTime;
    SchoolLocation schoolLocation;

    public SchoolEvent(LocalDateTime startDateTime, LocalDateTime endDateTime, SchoolLocation schoolLocation) {
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.schoolLocation = schoolLocation;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public SchoolLocation getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(SchoolLocation schoolLocation) {
        this.schoolLocation = schoolLocation;
    }
}
