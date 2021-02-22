

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Patient {
    
    private String patientName;
    List<VitalSigns> vitalSignsHistory;
    VitalSigns vitalSigns;
    static Scanner in = new Scanner(System.in);
    
    public Patient(){
        vitalSignsHistory = new ArrayList<>();
         vitalSigns = new VitalSigns();
    }
    
    public void setVitalSigns(){
        System.out.println("Enter patient details");

        System.out.println("Age:");
        vitalSigns.setAge(in.nextFloat());
        
        System.out.println("Respiratory Rate:");
        vitalSigns.setRespiratoryRate(in.nextInt());
        
        System.out.println("Heart Rate:");
        vitalSigns.setHeartRate(in.nextInt());
        
        System.out.println("Blood Pressure:");
        vitalSigns.setSystolicBloodPressure(in.nextInt());
        
        System.out.println("Weight (in Kgs):");
        vitalSigns.setWeightInKilos(in.nextFloat());
        
        System.out.println("Weight (in Pounds):");
        vitalSigns.setWeightInPounds(in.nextFloat());
        

        if (isPatientNormal(vitalSigns))
        {
            System.out.println("Patient is Normal");
        }
        
        else {
            System.out.println("Patient is Abnormal");
           
        }
        System.out.println();

        vitalSignsHistory.add(vitalSigns);
        
         
    }
    
    public String getPatientName(){
    return patientName;
 
    }
    
    public void setPatientName(String patientName) {
    this.patientName = patientName;
    }
    
    public static void main(String[] args) {
        Patient p = new Patient();
        List<String> types= new ArrayList();
        types.add("heart rate");
        types.add("blood pressure");
        types.add("weight in kilos");
        types.add("weight in pounds");
        types.add("respiratory rate");
        //Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Patient name");
        
        
        p.setPatientName(in.nextLine());
        p.setVitalSigns();
        
        while(true) {

            System.out.println();
            System.out.println("Press 1: Enter more details");
            System.out.println("Press 2: Check Vitalsigns");

            System.out.println("Press 3: Exit");
            int input = in.nextInt();
            if (input==1) {
                p.print();
                p.newVitalSign();
            } else if (input==2) {
                for (int i = 0; i < types.size(); i++) {
                    String s = types.get(i);
                    System.out.println(i + " " + s);
                }
                int selection = in.nextInt();
                if (p.isThisVitalSignNormal(types.get(selection))) {
                 
                    System.out.println(types.get(selection) + " is Normal");
                }
                else{
                    System.out.println(types.get(selection) + " is AbNormal");
            }
            }
            else if(input == 3){
                System.exit(0);
            } 
            
            }
        
        
        
    }
    public void print()
    {
        System.out.println("");
        System.out.println("Patient Name" + getPatientName());
        System.out.println("Heart Rate     Age     Respiratory rate     Blood Pressure       Weight in kgs.      Weight in pounds" );
         for (VitalSigns v:vitalSignsHistory){
            System.out.println(+v.getHeartRate()+"           " + v.getAge()+ "       " + v.getRespiratoryRate()+ "      " +
                    v.getSystolicBloodPressure() + "       " + v.getWeightInKilos() + "       " + v.getWeightInPounds());
            
        }
    }
    public static boolean isPatientNormal(VitalSigns vitalSigns)
    {
        if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&
            (vitalSigns.getRespiratoryRate()>=30 && vitalSigns.getRespiratoryRate()<=50 ) &&
             (vitalSigns.getHeartRate()>=120 && vitalSigns.getHeartRate()<=160) &&
                (vitalSigns.getSystolicBloodPressure()>=50 && vitalSigns.getSystolicBloodPressure()<=70)&&
                (vitalSigns.getWeightInKilos()>=2 && vitalSigns.getWeightInKilos()<=3)&&
                (vitalSigns.getWeightInPounds()>=4.5 && vitalSigns.getWeightInPounds()<=7))
        
           
        {
            return true;
            
        }
       
        
       else if((vitalSigns.getAge()>=0.83 && vitalSigns.getAge()<1) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ) &&
             (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=140) &&
                (vitalSigns.getSystolicBloodPressure()>=70 && vitalSigns.getSystolicBloodPressure()<=100)&&
                (vitalSigns.getWeightInKilos()>=4 && vitalSigns.getWeightInKilos()<=10)&&
                (vitalSigns.getWeightInPounds()>=9 && vitalSigns.getWeightInPounds()<=22))
        {
            return true;
        }
        
        
       else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ) &&
             (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=130) &&
                (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=110)&&
                (vitalSigns.getWeightInKilos()>=10 && vitalSigns.getWeightInKilos()<=14)&&
                (vitalSigns.getWeightInPounds()>=22 && vitalSigns.getWeightInPounds()<=31))
        {
            return true;
        }
        
       else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<6) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ) &&
             (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=120) &&
                (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=110)&&
                (vitalSigns.getWeightInKilos()>=14 && vitalSigns.getWeightInKilos()<=18)&&
                (vitalSigns.getWeightInPounds()>=31 && vitalSigns.getWeightInPounds()<=40))
        {
            return true;
        }
        
       else if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ) &&
             (vitalSigns.getHeartRate()>=70 && vitalSigns.getHeartRate()<=110) &&
                (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=120)&&
                (vitalSigns.getWeightInKilos()>=20 && vitalSigns.getWeightInKilos()<=42)&&
                (vitalSigns.getWeightInPounds()>=41 && vitalSigns.getWeightInPounds()<=92))
        {
            return true;
        }
        
       else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
            (vitalSigns.getRespiratoryRate()>=12 && vitalSigns.getRespiratoryRate()<=20 ) &&
             (vitalSigns.getHeartRate()>=55 && vitalSigns.getHeartRate()<=105) &&
                (vitalSigns.getSystolicBloodPressure()>=110 && vitalSigns.getSystolicBloodPressure()<=120)&&
                (vitalSigns.getWeightInKilos()>=50 && vitalSigns.getWeightInKilos()<=1000)&&
                (vitalSigns.getWeightInPounds()>=110 && vitalSigns.getWeightInPounds()<=2000))
        {
            return true;
        }
        
       else{
        return false;
       }
        
    }
    
    public VitalSigns newVitalSign(){
        vitalSigns = new VitalSigns();
        setVitalSigns();
        return vitalSigns;
        
    }
    
    public boolean isThisVitalSignNormal(String vsign){
        switch (vsign) {
            case "respiratory rate":
                if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ))
                    return true;
                else  if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&
            (vitalSigns.getRespiratoryRate()>=30 && vitalSigns.getRespiratoryRate()<=50 ))
                        return true;
                else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ))
                    return true;
                 else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<5) &&
            (vitalSigns.getRespiratoryRate()>=20 && vitalSigns.getRespiratoryRate()<=30 ))
                     return true;
                 else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
            (vitalSigns.getRespiratoryRate()>=12 && vitalSigns.getRespiratoryRate()<=20 ))
                     return true;
                
                
                
                
                
                break;
            case "heart rate":
                 if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&
           
             (vitalSigns.getHeartRate()>=120 && vitalSigns.getHeartRate()<=160))
                     return true;
                  else if((vitalSigns.getAge()>=0.83 && vitalSigns.getAge()<1) &&
                          (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=140))
                      return true;
                  else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
                           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=130))
                      return true;
                  else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<5) &&
                          (vitalSigns.getHeartRate()>=70 && vitalSigns.getHeartRate()<=110))
                      return true;
                  else if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
                      (vitalSigns.getHeartRate()>=70 && vitalSigns.getHeartRate()<=110))
                      return true;
                  else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
                          (vitalSigns.getHeartRate()>=55 && vitalSigns.getHeartRate()<=105))
                      return true;
                 
                     break;
            case "blood pressure":
                if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&
                         (vitalSigns.getSystolicBloodPressure()>=50 && vitalSigns.getSystolicBloodPressure()<=70))
                 
                 return true;
                 else if((vitalSigns.getAge()>=0.83 && vitalSigns.getAge()<1) &&
                (vitalSigns.getSystolicBloodPressure()>=70 && vitalSigns.getSystolicBloodPressure()<=100))
                 
                 return true;
                  else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
                          (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=110))
                      return true;
                  else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<5) &&
                          (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=110))
                      return true;
                 else if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
                 (vitalSigns.getSystolicBloodPressure()>=80 && vitalSigns.getSystolicBloodPressure()<=120))
                     return true;
                else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
                        (vitalSigns.getSystolicBloodPressure()>=110 && vitalSigns.getSystolicBloodPressure()<=120))
                    return true;
                
               
                 break;
            case "weight in kilos":
                if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&
                         (vitalSigns.getWeightInKilos()>=2 && vitalSigns.getWeightInKilos()<=3))
                    return true;
                
                 else if((vitalSigns.getAge()>=0.83 && vitalSigns.getAge()<1) &&
             
                (vitalSigns.getWeightInKilos()>=4 && vitalSigns.getWeightInKilos()<=10))
                return true;
                 
                 else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
           
             
                (vitalSigns.getWeightInKilos()>=10 && vitalSigns.getWeightInKilos()<=14))
                     return true;
                 
                 else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<6) &&
           
                (vitalSigns.getWeightInKilos()>=14 && vitalSigns.getWeightInKilos()<=18))
                     return true;
                else if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
          
                (vitalSigns.getWeightInKilos()>=20 && vitalSigns.getWeightInKilos()<=42))
                    return true;
                 else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
           
                (vitalSigns.getWeightInKilos()>=50 && vitalSigns.getWeightInKilos()<=1000))
                     return true;
                
                                 break;
            case "weight in pounds":

                 if((vitalSigns.getAge()>=0 && vitalSigns.getAge()<0.83) &&

                (vitalSigns.getWeightInPounds()>=4.5 && vitalSigns.getWeightInPounds()<=7))

           
        
            return true;
            
        
       
        
       else if((vitalSigns.getAge()>=0.83 && vitalSigns.getAge()<1) &&
            
                (vitalSigns.getWeightInPounds()>=9 && vitalSigns.getWeightInPounds()<=22))
        
            return true;
        
        
        
       else if((vitalSigns.getAge()>=1 && vitalSigns.getAge()<3) &&
           
                (vitalSigns.getWeightInPounds()>=22 && vitalSigns.getWeightInPounds()<=31))
        
            return true;
        
        
       else if((vitalSigns.getAge()>=3 && vitalSigns.getAge()<6) &&
           
                (vitalSigns.getWeightInPounds()>=31 && vitalSigns.getWeightInPounds()<=40))
        
            return true;
        
        
       else if((vitalSigns.getAge()>=6 && vitalSigns.getAge()<12) &&
            
                (vitalSigns.getWeightInPounds()>=41 && vitalSigns.getWeightInPounds()<=92))
        
            return true;
        
        
       else if((vitalSigns.getAge()>=13 && vitalSigns.getAge()<1000) &&
           
                (vitalSigns.getWeightInPounds()>=110 && vitalSigns.getWeightInPounds()<=2000))
        
            return true;
        
                
                
            default:
                return false;
        }
        return false;
    }
    


}

   
    
    

