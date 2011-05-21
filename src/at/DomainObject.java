package at;

public class DomainObject implements Comparable<DomainObject> {

	/**
	 * Default constructor
	 */


	public DomainObject() {
		super();
	}

public String toString() {
   return "DomainObject [name=" + name + ", comment=" + comment
           + ", uuid=" + uuid + "]";
}



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

public void setComment(final String comment) {
   this.comment = comment;
}

public String getName() {
   return name;
}

public void setName(final String name) {
   this.name = name;
}

public boolean equals(Object obj) {
   if (!(obj instanceof DomainObject)) {
      return false;
   }
   DomainObject domainObj = (DomainObject) obj;
   return uuid.equals(domainObj.getUuid());
}

public int compareTo(DomainObject o) {
   DomainObject domainObj = (DomainObject) o;
   int domObjeComp = name.compareTo(domainObj.getName());

  return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : 
           domObjeComp);
}



}
