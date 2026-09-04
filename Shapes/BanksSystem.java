import java.util.*;
import java.time.LocalDate;
import java.time.Period;

class Account{

    float balance;
    String type;

    Account(float bal,String t){

        this.balance = bal;
        this.type = t;


    }

    void display(){

        System.out.println("TYPE:  "+type+"  BALANCE:  "+balance );
    }
}

class Customer{

    Account[] accounts;

    public String name;
    private String dob;
    private int gender;
    String address;
    private int cif;
    protected float  balance;

    String passno;
    String persno;//identiies

    Customer(String name,String dob,int gender,String address,int cif,float balance){

        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.cif = cif;
        this.balance = balance;
        this.passno = passno;
        this.persno = persno;


    }

    void setAccounts(Account[] accounts){

        this.accounts = accounts;
    }

    String getFullName(){

        if(gender == 1)
            return "Mr."+ this.name;
        else
            return "Ms."+ this.name;
        
    }

    String getAge(String dob){

        String[] parts = dob.split("/");
        int month = parts[0];
        int year  = parts[1];
        int day = parts[2];

        LocalDate bd =  LocalDate.of(year,month,day);
        LocalDate cd = LocalDate.now();
        Period age = Period.between(bd,cd);

        return "YEARS "+age.getYears()+"MONTHS "+ age.getMonths();

    }

    boolean isValid(String persno,String passno){

        if(passno.matches(" [a-zA-Z]{1}[0-9]{7})") && persno.matches("[0-9]{4} [0-9]{4} [0-9]{4}"))
            return true;
        else
            return false;


    }

    void showAccounts(int cif,String persno){

        if (this.cif == cif && this.persno.equals(persno)) {
            for (int i = 0; i < accounts.length; i++) {
                this.accounts[i].display();
            }
        } 
        else {
        System.out.println("Details do not match.");
        }
    }


}

class SpareBank{

    Customer[] customers;

    SpareBank(){


    }

    void generateCustomers(int n){


    }

    void calculateInterest(String date,float r){


    }

    void fetchAccountDetails(int cif){


    }

    void generateSummaries(int n){


    }
}

public class BankSystem{

    public static void main(String[] args) {
        

    }
}