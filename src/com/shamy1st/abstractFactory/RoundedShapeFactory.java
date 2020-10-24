package com.shamy1st.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new RoundedCircle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        return null;
    }
}