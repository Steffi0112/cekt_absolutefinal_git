package at;

public class DomainObject {
	/**
	 * Default constructor
	 */


	public DomainObject() {
		super();
	}

public String id;

public DomainObject(String id) {
  super();
  this.id = id;
}

public String getId() {
   return id;
}

private String name;

public String id = UUID.randomUUID().toString()

}
