# Studying Design Patterns with [Head First Design Patterns]

## 객체지향 원칙
- 바뀌는 부분은 캡슐화한다.
- 상속보다는 구성을 활용한다.
- 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
- 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.

## 스트래티지 패턴(strategy pattern)
- 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
- 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
- ex) com.exam.strategy.simuduck.model.Duck은 자신의 행동알고리즘을 교환해서 사용할 수 있도록
  알고리즘군인 behavior 인터페이스를 사용한다.(composition)

## 옵저버 패턴(observer pattern)
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로
일대다(one-to-many) 의존성을 정의합니다.
  
## 데코레이터 패턴(decorator pattern)
- 객체에 추가 요소를 동적으로 더할 수 있다. 데코레이터를 사용하면 서브클래스를 만드는 경우에 비해 훨씬 유연하게 기능을 확장할 수 있다.

#### 핵심정리
- 상속을 통해 확장을 할 수도 있지만, 디자인의 유연성 면에서 별로 좋지 않습니다.
- 기존 코드를 수정하지 않고도 행동을 확장하는 방법이 필요합니다.
- 구성과 위임을 통해서 실행중에 새로운 행동을 추가할 수 있습니다.
- 상속 대신 데코레이터 패턴을 통해서 행동을 확장할 수 있습니다.
- 데코레이터 패턴에서는 구상 구성요소를 감싸주는 데코레이터들을 사용합니다.
- 데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영합니다.(상속 또는 인터페이스 구현을 통해서 자신이 감쌀 클래스와 같은 형식을 가지게 됩니다)
- 데코레이터에서는 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장합니다.
- 구성요소를 감싸는 데코레이터의 개수에는 제한이 없습니다.
- 구성요소의 클라이언트 입장에서는 데코레이터의 존재를 알 수 없습니다.
  - 클라이언트에서 구성요소의 구체적인 형식에 의존하게 되는 경우에는 적합하지 않습니다.  
- 데코레이터 패턴을 사용하면 자잘한 객체들이 매우 많이 추가될 수 있고, 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해질 수도 있습니다.

## 팩토리 패턴(Factory Pattern)
- 모든 팩토리 패턴에서는 객체 생성을 캡슐화합니다.
- 팩토리 메소드 패턴에서는 서브클래스에서 어떤 클래스를 만들지를 결정하게 함으로써 객체 생성을 캡슐화합니다.
- 추상 팩토리 패턴에서는 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있습니다. 클라이언트에서
추상 인터페이스를 통해서 일련의 제품들을 공급받을 수 있습니다.
```
팩토리 메소드 vs 추상 팩토리
1 . 팩토리 메소드
  - 서브 클래스를 통해서 객체생성.
  - 클라이언트 코드와 인스턴스를 만들어야 할 구상 클래스를 분리시켜야 할 때 사용.
  - 어떤 구상 클래스를 필요로 하게 될지 미리 알 수 없는 경우에도 매우 유용. 

2. 추상 팩토리
  - 객체 구성(composition)을 사용. '제품군'을 만들기 위한 추상 형식을 제공. 제품 생산 방법은 서브 클래스에서 정의.
    객체 생성이 팩토리 인터페이스에서 선언한 메소드들에서 구현됨.
  - 클라이언트에서 서로 연관된 일련의 제품들을 만들어야 할 때, 즉 제품군을 만들어야 할 때 활용.

공통점 
- 클라이언트와 클라이언트에서 사용하는 실제 구상 제품을 분리시켜 줌. => 객체 생성을 캡슐화해서 애플리케이션의 결합을 느슨하게 만들고,
  특정 구현에 덜 의존하도록 만듦.
``` 

## 싱클턴 패턴(Singleton Pattern)
- 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴이다.
- 객체 중에는 사실 하나만 있으면 되는 것들이 많다. ex) 스레드 풀, 캐시, 레지스트리 설정, 로그, 프린터 등의 디바이스를 위한 드라이버...
- 전역변수와 다른점?
  - 전역 변수에 객체를 대입하면 애플리케이션이 시작될 때 객체가 생성될 것이다.(*플랫폼에 따라 다를 수 있음) 하지만 애플리케이션이 끝날 때까지 그 객체를 한 번도 쓰지 않는다면?
  - 싱글턴 패턴을 쓰면 필요할 때만 객체를 만들 수 있다.
  - 전역 변수를 사용하다 보면 간단한 객체에 대한 전역 레퍼런스를 자꾸 만들게 되면서 네임스페이스가 지저분해지는 경향이 있다.
- 클래스 로더가 여러개인 경우 싱글턴의 인스턴스도 여러개 만들어지는 문제가 발생할 수 있다.

## 커맨드 패턴(Command Pattern)
- 커맨드 패턴을 이용하면 요구 사항을 객체로 캡슐화할 수 있으며, 매개변수를 써서 여러 가지 다른 요구 사항을 집어넣을 수도 있습니다.
- 또한 요청 내역을 큐에 저장하거나 로그로 기록할 수도 있으며, 작업 취소 기능도 지원 가능합니다.
- 프로그래밍을 하다 보면 요청 자체를 리시버한테 넘기지 않고 자기가 처리하는 "스마트" 커맨드 객체를 사용하는 경우도 종종 있습니다.
- 커맨드 패턴을 활용하여 로그 및 트랜잭션 시스템을 구현하는 것도 가능합니다.

## 어댑터 패턴(Adapter Pattern)
- 한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환합니다. 
  어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있습니다.
- 클라이언트에서 어댑터를 사용하는 방법
  1. 클라이언트에서 타겟 인터페이스를 사용하여 메소드를 호출함으로써 어댑터에 요청합니다.
  2. 어댑터(adapter)에서는 어댑티(adaptee) 인터페이스를 사용하여 그 요청을 어댑티(adaptee)에 대한 (하나 이상의) 메소드 호출로 변환합니다.
  3. 클라이언트에서는 호출 결과를 받긴 하지만 중간에 어댑터가 껴 있는지는 전혀 알지 못합니다.
  
```
Q: 어댑터에서 얼마나 적응을 시켜줘야 하나요? 대형 타겟 인터페이스를 구현해야 되는 경우에는 할 일이 정말 많아질 수 있을 것 같은데요?
A: 예, 그럴 수도 있습니다. 하지만 다른 대안이 있는지 한번 생각해보세요. 그냥 모든 변경 사항을 캡슐화시킨 클래스 한 개만 제공하는 방법이 베스트일지도?

Q: 한 어댑터에서 한 클래스만 감싸야 하나요?
A: 한 어댑터에서 타겟 인터페이스를 구현하기 위해 두 개 이상의 어댑티를 감싸야 하는 상황도 생길 수 있습니다. -> 사실 이런 내용은 퍼사드 패턴이라는 또 다른 패턴하고 연관되어 있습니다.
```
- 클래스 어댑터
  - 클래스 어탭터 패턴을 쓰려면 다중 상속이 필요합니다.
  - 어댑티를 적응시키는 데 있어서 구성을 사용하는 대신, 어댑터를 어댑티와 타겟 클래스 모두의 서브 클래스로 만듭니다.
  
## 퍼사드 패턴(Facade Pattern)
- 퍼사드는 인터페이스를 단순화시킬 뿐 아니라 클라이언트와 구성요소들로 이루어진 서브시스템을 분리시키는 역할도 합니다.
- 어떤 서브시스템에 대한 간단한 인터페이스를 제공하기 위한 용도로 쓰입니다.
- 퍼사드 패턴을 사용하려면 어떤 서브시스템에 속한 일련의 복잡한 클래스들을 단순화하고 통합한 클래스를 만들어야 합니다.
- 다른 패턴과 달리 상당히 단순한 편입니다.(복잡한 추상화 같은 게 필요 없죠.)
- 퍼사드 패턴을 이용하면 클라이언트와 서브시스템이 서로 긴밀하게 연결되지 않아도 됩니다.

### 데코레이션 vs 어댑터 vs 퍼사드
- 데코레이터는 객체를 감싸서 새로운 행동을 추가하기 위한 용도
- 어댑터는 객체를 감싸서 인터페이스를 바꾸기 위한 용도
- 퍼사드는 일련의 객체들을 감싸서 단순화시키기 위한 용도

## 템플릿 메소드 패턴(Template Method Pattern)
- 메소드에서 알고리즘의 골격을 정의합니다.
- 알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있습니다.
- 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있습니다.

### 템플렛 메소드와 후크
- 후크(hook)는 추상 클래스에서 선언되는 메소드긴 하지만 기본적인 내용만 구현되어 있거나 아무 코드도 들어있지 않은 메소드입니다.
- 후크를 오버라이드 해도 되고 그냥 넘어가도 됩니다. 후크를 재정의해 알고리즘을 선택적으로 제공할 수 있습니다.
- 템플릿 메소드에서 앞으로 일어날 일 또는 막 일어난 일에 대해 서브클래스에서 반응할 기회를 제공하기 위한 용도로도 쓰일 수 있습니다.
```
Q: 템플릿을 만들 때 언제 추상 메소드를 쓰고 언제 후크를 써야 하는지 어떻게 알 수 있나요?
A: 서브클래스에서 알고리즘의 특정 단계를 제공해야만 하는 경우에는 추상메소드를 써야합니다.
   알고리즘의 특정 부분이 선택적으로 적용되는 경우에는 후크를 쓰면 됩니다.
```

### 템플릿 메소드, 스트래티지 메소드, 팩토리 메소드
```
템플릿 메소드 - 알고리즘의 일부 단계를 구현하는 것을 서브클래스에서 처리합니다.
스트래티지 메소드 - 바꿔쓸 수 있는 행동을 캡슐화하고, 어떤 행동을 사용할지는 서브클래스에 맡깁니다.
팩토리 메소드 - 어떤 구상 클래스를 생성할지를 서브클래스에서 결정합니다.
```

## 이터레이터 패턴
- 컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는 모든 항목에 접근할 수 있게 해주는 방법을 제공합니다.
- 이렇게하면 집찹체의 인터페이스 구현이 간단해질 뿐 아니라, 집합체에서는 반복작업에서 손을 떼고 객체 관리에만 전념할 수 있게 됩니다.

## 컴포지트 패턴
- 부분-전체 관계를 가진 객체 컬렉션이 있을 때, 그 객체들을 모두 똑같은 방식으로 다루고 싶을 때 쓰이는 패턴.
- 컴포지트 패턴을 이용하면 객체들을 트리 구조로 구성하여 부분과 전체를 나타내는 계층구조로 만들 수 있습니다.
- 클라이언트에서 개별 객체와 다른 객체들로 구성된 복합 객체(composite)를 똑같은 방법으로 다룰 수 있습니다.
```
Q: Components, Composite, 트리, 뭐가 이렇게 복잡한 거죠?
A: 복합 객체(composite)에는 구성요소(component)가 들어있습니다. 구성요소는 두 종류로 나눌 수 있습니다.
하나는 복합 객체이고 다른 하나는 잎입니다. 재귀적인 구조입니다. 복합객체에는 일련의 자식들이 들어있으며, 그 자식들은 복합객체일 수도, 잎일 수도 있습니다.
데이터를 이런 식으로 조직화하다 보면 뿌리는 복합 객체에서 시작해 복합 객체를 따라 가지가 연결되다가 마지막에는 잎으로 끝나는 트리구조가 됩니다.
```
- 컴포지트 패턴에서는 단일 역할 원칙을 깨면서 대신에 투명성을 확보하기 위한 패턴이라고 할 수 있습니다.
- 덕분에 클라이언트를 단순화시킬 수 있습니다.
  - 클라이언트들은 복합 객체를 사용하고 있는지 잎 객체를 사용하고 있는지 신경쓰지 않아도 됩니다.
  - 올바른 객체에 대해서 올바른 메소드를 호출하고 있는지 확인하기 위해 지저분하게 여기저기에 if문을 쓰지 않아도 됩니다.
  - 메소드 하나만 호출하면 전체 구조에 대해서 반복해서 작업을 처리할 수도 있습니다.
### 투명성?
- Component 인터페이스에 자식들을 관리하기 위한 기능과 잎으로써의 기능을 전부 집어넣음으로써 클라이언트에서 복합 객체와 잎 노드를 똑같은 방식으로 처리할 수 있도록 할 수 있습니다.
- 어떤 원소가 복합 객체인지 잎 노드인지가 클라이언트 입장에서는 '투명'하게 느껴지는 거죠.
- Component 클래스에는 두 종류의 기능이 모두 들어 있어 안전성은 약간 떨어지지만 코드에서 조건문이라든가 instanceof 연산자 같은 걸 쓰지 않아도 되었습니다.

## 스테이트 패턴
- 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있습니다.
- 상태를 별도의 클래스로 캡슐화한 다음 현재 상태를 나타내는 객체에게 행동을 위임합니다.

#### 스테이트 패턴 vs 스트래티지 패턴
```
- 두 패턴은 용도에 있어서 차이가 있습니다.

스테이트 패턴
- 상태 객체에 일련의 행동이 캡슐화됩니다. 상황에 따라 Context객체에서 여러 상태 객체 중 한 객체에게
모든 행동을 맡기게 되죠. 그 객체의 내부 상태에 따라 현재 상태를 나타내는 객체가 바뀌게 되고, 그 결과로
컨텍스트 객체의 행동도 자연스럽게 바뀌게 됩니다. 클라이언트는 상태 객체에 대해서 거의 아무것도 몰라도 됩니다.
스테이트 패턴은 컨텍스트 객체에 수많은 조건문을 집어넣는 대신에 사용할 수 있는 패턴이라고 생각하면 됩니다.

스트래티지 패턴
- 스트래티지 패턴을 사용할 때는 일반적으로 클라이언트에서 Context객체한테 어떤 전략 객체를 사용할지 지정해 줍니다.
주로 실행시에 전략 객체를 변경할 수 있는 유연성을 제공하기 위한 용도로 쓰이죠.
일반적으로 스트래티지 패턴은 서브클래스를 만드는 방법을 대신하여 유연성을 극대화하기 위한 용도로 쓰입니다.
```
```
Q: 반드시 구상 상태 클래스에서 다음 상태를 결정해야 하는 건가요?
A: 항상 그런 건 아닙니다. Context에서 상태 전환의 흐름을 결정하도록 할 수도 있습니다.
상태 전환이 고정되어 있으면 상태 전환 흐름을 결정하는 코드를 Context에 집어넣어도 됩니다.
하지만 상태 전환이 동적으로 결정되는 경우에는 상태 클래스 내에서 처리하는 것이 좋습니다.

Q: 클라이언트에서 상태 객체하고 직접 연락을 하는 경우도 있나요?
A: 그런 일은 없습니다. 상태는 Context 쪽에서 내부 상태 및 행동을 표현하기 위한 용도로 사용하는 것이므로
상태에 대한 요청은 전부 Context로부터 오게 됩니다. 상태들을 관리하는 일은 전적으로 Context에서 책임져야 하며,
Context 몰래 클라이언트가 직접 Context의 상태를 변경할 일은 없습니다.

Q: 스테이트 패턴을 사용하면 디자인에 필요한 클래스의 개수가 늘어나나요?
A: 예. 맞습니다. 유연성을 향상시키기 위한 지불 비용이라고 생각하면됩니다.
상태 클래스를 만들기 귀찮아서 스테이트 패턴을 쓰지 않는다면, 정말 복잡한 조건문을 사용해야 합니다.
그러면 코드를 관리하기도 힘들고, 이해하기도 힘들어지죠.
```

## 프록시 패턴
- 어떤 객체에 대한 접근을 제어하기 위한 용도로 대리인이나 대변인에 해당하는 객체를 제공하는 패턴
- 프록시 패턴을 이용하면 원격 객체라든가 생성하기 힘든 객체, 보안이 중요한 객체와 같은 다른 객체에 대한 접근을 제어하는
대변자 객체를 만들 수 있습니다.
- 자바에 내장된 프록시 지원 기능을 이용하면 동적 프록시 클래스를 즉석에서 만들어서 원하는 핸들러에서 호출을 처리하도록 할 수 있습니다.
- 다른 래퍼를 쓸 때와 마찬가지로 프록시를 쓰면 디자인에 포함되는 클래스와 객체의 수가 늘어납니다.
```
원격 프록시
- 원격 프록시는 다른 JVM에 들어있는 객체의 대변인에 해당하는 로컬 객체입니다.
프록시의 메소드를 호출하면 그 호출이 네트워크를 통해서 전달되어 결국 원격 객체의 메소드가 호출됩니다.
그리고 그 결과는 다시 프록시를 거쳐 클라이언트한테 전달됩니다.

가상 프록시
- 가상프록시는 생성하는 데 많은 비용이 드는 객체를 대신하는 역할을 맡습니다.
실제로 진짜 객체가 필요하게 되기 전까지 객체의 생성을 미루게 해주는 기능을 제공하기도 합니다.

보호 프록시
- 보호 프록시는 호출하는 쪽의 권한에 따라서 객체에 있는 메소드에 대한 접근을 제어합니다.
```
```
데코레이터 패턴 vs 프록시 패턴
- 데코레이터 패턴에서는 객체에 행동을 추가하지만 프록시 패턴에서는 접근을 제어합니다.
```

## 컴파운드 패턴
- 패턴으로 이루어진 패턴
- MVC(모델-뷰-컨트롤러)
#### 모델
```
모델에는 모든 데이터, 상태 및 애플리케이션 로직이 들어있습니다. 
뷰와 컨트롤러에서 모델의 상태를 조작하거나 가져오기 위한 인터페이스를 제공하고,
모델에서 자신의 상태 변화에 대해서 옵저버들한테 연락을 해주긴 하지만, 기본적으로 모델은 뷰 및 컨트롤러에는 별 관심이 없습니다.
```
#### 뷰
```
모델을 표현하는 방법을 제공합니다. 일반적으로 화면에 표시하기 위해 필요한 상태 및 데이터는 모델에서 직접 가져옵니다.
```
#### 컨트롤러
```
사용자로부터 입력을 받아서 그것이 모델에게 어떤 의미가 있는지 파악합니다.
```
1. 사용자는 뷰하고만 접촉할 수 있습니다.
2. 컨트롤러에서 모델한테 상태를 변경하라는 요청을 합니다.
3. 컨트롤러에서 뷰를 변경해달라고 요청할 수 있습니다.
4. 상태가 변경되면 모델에서 뷰한테 그 사실을 알립니다.
5. 뷰에서 모델한테 상태를 요청합니다.
```
Q: 컨트롤러가 모델의 옵저버가 되는 경우는 없나요?
A: 물론 그런 경우도 있습니다. 디자인에 따라 컨트롤러도 모델에 옵저버로 등록을 하고, 상태가 변경될 때 모델로부터 연락을 받을 수 있습니다.
그리고 컨트롤러에서 뷰한테 상황에 맞게 화면을 갱신해 달라고 요청을 하게 될 것입니다.
Q: 컨트롤러에서 하는 일이 모델에 있는 메소드를 호출하는 것 뿐이라면 왜 컨트롤러를 쓰는거죠? 뷰에 그 코드를 집어넣어도 되잖아요.
A: 컨트롤러는 그냥 '모델한테 전달하는' 일만 하는 것은 아닙니다. 사용자가 입력한 것을 해석해서, 그것을 바탕으로 모델을 조작하는 임무를 맡고 있습니다.
또한, 뷰에 그런 기능을 직접 넣어 뷰가 두가지 역할을 하게 되면 코드가 복잡해진다는 문제가 있죠. 끝으로, 뷰를 모델에 너무 밀접하게 연관시켜야 한다는 문제가 있습니다.
뷰를 다른 모델하고 연결해서 재사용하기가 아주 힘들어집니다.
컨트롤러는 제어 로직을 뷰로부터 분리해내서 뷰와 모델의 결합을 끊어주는 역할을 합니다. 뷰와 컨트롤러를 느슨하게 결합시켜 놓으면 더 유연하고 확장하기 좋은
디자인을 만들 수 있죠.
```

# 디자인 원칙
## 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
- 바뀌는 부분을 따로 캡슐화시키면 나중에 바뀌지 않는 부분에는 영향을 주지 않은 채로 그 부분만 고치거나 확장할 수 있다.
- 즉, 코드를 변경하는 과정에서 의도하지 않은 일이 일어나는 것을 줄이면서 시스템의 유연성을 향상시킬 수 있습니다.
- 관련 디자인 패턴 : 스트래티지 패턴
## 구현이 아닌 인터페이스 맞춰서 프로그래밍 한다.
- 실행시에 쓰이는 객체가 코드에 의해서 고정되지 않도록, 어떤 상위 형식에 맞춰서 프로그래밍함으로써 다형성을 활용해야 합니다.
- 관련 디자인 패턴 : 스트래티지 패턴
## 상속보다는 구성을 활용한다.
- 구성(composition)을 이용하여 시스템을 만들면 유연성을 크게 향상시킬 수 있습니다.
- 관련 디자인 패턴 : 스트래티지 패턴
## 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
- 느슨하게 결합하는 디자인을 사용하면 변경 사항이 생겨도 무난히 처리할 수 있는 유연한 객체지향 시스템을 구축할 수 있습니다.
객체 사이의 상호의존성을 최소화시킬 수 있기 때문이죠.
- 관련 디자인 패턴 : 옵저버 패턴  
## OCP(Open-Closed Principle)
- 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.
- 기존 코드는 건드리지 않은 채로 확장을 통해 새로운 행동을 간단히 추가할 수 있다면 매우 유연하고 튼튼한 디자인을 만들 수 있습니다.
- 관련 디자인 패턴 : 데코레이터 패턴
## 의존성 뒤집기 원칙(Dependency Inversion Principle)
- 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하지 않도록 한다.
- 가이드 라인
  - 어떤 변수에도 구상 클래스에 대한 레퍼런스를 저장하지 않는다.
  - 구상 클래스에서 유도된 클래스를 만들지 않는다.
  - 베이스 클래스에 이미 구현되어 있던 메소드를 오버라이드하지 않는다. => 이미 구현되어 있는 메소드를 오버라이드한다는 것은 애초부터 베이스 클래스가 제대로 추상화된 것이 아니었다고 볼 수 있습니다.
- 관련 디자인 패턴 : 팩토리 패턴
## 최소 지식 원칙(= 데메테르의 법칙(Law of Demeter))
- 객체 사이의 상호작용은 될 수 있으면 아주 가까운 "친구" 사이에서만 허용하는 것이 좋다.
  - 시스템을 디자인 할 때, 어떤 객체든 그 객체와 상호작용을 하는 클래스의 개수에 주의해야 한다.
  - 이 원칙을 잘 따르면 여러 클래스들이 복잡하게 얽혀서 시스템의 한 부분을 변경했을 때 다른 부분까지 줄줄이 고쳐야 되는 상황을 미리 방지할 수 있습니다.
- 가이드라인
  - 어떻게 하면 여러 객체하고 인연을 맺는 것을 피할 수 있을까요? 어떤 메소드에서든지 다음 네 종류의 객체의 메소드만을 호출하면 됩니다.
    - 객체 자체
    - 메소드에 매개변수로 전달된 객체
    - 그 메소드에서 생성하거나 인스턴스를 만든 객체
    - 그 객체에 속하는 구성요소(인스턴스 변수에 의해 참조되는 객체)
- 단점
  - 이 원칙을 잘 따르면 의존성을 줄일 수 있지만, 다른 구성요소에 대한 메소드 호출을 처리하기 위해 래퍼 클래스를 더 만들어야 할 수도 있습니다. ==> 복잡도, 개발시간 증가, 성능 저하
- 관련 디자인 패턴 : 퍼사드 패턴
```
Q: 어떤 메소드를 호출한 결과로 리턴받은 객체에 있는 메소드를 호출할 때는 어떤 단점이 있을까요?
A: 그렇게 하면 다른 객체의 일부분에 대해서 요청을 하게 되는 것이고, 그러다 보면 직접적으로 알고 지내는 객체의 개수가 늘어나게 됩니다.
   ==> 그런 경우에 최소 지식 원칙을 따르려면 그 객체 쪽에서 대신 요청을 하도록 만들어야 합니다. 그러면 그 객체의 한 구성요소를 알고 지낼 필요도 없어지죠.(친구 수를 줄이는 데도 도움이 되고요)
   
   // 원칙을 따르지 않은 경우
   // station으로부터 Thermometer라는 객체를 받은 다음, 그 객체의 getTemperature() 메소드를 직접 호출합니다.
   public float getTemp() {
     Thermometer thermometer = station.getThermometer();
     return thermometer.getTemperature();
   }
   
   // 원칙을 따르는 경우
   public float getTemp() {
     return station.getTemperature(); // 최소 지식 원칙을 적용하여 Station 클래스에 thermometer에 요청을 해주는 메소드를 추가했습니다. 이렇게 하면 의존해야 하는 클래스의 개수를 줄일 수 있죠.
   }
```
```
  public class Car {
    Engine engine;
    // ... 기타 인스턴스 변수
    
    public Car() {
      // 엔진 초기화 등 인스턴스 변수 초기화 처리
    }
    
    public void start(Key key) {
      Doors doors = new Doors();
      boolean authorized = key.turns(); // 매개변수로 전달된 객체의 메소드 호출 : OK
      
      if (authorized) {
        engine.start(); // 이 객체의 구성요소의 메소드 호출 : OK
        updateDashboardDisplay(); // 객체 내에 있는 메소드 호출 : OK
        doors.lock(); // 직접 생성하거나 인스턴스를 만든 객체의 메소드 : OK
      }
    }
    
    public void updateDashboardDisplay() {
      // 디스플레이 갱신
    }
  }

```
  
## 헐리우드 원칙
```
먼저 연락하지 마세요. 저희가 연락 드리겠습니다.
```

- 헐리우드 원칙을 활용하면 '의존성 부패(dependency rot)'를 방지할 수 있습니다.
- 저수준 구성요소에서 시스템에 접속을 할 수는 있지만, 언제 어떤 식으로 그 구성요소들을 사용할지는 고수준 구성요소에서 결정하게 됩니다.
- 따라서, 이 원칙은 저수준 구성요소들을 다양하게 사용할 수 있으면서도, 다른 클래스가 저수준 구성요소들에 너무 의존하지 않게 만들어주는 디자인을 구현하기 위한 기법을 제공합니다.
- 관련 디자인 패턴 : 템플릿 메소드 패턴
```
의존성 부패?
[고수준 구성요소]--의존--> [저수준 구성요소] --의존--> [고수준..] --의존--> [저수준..] 과 같이 의존성이 복잡하게 꼬여있는 것을
의존성 부패라고 부릅니다. 이렇게 의존성이 부패되면 시스템이 어떤 식으로 디자인된 것인지 거의 아무도 알아볼 수 없게 됩니다.
```

## 클래스를 바꾸는 이유는 한 가지 뿐이어야 한다.
- 어떤 클래스에서 맡고 있는 모든 역할들은 나중에 코드 변화를 불러올 수 있습니다.
역할이 두개 이상 있으면 바뀔 수 있는 부분이 두 가지 이상이 되는 것이죠.
### 응집도(cohesion)
- 응집도란 한 클래스 또는 모듈이 특정 목적, 역할을 얼마나 일관되게 지원하는지를 나타내는 척도라고 할 수 있습니다.

# 디자인 패턴의 정의
```
패턴이란 특정 컨텍스트 내에서 주어진 문제에 대한 해결책이다.
```
- 컨텍스트 : 패턴이 적용되는 상황. 반복적으로 일어날 수 있는 상황이어야 한다.
- 문제 : 그 컨텍스트 내에서 이루고자 하는 목적. 컨텍스트 내에서 생길 수 있는 제약조건도 포함된다.
- 해결책 : 누구든지 적용해서 일련의 제약조건 내에서 목적을 달성할 수 있는 일반적인 디자인.

## 패턴 분류하기
### 생성
- 객체 인스턴스 생성을 위한 패턴으로, 클라이언트와 그 클라이언트에서 생성해야 할 객체 인스턴스 사이의 연결을 끊어주는 패턴입니다.
```
추상팩토리, 팩토리 메소드, 싱글턴, 빌더, 프로토타입
```
### 행동
- 클래스와 객체들이 상호작용하는 방법 및 역할을 분담하는 방법과 관련된 패턴입니다.
```
옵저버, 데코레이터, 이터레이터, 스트래티지, 스테이트, 커맨드, 메멘토, 비지터, 메디에이터, 인터프리터, 역할 사슬
```
### 구조
- 클래스 및 객체들을 구성을 통해서 더 큰 구조로 만들 수 있게 해주는 것과 관련된 패턴입니다.
```
컴포지트, 퍼사드, 어댑터, 프록시, 데코레이터, 플라이웨이트, 브리지
```

# 마무리
- 디자인 패턴을 억지로 적용하지 마세요. 주어진 조건을 만족시키는 가장 간단한 해결책을 사용합시다. 디자인 패턴을 꼭 써야 하는 건 아닙니다.
- 꼭 필요하지 않음에도 불구하고 괜히 패턴을 추가하면 시스템만 복잡해지고, 전혀 쓸모가 없게 될 수도 있습니다.
- 패턴을 적용했는데 시스템이 점점 복잡해지면서 처음에 기대했던 유연성이 전혀 발휘되지 않는다면 패턴을 과감하게 제거해버리세요.   
- 디자인 패턴은 돌에 새겨진 글씨가 아닙니다. 필요에 따라 적당히 변형시켜서 사용합시다.
