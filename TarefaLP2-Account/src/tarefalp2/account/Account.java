package tarefalp2.account;

public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account(String i, String n){
       this.setId(i);
       this.setName(n);
    }
    
    public Account(String i, String n, int b){
       this.setId(i);
       this.setName(n);
       this.setBalance(b);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int credit(int amount){
        this.setBalance(balance + amount);
        return this.getBalance();
    }
    
    public int debit(int amount){
        if(amount <= this.getBalance()){
            this.setBalance(balance- amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.getBalance();
    }
    
    public int transferTo(Account another, int amount){
        if(amount <= this.getBalance()){
            this.setBalance(balance - amount);
            another.setBalance(balance + amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.getBalance();
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
    
}
