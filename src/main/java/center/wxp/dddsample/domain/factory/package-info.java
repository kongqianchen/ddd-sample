/**
 * 在大型系统中，实体和聚合通常是很复杂的，这就导致了很难去通过构造器来创建对象。
 * 工厂就决解了这个问题，它把创建对象的细节封装起来，巧妙的实现了依赖反转。
 * 当然对聚合也适用（当建立了聚合根时，其他对象可以自动创建）。
 * 工厂最早被大家熟知可能还是在设计模式中，的确，在这里提到的工厂也是这个概念。
 *
 * 但是不要盲目的去应用工厂，以下场景不需要工厂：
 * a)构造器很简单
 * b)构造对象时不依赖于其他对象的创建
 * c)用策略模式就可以解决
 */
package center.wxp.dddsample.domain.factory;