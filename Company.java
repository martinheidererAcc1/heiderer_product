import java.util.ArrayList;

public class Company
{
	private LinkedList<Product> products;
	private String name;
	
	public Company(String name)
	{
		products = new LinkedList<Product>();
		name = "IBM";
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
