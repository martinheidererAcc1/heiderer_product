public class Product
{
	private String name;
	public Product()
	{
		name = "Coca Cola";
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		if(name != null)
			this.name = name;
	}
}


