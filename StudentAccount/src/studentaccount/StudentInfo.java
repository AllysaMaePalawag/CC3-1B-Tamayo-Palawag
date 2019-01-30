package studentaccount;

public class StudentInfo {
        String university;
        String college;
        String term;
        
        public StudentInfo(String college, String term){
            this.university = "University of the Cordilleras";
            this.college = college;
            this.term = term;
        }
        
        private String idnumber;
        private String familyname;
        private String firstname;
        private String academicprogram;
        private String track;
        
        public void setID(String IdNumber){
            
            idnumber = IdNumber;
        }
        
        public String getID(){
     
        return idnumber;
        }
        
        public void setFamilyName(String FamilyName){
            
            familyname = FamilyName;
        }
        
        public String getFamilyName(){
     
        return familyname;
        }
        
        public void setFirstName(String FirstName){
            
            firstname = FirstName;
        }
        
        public String getFirstName(){
     
        return firstname;
        }
        
        public void setAcadProg(String AcadProg){
            
            academicprogram = AcadProg;
        }
        
        public String getAcadProg(){
     
        return academicprogram;
        }        
        
        public void setTrack(String Track){
            
            track = Track;
        }
        
        public String getTrack(){
     
        return track;
        }  
        
        public void print(){
            System.out.println("=====================================\n"
                 + this.university + "\n\t" + this.college + "\n\t" 
                 + this.term + "\nStudent Information: "+ "\nID NUMBER: " 
                 + this.idnumber + "\nNAME: " + this.familyname + "," 
                 + this.firstname + "\nACADEMIC PROGRAM: " + this.academicprogram
                 + " - " + this.track);    
}
}
