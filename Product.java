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
	public static void main(String[] args)
	{
		Product p1 = new Product();
		System.out.println(p1.name);
		p1.setName("Pepsi");
		System.out.println(p1.getName());
	}
}

