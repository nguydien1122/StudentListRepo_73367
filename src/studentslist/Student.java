package studentslist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
   
    private String name;
    private int id;
    private String Dob;
    private int maxHrs;
 
    public Student()
    {
        name = "Not Set";
        id = 0;
    }
    public Student(String givenName,int givenId)
    {
        name = givenName;
        id = givenId;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
           return this.name;
     }
    
    public void setId(int givenId)
    {
            id = givenId;
    }
    
    public int getId()
    {
        return id;
    }

    /**blue :means changed it
     * green: new
     * red : delete
     * @return the Dob
     */
    public String getDob() {
        return Dob;
    }

    public  String toString(){
        return "Student";
    }
}
