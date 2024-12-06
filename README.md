
### 페어 매칭 조건
- 페어를 두 명씩 매칭
- 전체 페어 홀수인 경우 마지막 페어 3인 구성 🚨
- 같은 레벨에서 이미 페어 맺은 크루와 다시 페어 XX 🚨

### 페어 매칭 구현 방법
- 크루 이름 목록 List<String>
- 크루 이름 shuffle
  - List<String> shuffledCrew = Randoms.shuffle(crewNames);
- 섞고 앞에서부터 순서대로 2(3)명씩
- 동일 레벨에서 만난 적 있으면 다시 shuffle
- 3회 시도까지만 가능 -> 실패하면 에러 메시지 출력 -> 기능 선택으로 회귀 🚨
  - [Error]: 매칭할 수 없습니다.

### 페어 재매칭 시도(매칭 결과 있을 경우)
- 안내 문구 출력
- 네: 재매칭
- 아니오: 과정, 레벨, 미션 다시 선택


### 페어 조회
- 과정, 레벨, 미션 선택 후 해당 미션의 페어 정보 출력
- 매칭 이력 없을 시
  - [ERROR] 매칭 이력이 없습니다.


### 전체 기능 작동 흐름
1. 기능 선택
   1) 페어 매칭
      - 과정, 레벨, 미션 출력
      - 매칭하고자 하는 정보 입력
      - 매칭 시작
      - 매칭 결과 출력
   2) 페어 조회
      - 과정, 레벨, 미션 출력
      - 조회하고자 하는 정보 입력
      - 페어 결과 출력
   3) 페어 초기화
      - 저장되어있는 페어링 결과 초기화
   4) 종료
      - 프로그램 종료
2. 종료를 선택하지 않으면 무조건 '기능 선택' 반복


### 필수 구현 기능
- 페어 매칭 시 이미 매칭 정보가 있을 경우
  - 재매칭 or Not 입력
    - 재매칭 선택 시: 재매칭해서 저장
    - Not 선택 시: 매칭하고자 하는 정보 다시 입력
- 사용자가 잘못된 입력값 넣을 시 그 부분부터 다시 입력

### 구현할 모델
- 1) 과정 enum: 백엔드, 프론트엔드
- 2) 레벨 enum: 1~5
- 3) 미션 enum: 레벨 + 각 레벨에 따른 미션
- 4) 대답 enum: 네, 아니오
- 5) 과정, 레벨, 미션 class 🚨
  - 과정, 레벨, 미션
- 6) 매칭된 페어 리스트
  - List<String>: ["승관", "원우"], ["정한", "호시"], ["민규", "승철", "지수"]
- 7) 매칭된 페어 전체 정보 class 🚨
  - 5번 + 페어 리스트: List<(6)>

### 구현할 dto
- 매칭된 페어 dto
  - 페어 리스트 List<List<String>>

### 구현할 레포지토리
- 매칭된 페어 전체 정보 레포지토리