public class TestAnimal
{
  public static void main(String args[])
  {
    Animal [] animals = new Animal[4];
    animals[0] = new Squirrel(1.5, 3.0);
    animals[1] = new Sloth(4.2, 1.3);
    animals[2] = new FlyingSquirrel(3.2, 2.2);
    animals[3] = new GraySquirrel(5.2, 1.1);

    for(int i = 0; i < 4; i++)
    {
      animals[i].move(2);
      animals[i].toString();
    }
  }
}

