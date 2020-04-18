import java.util.TreeSet;

public class Company
{
	private TreeSet<Product> products;

	public Company(String name)
	{
		products = new TreeSet<Product>();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
