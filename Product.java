public class Product
{
	private String name;
<<<<<<< HEAD
	private onStock boolean;
	public Product()
	{
		setName(Coca Cola);
		setOnStock(true);
=======
	private float price;
	int id;

	public Product()
	{
		setName("Coca Cola");
		setPrice(10);
>>>>>>> origin/master
	}
	public String getName()
	{
		return name;
	}
<<<<<<< HEAD
	public boolean getOnStock()
	{
		return onstock;
=======
	public float getPrice()
	{
		return price;
>>>>>>> origin/master
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
<<<<<<< HEAD
	public void setOnStock(boolean onStock)
	{
		this.onStock = onStock;
=======
	public void setPrice(float price)
	{
		this.price = price;
>>>>>>> origin/master
	}
	public void setId(int id)
	{
		this.id = id;
	}
}

