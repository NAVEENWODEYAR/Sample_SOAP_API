/**
 * 
 */
package com.people;

/**
 * @author Naveen K Wodeyar
 *
 */
public class PeopleImpl implements People {
    private String name=null;
    private int age=0;
   
    public void setName(String name) {
	this.name=name;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

}
