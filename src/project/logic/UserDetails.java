package project.logic;

import project.logic.model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class UserDetails {


    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }

    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO : RQ - 2
    public static Double SalaryAccumulated(User user){
        String Dob = user.getDob();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        Calendar c = Calendar.getInstance();

        try {
            date = formatter.parse(Dob);
            c.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);
        int date1 = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date1);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        System.out.println("age:" + diff1.getYears() + "years");
        int remainingAge_qc=55-diff1.getYears();  // calculate  retirement age for QC
        int remainingAge_on=58-diff1.getYears();  // calculate retirement age for ON
        double salaryHike=0,totalSalary=0;
        salaryHike=user.getSalary();
        String province=user.getAddress().getProvince();
        if(province =="QC"){
            for(int i=1;i<=remainingAge_qc;i++){
                salaryHike=salaryHike+salaryHike*0.02 ;
                totalSalary+=salaryHike;
            }
        }
        else {
            for(int i=1;i<=remainingAge_on;i++){
                salaryHike=salaryHike+salaryHike*0.02 ;
                totalSalary+=salaryHike;
            }
        }

        return totalSalary;
    }



}
