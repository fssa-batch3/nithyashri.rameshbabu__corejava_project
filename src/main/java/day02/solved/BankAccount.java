package day02.solved;

public class BankAccount {
	
	 private String accno;
	 private String name;
	 private long balance;

	    public void setacc(String id) {
	        this.accno = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setBal(long balance) {
	        this.balance = balance;
	    }

	    
	    public String getacc() {
	        return accno;
	    }

	    public String getName() {
	        return name;
	    }

	    public long getBal() {
	        return balance;
	    }


	  public static void main(String[] args) {
	         
	        BankAccount acct1 = new BankAccount();
	        acct1.setacc("A101");
	        acct1.setName( "Krishna" );
	        acct1.setBal(1000l);
	 
	        System.out.println(acct1.getacc());
	        System.out.println(acct1.getName());
	        System.out.println(acct1.getBal());
	    }
}
