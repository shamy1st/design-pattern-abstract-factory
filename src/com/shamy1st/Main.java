package com.shamy1st;

import com.shamy1st.abstractFactory.AbstractFactory;
import com.shamy1st.abstractFactory.FactoryProducer;
import com.shamy1st.abstractFactory.Shape;

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
