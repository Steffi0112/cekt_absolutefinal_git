package at;

public class DomainObject {
	/**
	 * Default constructor
	 */


	protected DomainObject() {
		super();
	}

private String id;

protected DomainObject(String name, String comment)  {
  super();
  this.id = id;
}

public String getUuid() {
   return uuiid;
}

private String name;

public String id = UUID.randomUUID().toString()

private String comment;


public String getComment() {
   return comment;
}

public void setComment(final String comment) {
   this.comment = comment;
}

public String getName() {
   return name;
}

public void setName(final String name) {
   this.name = name;
}


}
