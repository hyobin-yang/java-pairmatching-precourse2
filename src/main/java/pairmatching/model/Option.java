package pairmatching.model;

public class Option {
    private final Course course;
    private final Level level;
    private final Mission mission;

    public Option(Course course, Level level, Mission mission){
        this.course = course;
        this.level = level;
        this.mission = mission;
    }
}
