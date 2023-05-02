package sample.package1;

import java.util.PriorityQueue;

class Emp
{
	int empID;
	String name;
	int salary;
	
	public Emp(int empID,String name, int salary) {
	this.empID = empID;
	this.name = name;
	this.salary = salary;
		
	}
	@Override
	public String toString()
	{
		return "Emp Details [EmpID = " + empID + ",Name = " + name + ",Salary = " + salary + "]";
	}
	
}

public class PriorityQueueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Emp> pqEmp= new PriorityQueue<Emp>();
		pqEmp.add(new Emp(101,"A",5000));
		pqEmp.add(new Emp(102,"B",15000));
		pqEmp.add(new Emp(103,"C",10000));
		pqEmp.add(new Emp(104,"D",15000));
		pqEmp.add(new Emp(105,"E",25000));
		pqEmp.add(new Emp(106,"F",15000));
		pqEmp.add(new Emp(107,"G",5000));	
		pqEmp.add(new Emp(108,"H",500));
		System.out.println(pqEmp);

		System.out.println(pqEmp.poll());
		
	}

}
