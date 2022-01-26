package shape_factory_method;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory ShapeFactory = new ShapeFactory();

		Shape a1 = ShapeFactory.getShape("circle");
		a1.draw();

		Shape a2 = ShapeFactory.getShape("square");
		a2.draw();

	}

}
