package com.example.designpatterns.builder;

import org.apache.commons.lang3.SerializationUtils;

import com.example.designpatterns.builder.Cash.Factory;

import com.example.designpatterns.builder.Person.PersonFactory;
import com.example.designpatterns.builder.User.UserBuilder;

public class DesignMain {

	public static void main(String[] args) {

		System.out.println("---------------------builderpatern------------------------");

		// immutable classes willbe final ,vairables will be final,constructor will be
		// private
		// build will be the input .no setter methods for parentclass and builder class
		// submethods inside builderclass will return userbuilder object
		// finally build method is called to create a new parent object from builder
		User user = new UserBuilder("Praveen", "N").addAge(27).addAddress("Varapuzha").build();
		System.out.println(user.toString());
		System.out.println("-------------------------------------------------------------");
		System.out.println("-----------------------FactoyMethod----------------------");
		//constructor is private variables doesnot have getersetters object creation via factoryclass 
		Integer amount = 100;
		Cash dollar = Factory.ConvertFromDollar(amount);
		Cash euro = Factory.ConvertFromEuro(amount);
		System.out.println("DOLLAR" + dollar + "EURO" + euro);
		System.out.println("-----------------------FactoyMethod----------------------");
			
		Person.PersonFactory.createPerson("praveen");
		Person.PersonFactory.createPerson("kiran");
		Person.PersonFactory.createPerson("smitha");
		
		System.out.println("-----------------------FactoyMethod----------------------");
		//deep copy shallow copy 
		//copy by serializationutils.roundtrip apache implement serilization common lang3
		Address address = new Address("muttinakam","kappela");
		ClonePerson praveen=new ClonePerson("Praveen", "27",address );
		ClonePerson smitha = SerializationUtils.roundtrip(praveen);
		
		smitha.setName("smitha");
		System.out.println(praveen.toString());
		System.out.println(smitha.toString());
		
		//Singleton nookaa todo
		System.out.println("-----------------------Strucutral----------------------");
		System.out.println("----- Adaptor--------------------------------");
		//when reusing extrenal codes when legacy codes
		Imoveable bugati=new Bugativeyron();
		System.out.println("USA "+bugati.toString());
		ImoveAdaptor adaptorbugati=new SpeedService(bugati);
		System.out.println("UK "+adaptorbugati.toString());
		System.out.println("----- Adaptor--------------------------------");
		System.out.println("----- Proxy pattern--------------------------------");
		//JDBC connection or a SessionFactory)
		//Protection proxy extends configured class and adds conditions as protectionlayer
		
		
		
		
		
	}

}
