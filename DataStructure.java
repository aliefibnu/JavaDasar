import java.util.ArrayList;

public class DataStructure {

  private int[] array;
  private ArrayList<String> list;

  // Constructor
  public DataStructure(int size) {
    this.array = new int[size];
    this.list = new ArrayList<>();
  }

  // Sub-materi: Inisialisasi array
  public void initializeArray() {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
  }

  // Sub-materi: Menambahkan elemen ke list
  public void addToList(String item) {
    list.add(item);
  }

  // Sub-materi: Mencari elemen di array
  public int findInArray(int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // Getter untuk melihat isi array dan list
  public String getArrayContent() {
    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      result.append(array[i]);
      if (i < array.length - 1) result.append(", ");
    }
    result.append("]");
    return result.toString();
  }

  public String getListContent() {
    return list.toString();
  }
}
