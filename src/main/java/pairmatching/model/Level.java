package pairmatching.model;

public enum Level {
    LEVEL1, LEVEL2, LEVEL3, LEVEL4, LEVEL5;

    public static Level validateAndGetLevel(String rawLevel){
        String level = rawLevel.trim();
        if (level.equals("레벨1")) return LEVEL1;
        if (level.equals("레벨2")) return LEVEL2;
        if (level.equals("레벨3")) return LEVEL3;
        if (level.equals("레벨4")) return LEVEL4;
        if (level.equals("레벨5")) return LEVEL5;
        throw new IllegalArgumentException(); //TODO: 예외처리
    }
}
