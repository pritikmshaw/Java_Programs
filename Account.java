import java.util.Scanner;
class Account {
    private String name;
    private int bal;
    private int cid;
    private int lastansac;
    private String accnttyp;
// for storing 
    Account(String nam,int id,String acnt){
        this.name=nam;
        this.cid=id;
        this.accnttyp=acnt;
    }
    //declearing funcn
    void deposit(int amount){
    if (amount!=0){
        bal=bal+amount;
        lastansac=amount;}
    }
    void withdraw(int amount){
        if (amount!=0){
            bal=bal-amount;
            lastansac=-amount; }
    }
    // get mutator to get the value
    void getlastansac(){
        if (lastansac>0){
            System.out.println("Deposited: "+lastansac); }
        else if(lastansac<0){
            System.out.println("Withdrawn: "+Math.abs(lastansac)); }
        else{
            System.out.println("No transaction occoured"); }
    }

    // menu friven type
    void showmenu(){
        char option='\0';
        int count=0;
        Scanner obj= new Scanner(System.in);
        
        do{
        
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous transacation");
            System.out.println("E. Number of transaction");
            System.out.println("F. Exit");
            System.out.println("******************************");

            System.out.print("Enter an option : ");
            option= obj.next().charAt(0);
            switch (option){
                case 'A':
                    System.out.println("Balance= "+bal);
                    System.out.println("******************************");
                    System.out.println("\n");
                    count=count+1;
                    break;
                case 'B':
                    System.out.print("Enter amount to deposit= ");
                    int amount=obj.nextInt();
                    System.out.println("******************************");

                    deposit(amount); // function call
                    System.out.println("\n");
                    count=count+1;
                    break;
                case 'C':
                    System.out.print("Enter amount to withdraw= ");
                    int amount2=obj.nextInt();
                    System.out.println("******************************");
                    withdraw(amount2); // function call
                    System.out.println("\n");
                    count=count+1;
                    break;
                case 'D':
                    getlastansac();  // method called 
                    System.out.println("******************************");
                    System.out.println("\n");
                    count=count+1;
                    break;
                case 'E':
                    System.out.println("Number of transactions: "+count);
                    System.out.println("******************************");
                    System.out.println("\n");

                    count=count+1;
                    break;
                default:
                    System.out.println("You Wished to Exit ");
                    System.out.println("\n");
                    break;
            }

        }while (option !='F');
        System.out.println("Thanks for using our services");
        System.out.println("******************************");


    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCid() { return cid; }
    public void setCid(int cid) { this.cid = cid; }
    public String getAccnttyp() { return accnttyp; }
    public void setAccnttyp(String accnttyp) { this.accnttyp = accnttyp; }

    
    public String toString() {
        return "{ Account" +
                "name='" + name + '\'' +
                ", cid=" + cid +
                ", accnttyp='" + accnttyp + '\'' +
                '}';
    }
}