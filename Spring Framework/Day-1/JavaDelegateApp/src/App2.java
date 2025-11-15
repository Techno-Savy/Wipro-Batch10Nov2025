

interface Allocator
{
	void taskAllocation(String user);

}

class Manager1 implements Allocator
{

public void taskAllocation(String user)
{
System.out.println("Task is allocated by : Manager to " + user);
}

}

class TeamLead1 implements Allocator
{

public void taskAllocation(String user)
{
System.out.println("Task is allocated by : Team Lead to " + user);
}

}

//Handling the Tight Coupling Code in Core Java itself by using Interface to make it as Loose Coupling

/* 
 * */
class Delegate1{

	// Here delegate depends upon interface only
  private Allocator allocator; // depends on abstraction 
	
  // dependency provided from interface outside the concrete classes 
  //which makes independent of concrete classes(Manager , teamleader) with delegate
  public Delegate1(Allocator allocator) {
		super();
		this.allocator = allocator;
	  };
  
  
  
public void notifyUser()
{
//manager.taskAllocation("Niti");
	
	allocator.taskAllocation("Niti");




 
}

}

public class App2
{
public static void main(String[] args)
{
Delegate1 delegate = new Delegate1(new Manager1()); // concrete class 
delegate.notifyUser();

Delegate1 delegate2 = new Delegate1(new TeamLead1()); // concrete class 
delegate2.notifyUser();
}
}

// so , here still it's not a loose coupling where developer has to manually wired the dependencies which of the implementation or object
// to be used whether manager or team leader or etc.

// still developer has to modify the code manually
  

