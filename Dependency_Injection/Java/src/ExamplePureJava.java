//Content Source: https://blog.algaworks.com/injecao-de-dependencias-spring/

//Dependency Injection is a project pattern;
//With it, the responsibilities are distributed in each class which gets better the code legibility and facilitates code maintenance.
//It is one way to apply control inversion in one class that uses other classes funcionality, left aside the responsability of instantiate or search for objects of those other classes that it depends.
//So the idea is do not instantiate objects whose functions can be changed on the future inside one class, but LEFT THE RESPONSABILITY OF THIS INSTANTIATION TO WHO CALL THE CLASS.

//EXAMPLE USING PURE JAVA APPLYING DEPENDENCY INJECTION MANUALLY

//this class has a method that receive one product;
public class PriceService {
  
  //here we have one class dependency with the responsability of instantiate and use this class. But that is a problem.
  //So lets create an interface "TaxCalculator"
  private SimpleTaxCalulator taxCalculator = new SimpleTaxCalculator();

  //this method return the final price to the product;
  public BigDecimal calculatePrice(Product product) {
    //do other calcs of prices
    return this.taxCalculator.calc(product);
  }

}



//interface that declare the abstract method that should be implemented
public interface TaxCalculator {
  BigDecimal calc(Product product);
}



//Now, how to inject dependency...
//this class do not depend anymore from an implementation of the SimpleTaxCalculator, just needs of an abstraction of one calculator: an interface
//now we can implement new tax calculators every time we need without afects the work of the PriceService.
public class PriceService {
  
  //change the dependency of the class SimpleTaxCalculator to the interface
  private TaxCalculator taxCalculator;
  
  //create a constructor
  public PriceService(TaxCalculator taxCalculator) {
    this.taxCalculator = taxCalculator;
  }

  //this method return the final price to the product;
  public BigDecimal calculatePrice(Product product) {
    //do other calcs of prices
    return this.taxCalculator.calc(product);
  }

}


