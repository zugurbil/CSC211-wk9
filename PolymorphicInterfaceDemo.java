/**
   This program demonstrates that an interface type may
   be used to create a polymorphic reference.
*/

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      // Create a CompactDisc object.
      CompactDisc cd =
              new CompactDisc("Greatest Hits",
                              "Joe Looney Band",
                              18.95);
      // Display the CD's title.                      
      System.out.println("Item #1: " +
                         cd.getTitle());
                         
      // Display the CD's price.
      showPrice(cd);

 /* 
  * cd1 in an interface reference variable.can call any methods defined in the interface
  */
      RetailItem cd1 =
              new CompactDisc("Songs form the Heart",
                              "Billy Nelson",
                              18.95);
      // Display the CD's title.                      
      System.out.println("Item #2: " +   " No title" );  
  /*                       cd1.getTitle());
        This will not work because not defined in the interface                 */
                         
      // Display the CD's price.
      showPrice(cd1);

   }

   /**
      The showPrice method displays the price
      of a RetailItem object.
      @param item A reference to a RetailItem object.
   */
   
   private static void showPrice(RetailItem item)
   {
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());  /**method defined in the interface**/
   }
}
