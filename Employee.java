public class Employee{
  protected String lastName;
  double payRate;
  protected static int numberOfEmployees = 0;
  public Employee()
  {
    numberOfEmployees++;
  }

  public void setLastName(String name)
  {
    lastName = name;
  }
  public String getlastName()
  {
    return lastName;
  }
  public void setPayRate(double pr)
  {
    payRate = pr;
  }
  public double getPayRate()
  {
    return payRate;
  }
  public static int getCount()
  {
    return numberOfEmployees;
  }
  public String toString()
  {
    String str = "Employee : " + lastName + " is payed " + payRate;
    return str;
  }

  
}