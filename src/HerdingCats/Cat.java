package HerdingCats;

public class Cat implements Comparable<Cat>
{
  public String name;
  public double weight;

  public Cat(String name, double weight);

  @Override
  public int compareTo(Cat c);

  @Override
  public boolean equals(Object o);
}