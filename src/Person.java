

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

    /**
     * Person constructor - no args
     */
    public Person() {
        givenName = "";
        surName = "";
        age = 0;
    }

    /**
     * Person constructor - 3 args
     *
     * @param g given name
     * @param s surname
     * @param a age
     */

    public Person(String g, String s, int a) {
        givenName = g;
        surName = s;
        age = a;
    }

    public void setGivenName(String s){
        //Should set the given name
        givenName = s;
    }

    public String getGivenName(){
        //Should return the given name
        return givenName;
    }

    public void setSurName(String s){
        //Should set the Surname
        surName = s;
    }

    public String getSurName(){
        //Should return the Surname
        return surName;
    }

    public void setAge(int y){
        //Should set the age in y - years
        age = y;
    }

    public int getAge(){
        //Should return the age in years
        return age;
    }

    public void incAge(){
        //Should increment the age by 1 year
        ++age;
    }

    public boolean equals(Person otherPerson){
        //Should compare this person to another person, return true if all fields identical
        //Set to false initially before building method
        return ( ( age == otherPerson.age) &&
                ( givenName.compareToIgnoreCase(otherPerson.givenName) == 0 ) &&
                ( surName.compareToIgnoreCase(otherPerson.surName) == 0 ) );
    }

    public void makeCopy(Person otherPerson){
        //Should copy the contents of the otherPerson into this object
        givenName = otherPerson.givenName;
        surName = otherPerson.surName;
        age = otherPerson.age;
    }

    public Person getCopy(){
        //Should return a new Person object with a copy of the current object contents.
        Person temp = new Person(givenName, surName, age);
        return temp;
    }

    public String toString() {
        return givenName + " " + surName + ". Age " + age + ".";
    }

    /**
     * built-in exerciser
     *
     * @param args from the command line
     */
    public static void main(String[] args) {
        Person p = new Person();

        // ... some time later ...

        p.setGivenName("Bob");
        p.setSurName("Smith");
        p.setAge(36);
        System.out.print(p);
    }

}


