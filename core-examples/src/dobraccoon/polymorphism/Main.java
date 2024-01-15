package dobraccoon.polymorphism;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        SchoolLocation mathClassRoom = new MathClassRoom(2, 32);
        Lesson mathLesson = new Lesson(LocalDateTime.MIN, LocalDateTime.MAX, mathClassRoom, LessonType.MATH);
    }
}
