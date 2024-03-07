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
   
    @Override
    public void setName(String name) {
	this.name=name;
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public int getAge() {
	return age;
    }

}
