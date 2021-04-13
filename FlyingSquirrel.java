public class FlyingSquirrel extends Squirrel{

  public FlyingSquirrel(double l, double w)
  {
    super(l,w);
  }

  public void move(int numberOfSeconds)
  {
    position = position + 6 * numberOfSeconds;
  }
}