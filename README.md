# Studying Design Patterns with [Head First Design Patterns]

## 스트래티지 패턴(strategy pattern)
- 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
- 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
- ex) com.exam.simuduck.model.Duck은 자신의 행동알고리즘을 교환해서 사용할 수 있도록
  알고리즘군인 behavior 인터페이스를 사용한다.(composition)