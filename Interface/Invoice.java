public class Invoice implements Payable
{
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double priceItem;

	public Invoice(String partNumber, String partDescription, int quantity,
		double priceItem)
	{
		if(quantity < 0)
		{
			throw new IllegalArgumentException("Quantity must be >= 0");
		}

		if (priceItem < 0.0)
		{
			throw new IllegalArgumentException("PricePerItem must be >= 0");
		}

		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.priceItem = priceItem;
	}

	public String getPartNumber()
	{
		return partNumber;
	}

	public String getPartDescription()
	{
		return partDescription;
	}

	public void setQuantity(int quantity)
	{ 
         if(quantity < 0)
		{
			throw new IllegalArgumentException("Quantity must be >= 0");
		}

		this.quantity = quantity;
	}

	public void setPricePerItem(double priceItem)
	{ 
         if(priceItem < 0)
		{
			throw new IllegalArgumentException("PricePerItem must be >= 0");
		}

		this.priceItem = priceItem;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getPricePerItem()
	{
		return priceItem;
	}

	@Override
	public String toString()
	{
		return String.format("%s: \n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
							"invoice", "part number", getPartNumber(), getPartDescription(),
							"quantity", getQuantity(), "price per item", getPricePerItem());
	}

	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem();
	}
}