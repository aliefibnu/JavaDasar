public abstract class ObjectOriented {

  protected String concept;

  // Constructor
  public ObjectOriented(String concept) {
    this.concept = concept;
  }

  // Sub-materi: Encapsulation
  public String encapsulation() {
    return "Encapsulation: Hiding data with private access, accessed via getters/setters.";
  }

  // Sub-materi: Inheritance (abstract method)
  public abstract String inheritance();

  // Sub-materi: Polymorphism
  public String polymorphism() {
    return "Polymorphism: Same method, different implementations in subclasses.";
  }

  // Getter
  public String getConcept() {
    return concept;
  }
}
