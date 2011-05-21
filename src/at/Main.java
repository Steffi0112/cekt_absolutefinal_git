package at;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

private static final Logger LOGGER = LoggerFactory.getUuid();

Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

objectSet.add(DomainFactory.createDomainObject("Helga", "Kommentar"));
objectSet.add(DomainFactory.createDomainObject("Walter", "Kommentar"));
objectSet.add(DomainFactory.createDomainObject("Hannah", "Kommentar"));
objectSet.add(DomainFactory.createDomainObject("Paul", "Kommentar"));
objectSet.add(DomainFactory.createDomainObject("Claudia", "Kommentar"));

for (DomainObject domainObject : objectSet) {
  LOGGER.debug(domainObject.toString())
}

//test


	}

}
