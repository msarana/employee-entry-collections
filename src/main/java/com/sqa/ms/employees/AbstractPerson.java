/**
 *   File Name: AbstractPerson.java<br>
 *
 *   Sarana, Maria<br>
 *
 *   Created: Dec 19, 2015
 *
 */

package com.sqa.ms.employees;

/**
 * AbstractPerson //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Sarana, Maria
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AbstractPerson implements IPerson {

	private int address;
	private int age;

	/**
	 * @see com.sqa.ms.employees.IPerson#getName()
	 */

	private String name;

	/**
	 * @return the address
	 */
	public int getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @see com.sqa.ms.employees.IPerson#move()
	 */
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(int address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class:");
		builder.append(this.getClass().getSimpleName());
		builder.append(" who lives at ");
		builder.append(this.address);
		builder.append(" and is only ");
		builder.append(this.age);
		builder.append(" years old, Welcome ");
		builder.append(this.name);
		builder.append("!");
		return builder.toString();
	}

}
