# Abstract Factory Design Pattern (Java)
**Abstract Factory** a super-factory which creates other factories.
![](https://github.com/shamy1st/design-pattern-abstract-factory/blob/main/uml.png)

### Problem:
You want to create an **AbstractFactory** parent to two factories **ShapeFactory**, **RoundedShapeFactory** and contruct it with boolean parameter **true** for **rounded** shapes.

    public class Main {
        public static void main(String[] args) {
            AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
            Shape shape1 = shapeFactory.getShape("RECTANGLE");
            
            AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
            Shape shape2 = roundedShapeFactory.getShape("RECTANGLE");

            shape1.draw();  //Rectangle
            shape2.draw();  //Rounded Rectangle
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-abstract-factory/blob/main/uml-solution.png)
