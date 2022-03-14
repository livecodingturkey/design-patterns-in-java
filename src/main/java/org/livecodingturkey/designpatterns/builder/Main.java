/*
 * The builder pattern, as the name implies, is an alternative way to construct complex objects. 
 * This pattern should be used when we want to build different immutable objects using the same object 
 * building process.
 * 
 */

package org.livecodingturkey.designpatterns.builder;


class Dog
{
	//All final attributes
	private final String name; // required
	private final int age; // optional
	private final String breed; // optional

	private Dog(DogBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.breed = builder.breed;
	}

	//All getter, and NO setter to proved immutability
	public String getFirstName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}

	@Override
	public String toString() {
		return "User: "+this.name+", "+this.age+", "+this.breed;
	}

	public static class DogBuilder
	{
		private final String name;
		private int age;
		private String breed;

		public DogBuilder(String firstName) {
			this.name = firstName;
		}
		public DogBuilder age(int age) {
			this.age = age;
			return this;
		}
		public DogBuilder breed(String breed) {
			this.breed = breed;
			return this;
		}

		//Return the finally constructed User object
		public Dog build() {
			Dog dog =  new Dog(this);
			validateUserObject(dog);
			return dog;
		}
		private void validateUserObject(Dog dog) {
			//Do some basic validations to check
			//if user object does not break any assumption of system
		}
	}

}

public class Main{
	public static void main(String[] args) 
	{
		Dog dog1 = new Dog.DogBuilder("Cookie")
		.age(5)
		.breed("Golden Retriver")
		.build();

		System.out.println(dog1);

		Dog dog2 = new Dog.DogBuilder("Brownie")
		//No age
		.breed("Akita")
		.build();

		System.out.println(dog2);

		Dog dog3 = new Dog.DogBuilder("Buffy")
		//No age
		//No breed
		.build();

		System.out.println(dog3);
	}
}


