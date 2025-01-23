

/*  Goals:
 *  1. Set the given name.
 *  2. Return the given name.
 *  3. Set the surname.
 *  4. Return the surname.
 *  5. Set the age.
 *  6. Return the age.
 *  7. Increment the age.
 *  8. Compare two persons for equality.
 *  9. Copy a person.
 * 10. Return a copy of a person.
 * 11. Print a person.
 */
public class Person {
    private String givenName;
    private String surName;
    private int age;

    public void setGivenName(String s){
        //Should set the given name
    }

    public void getGivenName(){
        //Should return the given name
    }

    public void setSurName(String s){
        //Should set the Surname
    }

    public void getSurName(){
        //Should return the Surname
    }

    public void setAge(int y){
        //Should set the age in y - years
    }

    public void getAge(){
        //Should return the age in years
    }

    public void incAge(){
        //Should increment the age by 1 year
    }

    public boolean equals(Person otherPerson){
        //Should compare this person to another person, return true if all fields identical
        //Set to false initially before building method
        return false;
    }

    public void makeCopy(Person otherPerson){
        //Should copy the contents of the otherPerson into this object
    }

    public Person getCopy(){
        //Should return a new Person object with a copy of the current object contents.
        return new Person();
    }

    /*
    @Override public String toString(){
        return System.out.print("Hello");
    }
     */
}


