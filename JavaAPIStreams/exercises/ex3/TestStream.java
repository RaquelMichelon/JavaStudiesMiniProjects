import java.util.stream.*;

public class TestStream {
  public static void main(String[] args) {
    
    Client c1 = new Client("Raquel", 55);
    Client c2 = new Client("Carlos", 200);
    Client c3 = new Client("Regina", 399);
    
    List<Client> clients = Array.asList(c1, c2, c3);
    clientes.forEach(c -> System.out.println(c.getPoints()));
    //55
    //200
    //399
    
    
    Stream<Client> stream = clients.stream()
      .filter(c -> c.getPoints() > 55);
    
    Stream<Integer> streamI = clients.stream()
      .map(c -> c.getPoints());
    
    
    //if the property points was long and we would like to return the stream in Integer...
    IntStream streamInt = clients.stream()
      .mapToInt(c -> c.getPoints());
    
    //LongStream ... mapToLong
    
    
    
  }
}
