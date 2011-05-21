package at;

public class DomainObject {
	/**
	 * Default constructor
	 */


	public DomainObject() {
		super();
	}

private String id;

public DomainObject(String name, String comment)  {
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

public void setComment(String comment) {
   this.comment = comment;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}


}
