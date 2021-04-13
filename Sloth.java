public class Sloth implements Animal{
  protected int slothNumber;
  private static int slothCount = 0;
  protected int position;
  protected double weight;
  protected double length;
  private static final int numberOfLimbs = 4;

  public Sloth(double l, double w)
  {
    length = l;
    weight = w;
    slothNumber = slothCount;
    slothCount++;
  }

  public void move(int numberOfSeconds)
  {
    position = position + numberOfSeconds;
  }

  public String toString()
  {
    return "Sloth " + slothNumber + ", location " + position;
  }

  public String sound()
  {
    return "yaaaaaaaa";
  }
}