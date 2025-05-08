public class Main {
  public static void main(String[] args) {
      // Menguji ControlFlow
      System.out.println("=== ControlFlow ===");
      ControlFlow cf = new ControlFlow(5);
      System.out.println("If-Else: " + cf.ifElse());
      System.out.println("Switch: " + cf.switchCase());
      System.out.println("For Loop: " + cf.forLoop());

      // Menguji DataStructure
      System.out.println("\n=== DataStructure ===");
      DataStructure ds = new DataStructure(5);
      ds.initializeArray();
      System.out.println("Array Content: " + ds.getArrayContent());
      ds.addToList("Apple");
      ds.addToList("Banana");
      System.out.println("List Content: " + ds.getListContent());
      System.out.println("Find 3 in array: Index " + ds.findInArray(3));

      // Menguji ObjectOriented dan OOPExample
      System.out.println("\n=== ObjectOriented ===");
      OOPExample oop = new OOPExample("OOP Concepts");
      System.out.println("Concept: " + oop.getConcept());
      System.out.println(oop.encapsulation());
      System.out.println(oop.inheritance());
      System.out.println(oop.polymorphism());
  }
}