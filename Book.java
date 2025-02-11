class Book
{
	protected String isbn;
    protected String bookTitle;
    protected String authorName;
    protected double price;
    protected int availableQuantity;
	Book()
	{
		
	}
    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{ 
		this.isbn= isbn;
		this.bookTitle= bookTitle;
		this.authorName= authorName;
		this.price= price;
		this.availableQuantity=availableQuantity;
	}
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
    public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
    public void setPrice(double price)
	{
		this.price=price;
	}
    public void setAvaiableQuantity(int availableQuantity)
	{
	    this.availableQuantity=availableQuantity;
	}
	public String getIsbn( )
	{
		return isbn;
	}
    public String getBookTitle( )
	{
		return bookTitle;
	}
    public String getAuthorName( )
	{
		return authorName;
	}
    public double getPrice( )
	{
	    return price;
	}
    public int getAvailableQuantity( )
	{
		return availableQuantity;
	}
	public void addQuantity(int amount)
	{
		this.availableQuantity= amount+availableQuantity;
		
	}
    public void sellQuantity(int amount)
	{
		this.availableQuantity= availableQuantity-amount;
	}
	public void showDetails()
	{
		//System.out.println("\nInformation about the Book\n");
		System.out.println("ISBN Number is : "+this.isbn);
		System.out.println("Book Title is  : "+this.bookTitle);
		System.out.println("Author Name is : "+this.authorName);
		System.out.println("Price          : "+this.price);
		System.out.println("Available quantity after adding and selling: "+this.availableQuantity);
	}
}