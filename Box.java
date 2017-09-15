public class Box<T> {

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
	  super();
	  this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T t)
  {
	  super();
	  isFull = true;
	  contents = t;
  }

  /**
   * Check the contents of the box
   * @return Whatever is in the box.
   */
  public T getContents()
  {
	  return contents;
  }

  /**
   * Tell whether the box is full or not
   * Return boolean whether the box is  full
   */
  public boolean isFull()
  {
	  return isFull;
  }

  /**
   * Fills the box with t and set isFull to true
   *@param t is the thing you want the contents to be
   */
  public void fill(T t)
  {
	  contents = t;
	  isFull = true;
	  
  }
  /**
   *Empty out the box, and give back hatever was in it
   *@return the contents that were in the box
   */
  public T empty()
  {
	  T tC = contents;
	  contents = null;
	  isFull = false;
	  return tC;
  }
  /**
   * Simple method to convert Box to string
   * @return contents in a form of a string unless the box is empty in which it returns "The box is empty"
   */
  public String toString()
  {
	  if(isFull)
		return contents.toString();
	  return "The box is empty";
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>(1);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box
	stringBox.fill("something");


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method
	Integer iC = intBox.getContents();
	String sC = stringBox.getContents();
	System.out.println("The boxes contain: " + sC + ", " + iC);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes
	stringBox.empty();
	intBox.empty();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
