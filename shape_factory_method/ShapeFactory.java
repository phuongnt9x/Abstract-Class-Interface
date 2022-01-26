package shape_factory_method;

public class ShapeFactory {
	public Shape getShape(String type) {
        if ("rectangle".equals(type)) {
            return new Rectangle();
        }else if("square".equals(type)) {
            return new Square();
        }else {
        	return new Circle();
        }
    }

}
