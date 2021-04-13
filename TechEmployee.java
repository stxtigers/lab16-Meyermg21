public class TechEmployee extends Employee{
  String qual;

  public TechEmployee()
  {
    super();
  }

  public void setQual (String ql)
  {
    qual = ql;
  }

  public String getQual()
  {
    return qual;
  }

  public void setPayRate(double pr)
  {
    payRate = pr * 2;
  }

  public String toString()
  {
    String str = qual + " Employee : " + lastName + " is payed " + payRate;
    return str;
  }
}