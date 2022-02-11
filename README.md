# java-racingcar

자동차 경주 미션 저장소

## 문자열 덧셈 계산기
### 기능구현 목록
- [ ] 구분자는 문자열을 기준으로 가지며 입력된 모든 숫자를 더해야 한다.
    - [x] 빈 문자열 또는 null 값을 입력할 경우 0을 반환한다.
    - [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
    - [ ] 기본 구분자 문자열은 ',', ':' 이다.
    - [ ] 커스텀 구분자 문자열은 '//'와 '\n' 사이에 위치하는 문자열로 사용한다.
    - [ ] 커스텀 구분자 문자열은 피연산자를 입력 할 수 없다.

- [ ] 사용자가 잘못된 값을 입력할 경우 예외를 throw한다.
    - [ ] 숫자 이외의 값 또는 음수를 전달일 경우 예외를 throw한다.
    - [ ] 빈값이나 공백을 입력할 경우도 예외를 throw한다.
    - [ ] 예외발생 시 `RuntimeException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 프로그램을 종료한다.

## 자동차 경주
### 🚀 기능 요구사항
초간단 자동차 경주 _게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, “[ERROR]“로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- 아래의 프로그래밍 실행 결과 예시와 동일하게 입력과 출력이 이루어져야 한다.

### 기능 구현 목록
- [ ] 사용자가 잘못된 값을 입력 처리 하기
    - [ ] `IllegalArgumentException`를 발생
    - [ ] 에러 발생시점부터 입력 다시 받기
    - [ ] “[ERROR]“로 시작하는 에러 메시지를 출력
- [x] 각 자동차들의 이름을 입력 받는다.
    - [X] 자동차들의 이름 입력은 ',' 으로 각 자동차를 구분한다.
    - [X] 각 자동차의 이름 길이는 1 ~ 5 사이의 길이로 구성되어야 한다.
    - [x] 자동차의 입력은 빈 입력을 허용하지 않는다.
    - [x] 자동차명의 이름 입력에 ',' 의 단독 입력은 허용하지 않는다.
- [x] 자동차 경주 게임의 시도할 횟수(라운드)를 입력 받는다.
    - [X] 시도할 횟수는 숫자 형태로만 입력을 허용한다.
    - [X] 숫자는 1 이상의 숫자를 허용한다.
    - [X] 빈칸 입력을 허용하지 않는다.
- [x] 레이싱 게임을 플레이한다.
    - [X] 자동차 전진을 위해서 숫자 값을 통해 전진을 수행한다.
      - [X] 값은 랜덤한 값으로 생성하며 0 ~ 9 사이의 값으로 생성 할 수 있다.
      - [X] 값이 4이상인 경우만 자동차가 전진할 수 있다.
      - [x] 각 자동차는 모두 다른 랜덤 값을 가진다.
    - [x] 한번의 라운드가 끝나면 카운트를 감소한다.
- [x] 매 경주당 결과 출력하는 기능
    - [x] 각 자동차별 결과(자동차 이름과 전진 거리)를 반환해주는 기능
    - [x] 경주당 결과를 출력하는 기능.
- [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지 알려주는 기능
    - [x] 가장 많은 전진을 한 자동차를 구하는 기능
    - [ ] 우승자가 여러 명일 경우 쉼표(,)를 이용하여_ 구분하여 문자열 반환 기능

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
