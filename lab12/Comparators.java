import java.util.Comparator;

class ImieSort implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getImie().compareTo(b.getImie());        
    }
}

class NazwiskoSort implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getNazwisko().compareTo(b.getNazwisko());        
    }
}

class WiekSort implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getWiek() - b.getWiek();
    }
}     
   