public class Squirrel implements Animal{
  protected int squirrelNumber;
  private static int squirrelCount = 0;
  protected int position;
  protected double weight;
  protected double length;
  private static final int numberOfLimbs = 4;

  public Squirrel(double l, double w)
  {
    length = l;
    weight = w;
    position = 0;
    squirrelNumber = squirrelCount;
    squirrelCount++;
  }

  public void move(int numberOfSeconds)
  {
    position = position + numberOfSeconds * 4;
  }

  public String toString()
  {
    return "Squirrel " + squirrelNumber + ", location " + position;
  }

  public String sound()
  {
    return "chitter-chitter-chitter";
  }
}