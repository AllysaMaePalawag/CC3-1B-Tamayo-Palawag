package studentaccount;

public class StudentAccount {

    public static void main(String[] args) {  
        
        StudentInfo Student= new StudentInfo ("CITCS","2nd term 2018-2019");
        Student.setID("18-6901-559");
        Student.setFamilyName("PALAWAG");
        Student.setFirstName("ALLYSA MAE");
        Student.setAcadProg("BSIT");
        Student.setTrack("Web Technologies");
        Student.print();
            
    }
    
}

