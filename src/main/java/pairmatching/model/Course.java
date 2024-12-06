package pairmatching.model;

public enum Course {

    BACKEND, FRONTEND;

    public static Course validateAndGetCourse(String rawCourse){
        String course = rawCourse.trim();
        if (course.equals("백엔드")) return BACKEND;
        if (course.equals("프론트엔드")) return FRONTEND;
        throw new IllegalArgumentException();
    }
}
