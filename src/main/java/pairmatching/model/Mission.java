package pairmatching.model;

public enum Mission {

    CAR_RACING(Level.LEVEL1, "자동차경주"), LOTTO(Level.LEVEL1, "로또"), BASEBALL(Level.LEVEL1, "숫자야구게임"),
    SHOPPING_CART(Level.LEVEL2, "장바구니"), PAYMENT(Level.LEVEL2, "결제"), SUBWAY(Level.LEVEL2, "지하철노선도"),
    PERFORMANCE_IMPROVEMENT(Level.LEVEL4, "성능개선"), DISTRIBUTION(Level.LEVEL4, "배포");

    private final Level missionLevel;
    private final String missionName;

    Mission(Level missionLevel, String missionName){
        this.missionLevel = missionLevel;
        this.missionName = missionName;
    }

    public static Mission getMission(String rawMissionName){
        String missionName = rawMissionName.trim();
        for (Mission mission : values()){
            if (mission.missionName.equals(missionName)){
                return mission;
            }
        }
        throw new IllegalArgumentException(); //TODO: [ERROR] 미션 내용 잘못 입력
    }

}
