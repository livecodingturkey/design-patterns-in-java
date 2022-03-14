package org.livecodingturkey.designpatterns.abstractfactory;


	// This is our super class. Notice it is defined as interface. It could be normal class or abstract.
	interface Shape {
		public double getArea();
		public double getSize();
	}

	//Circle Class
	 class Circle implements Shape {
		private double radius;
		 
		@Override
		public double getArea() {
		    return Math.PI*radius*radius;
		}
		 
		@Override
		public double getSize() {
		    return 2*Math.PI*radius;
		}
		 
		public void setRadius(double radius) {
		    this.radius = radius;
		}
	}

	//Rectangle Class
	 class Rectangle implements Shape {
		private double width;
		private double height;
		 
		@Override
		public double getArea() {
		    return width*height;
		}
		 
		@Override
		public double getSize() {
		    return 2*(width+height);
		}
		 
		public void setWidth(double width) {
		    this.width = width;
		}
		 
		public void setHeight(double height) {
		    this.height = height;
		}
	    }

	//Abstract factory class. This class is super factory class
	 interface ShapeAbstractFactory {
		public Shape createShape();
	}

	//Factory class for circle class
	 class CircleFactory implements ShapeAbstractFactory {
		@Override
		public Shape createShape() {
		    return new Circle();
		}
	}

	//Factory class for rectangle class
	 class RectangleFactory implements ShapeAbstractFactory {
		@Override
		public Shape createShape() {
		    return new Rectangle();
		}
	}

	//
	 class ShapeFactory {
		public static Shape getShape(ShapeAbstractFactory factory){
		    return factory.createShape();
		}
	    }
	
	//Client class - Tests
	 class TestFactory {
		public static void main(String[] args) {
		    Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
		    ((Rectangle) rectangle).setWidth(13);
		    ((Rectangle) rectangle).setHeight(5);
		 
		    Shape circle = ShapeFactory.getShape(new CircleFactory());
		    ((Circle) circle).setRadius(4);
		 
		    System.out.println("Rectangle area: "+rectangle.getArea()+" and size: "+rectangle.getSize());
		    System.out.println("Circle area: "+circle.getArea()+" and size: "+circle.getSize());
		}
	    }

	


