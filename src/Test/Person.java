package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new Person("A", 1));
		al.add(new Person("b", 2));
		al.add(new Person("c", 3));
		al.add(new Person("d", 4));
		Iterator<Person> it = al.iterator();
		// 迭代器
		while(it.hasNext()) {
			Person p=it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
		
		//普通for循环
		for (int i = 0; i < al.size(); i++) {
			Person p = it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
		// 增强for循环
		for (Person p : al) 
			System.out.println(p.getName() + " " + p.getAge());
	}

}
