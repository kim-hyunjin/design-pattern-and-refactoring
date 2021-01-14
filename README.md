# Studying Design Patterns with [Head First Design Patterns]

## 객체지향 원칙
- 바뀌는 부분은 캡슐화한다.
- 상속보다는 구성을 활용한다.
- 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
- 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.


## 스트래티지 패턴(strategy pattern)
- 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
- 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
- ex) com.exam.simuduck.model.Duck은 자신의 행동알고리즘을 교환해서 사용할 수 있도록
  알고리즘군인 behavior 인터페이스를 사용한다.(composition)

## 옵저버 패턴(observer pattern)
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로
일대다(one-to-many) 의존성을 정의합니다.