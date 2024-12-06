package pairmatching.model;

public enum Answer {
    YES, NO;

    public static Answer getAnswer(String rawAnswer){
        String answer = rawAnswer.trim();
        if (answer.equals("네")) return YES;
        if (answer.equals("아니오")) return NO;
        throw new IllegalArgumentException(); //TODO: [Error] 잘못된 대답 입력 형식
    }
}
