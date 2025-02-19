package redoy;

public class Bank {
    private String Bankname;
    Emp emp;

    public void setBankname(String bankname) {
        Bankname = bankname;
    }

    Bank(Emp emp){
        this.emp=emp;
    }

    void display(){
        System.out.println("Bank Name : "+Bankname);
        System.out.println("ID : "+emp.id + "\nEmployee Name  : " + emp.name);
    }
}
