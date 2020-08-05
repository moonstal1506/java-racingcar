# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## step3 요구사항 정리
* 주어진 횟수만큼 반복 -> RacingGame 에서 횟수 관리. Cars 관리. 게임 진행.
* N대의 자동차 생성 -> 1급컬렉션 Cars 에서 관리.
* 0-3 이면 정지. 4-9 면 전진
    * Car 객체에 값 전달하면 판단해서 position 결정
    
* 결과는 한번에 출력 -> Results 객체에 각 횟수별로 저장.
    * Result 객체는 1회에 대한 결과를 저장.  position 순차 저장.
    * ResultView에서 Results 객체 순차 출력
    * 반복적으로 출력하려면 UI 클래스에 의존하게 됨.