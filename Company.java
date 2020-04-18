import java.util.ArrayList;

public class Company
{
	private ArrayList<Product> products;
	private String name;
	
	public Company(String name)
	{
		products = new ArrayList<Product>(100);
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
