class Account{
	private String cname;
	private int pan;
	private int accno;
	private String branch;
	private float balance;
	private float min_bal;


	public Account(String cname,int accno,String branch,float balance){
		this.cname = cname;
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.pan = -1;
		this.min_bal = 10000;
	}

	public Account(String cname,int pan,int accno,String branch,float balance){
		this.cname = cname;
		this.pan = pan;
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.min_bal = 10000;
	}

	public String getCName(){
		return cname;
	}

	public int getPan(){
		return pan;
	}

	public int getAccNo(){
		return accno;
	}

	public String getBranch(){
		return branch;
	}

	public float getBalance(){
		return balance;
	}

	public void setPan(int pan){
		this.pan = pan;
	}

	public void setBalance(float balance){
		this.balance = balance;
	}

	public void deposit(/*int accno,*/float amount) throws PANRequiredException{
		if(this.accno == accno)
			if(amount > 50000 && pan == -1)
				throw new PANRequiredException();
			else this.amount += amount;
	}

	public void withdraw(/*int accno,*/float amount){
		if(this.accno == accno)
			if(amount > balance)
				throw new NotEnoughMoneyException(balance);
			else if(balance - amount < min_bal)
				throw new MinBalRequiredException(balance);
			else
				this.amount -= amount;
	}
	
	public String toString(){
		return "Name       : " + cname + "\n" +
			   "Pan Number : " + pan + "\n" +
			   "Acc Number : " + accno + "\n" +
			   "Branch     : " + branch + "\n" +
			   "Balance    : " + balance + "\n";
	} 
}

class TestException{
	static Account search(Account[] acc,int accno){
		int index = -1;
		for(int i = 0 ; i < acc.length ; i++)
			if(acc[i].getAccNo() == accno){
				found = i;
				break;
			}
		if(index == -1)
			throw new AccountNotFoundException(accno);
		return acc[index];
	}
}