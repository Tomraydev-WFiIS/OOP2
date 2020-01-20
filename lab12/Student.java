public class Student {
    private String firstname;
    private String lastname;
    private int age;

    Student(){}

    Student(String fname, String lname, int a){
        firstname = fname;
        lastname = lname;
        age = a;
    }

    public void setImie(String fname){
        firstname = fname;
    }
    public void setNazwisko(String lname){
        lastname = lname;
    }
    public void setWiek(int a){
        age = a;
    }

    public String getImie(){
        return firstname;
    }
    public String getNazwisko(){
        return lastname;
    }
    public int getWiek(){
        return age;
    }

    public String toString() {
        return firstname + " " + lastname + " " + age;
    }
}