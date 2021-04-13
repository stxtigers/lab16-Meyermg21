public class TestEmployee 
{
  public static void main(String args[])
  {
      Employee[] employees = new Employee[2];
      employees[0] = new Employee();
      employees[1] = new Employee();

      for (int i = 0; i > 2; i++)
      {
      employees[i].setLastName("Adams");
      }
      final TechEmployee [] techEmployees = new TechEmployee[4];
      techEmployees[0] = new TechEmployee();
      techEmployees[1] = new TechEmployee();
      techEmployees[2] = new TechEmployee();
      techEmployees[3] = new TechEmployee();
      for (int i = 0; i < 4; i++)
      {
        techEmployees[i].setQual("Professional Slapper");
      }

    for (int x = 0; x < employees.length; x++)
    {
      System.out.println(employees[x]);
    
    }
    for (int x = 0; x < techEmployees.length; x++)
    {
      System.out.println(techEmployees[x]);
    }
    techEmployees[0].setPayRate(7.5);
    System.out.println(techEmployees[0].getPayRate());

    System.out.println(techEmployees[3].getCount());
}
}