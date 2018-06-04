public class ImportDemoTest{
    public static void main(String[] args){
        ImportDemo xXXX = new ImportDemo(); //We are instantiating a new ImportDemo object. Now, all public methods of the ImportDemo class are available to the object
        String currentDate = xXXX.getCurrentDate(); //Calling the getCurrentDate() method on the object.
        System.out.println(currentDate); //Printing the currentDate string
    }
}