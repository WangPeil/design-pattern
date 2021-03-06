### 组合模式
链接：https://baijiahao.baidu.com/s?id=1639579541093787227&wfr=spider&for=pc
      https://www.jianshu.com/p/c7f19e5310f9
组合模式是树形结构表示部分-整体的层次结构，使用一致的方法操作单个对象和组合对象
根节点和树枝节点本质是同一种数据类型，可以作为容器使用；而叶子节点与树枝节点在语义上不属于同一类型，但是在组合模式中，会把树枝节点和也直接点认为是同一种数据结构(用同一接口定义),让他具有一致性。这样，在组合模式中，整个树形结构的对象都是同一类型，带来的好处是客户无需辨别树枝节点还是叶子节点，而是直接进行操作，带来极大的便利。
组合模式核心：借助同一接口，使叶子节点和树枝节点的操作具有一致性。

优点：
组合模式屏蔽了对象系统的层次差异性，将客户端代码与复杂的容器对象解耦，使得客户端可以忽略层次间的差异，使用一致的行为控制不同层次
在组合模式可以很方便地增加树枝节点和叶子节点对象，并对现有类库无侵入，符合开闭原则；

缺点：
如果系统过于庞大，虽然对不同层次都提供一致性操作，但客户端仍需要花费时间理清类之间的层次关系
组合模式在具体实现上违背了设计模式接口隔离原则或依赖倒置原则