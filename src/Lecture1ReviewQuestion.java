public class Lecture1ReviewQuestion {

    //This will be my own definition of the String class
    public class MyString{
        private char[] data; // Initializes private variable 'data' that is a character array used to store all characters in my String
        private int length; // Initializes private variable 'length' that is the length of characters in my String

        //Constructor
        public MyString(String str) {
            this.data = str.toCharArray(); //This should convert the input String to a character array
            this.length = data.length; // This should set the length variable of the String to the # of characts in the data array
        }











    }
}
