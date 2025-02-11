public class Bookshop
{
	String name;
	TextBook textBooks[];
    StoryBook storyBooks[];
	int counterTB;
	int counterSB;
	Bookshop( )
	{
		
	}
	public Bookshop(String name) 
	{
		this.name= name;
		textBooks= new TextBook[100];
		storyBooks= new StoryBook[100];
	}
	public void setName(String name) 
	{
		this.name= name;
	}
	String getName( ) 
	{
		return name;
	}
	boolean insertTextBook(TextBook tb)
	{
		if(counterTB<this.textBooks.length)
		{
			this.textBooks[counterTB]=tb;
			counterTB++;
			return true;
			
		}
		else
			return false;
	}
	
	boolean removeTextBook(TextBook sb)
	{
		for(int i=0;i<counterTB;i++)
		{
			if(textBooks[i]==sb)
			{
				textBooks[i]=textBooks[--counterTB];
				return true; 
			}
		}
		return false;
	}
	TextBook searchTextBook(String isbn)
	  {
		  TextBook ob=new TextBook();
		  for(int i=0;i<counterTB;i++)
			{
				if(textBooks[i].isbn==isbn)
				{
					//textBooks[i].showDetails();
					ob=textBooks[i]; 
				}
			}
		return ob;
	  }	
	
	boolean insertStoryBook(StoryBook sb)
	{
		if(counterSB<this.storyBooks.length)
		{
			this.storyBooks[counterSB]=sb;
			counterSB++;
			return true;
		}
		return false;
	}
	boolean removeStoryBook(StoryBook sb)
	{
		for(int i=0;i<counterSB;i++)
		{
			if(storyBooks[i]==sb)
			{
				storyBooks[i]=storyBooks[--counterSB];
				return true; 
			}
		}
		return false;
	}
	
	StoryBook searchStoryBook(String isbn)
	  {
		  StoryBook ob=new StoryBook();
		  for(int i=0;i<counterSB;i++)
			{
				if(storyBooks[i].isbn==isbn)
				{
					//textBooks[i].showDetails();
					ob=storyBooks[i]; 
				}
			}
		return ob;
	  }	
    
  void showAllTextBooks( ) 
  {
	  System.out.println("\n>Textbook Info<\n");
	  System.out.println("Name: "+this.name);
	  for(int i=0;i<counterTB;i++)
		{
			this.textBooks[i].showDetails();
		}
  }
  
 
  void showAllStoryBooks( ) 
  {
	  System.out.println("\n>StoryBook Info<\n");
	  System.out.println("Name: "+this.name);
	  for(int i=0;i<counterSB;i++)
		{
			this.storyBooks[i].showDetails();
		}
  }
}
  