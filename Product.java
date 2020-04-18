public class Product
{
	private String name;
	private float price;
	int id;

	public Product()
	{
		setName("Coca Cola");
		setPrice(10);
	}
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void setId(int id)
	{
		this.id = id;
	}
}

