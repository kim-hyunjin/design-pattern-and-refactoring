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
  
## 데코레이터 패턴(decorator pattern)
- 객체에 추가적인 요건을 동적으로 첨가한다. 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공한다.
- 데코레이터의 수퍼클래스는 자신이 장식하고 있는 객체의 수퍼클래스와 같습니다.
- 한 객체를 여러 개의 데코레이터로 감쌀 수 있습니다.
- 데코레이터는 자신이 감싸고 있는 객체와 같은 수퍼클래스를 가지고 있기 때문에 원래 객체(싸여져 있는 객체)가
들어갈 자리에 데코레이터 객체를 집어넣어도 상관 없습니다.
- **데코레이터는 자신이 장식하고 있는 객체에 어떤 행동을 위임하는 것 외에 원하는 추가적인 작업을 수행할 수 없습니다.
- 객체는 언제든지 감쌀 수 있기 때문에 실행중에 필요한 데코레이터를 마음대로 적용할 수 있습니다.

# 디자인 원칙
## OCP(Open-Closed Principle)
- 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.