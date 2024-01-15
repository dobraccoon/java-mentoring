package dobraccoon.polymorphism;

import java.time.LocalDateTime;

public class Lesson extends SchoolEvent {
    LessonType lessonType;

    public Lesson(LocalDateTime startDateTime, LocalDateTime endDateTime, SchoolLocation schoolLocation,
                  LessonType lessonType) {
        super(startDateTime, endDateTime, schoolLocation);
        this.lessonType = lessonType;
    }
}
