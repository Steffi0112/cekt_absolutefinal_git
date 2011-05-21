package at;

public class DomainFactory {

   public static DomainObject createDomainObject(String name, String comment) {
      return new DomainObject(name, comment);
   }
}
