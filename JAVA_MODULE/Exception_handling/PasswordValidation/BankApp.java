package PasswordValidation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


// ----------------------------- ACCOUNT CLASS -----------------------------
 abstract class Account {

    static int counter = 1000;

    int accno;
    String acHolderName;
    double balance;
    LocalDate lastTransactionDate;
    int transactionCount;
    Transaction[] transactions = new Transaction[200];

    // Default constructor
    Account() {
        this.accno = counter++;
        this.acHolderName = "Krutika";
        this.balance = 100;
        this.lastTransactionDate = LocalDate.now();
    }

    // Parameterized constructor
    Account(int accNO, String acHolderName, double balance) {
        this.accno = accNO;
        this.acHolderName = acHolderName;
        this.balance = balance;
        this.lastTransactionDate = LocalDate.now();
    }

    // Abstract methods
    public abstract void withdraw(double amt);
    public abstract double calculateInterest();

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit Failed: Amount must be greater than zero.");
            return;
        }

        this.balance += amount;

        addTransaction(amount, "DEPOSIT");

        System.out.println("Deposit Successful: ₹" + amount);
        System.out.println("Updated Balance: ₹" + this.balance);
    }

    // Add transaction
    public void addTransaction(double amount, String type) {

        if (transactionCount >= transactions.length) {
            System.out.println("❗Transaction limit reached! Cannot store more transactions.");
            return;
        }

        Transaction t = new Transaction(this.accno, amount, type);

        transactions[transactionCount] = t;
        transactionCount++;

        this.lastTransactionDate = LocalDate.now();
    }

    Transaction[] getTransactions() {
        return this.transactions;
    }

    // Display function
    public void display() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Number        : " + this.accno);
        System.out.println("Account Holder Name   : " + this.acHolderName);
        System.out.println("Balance               : " + this.balance);
        System.out.println("Last Transaction Date : " + this.lastTransactionDate);
        System.out.println("Transaction Count     : " + this.transactionCount);
    }
}

// ----------------------------- TRANSACTION CLASS -----------------------------
class Transaction {

    static int tidCounter = 1000;

    String transactionId;
    int accountNumber;
    double amount;
    String type;
    LocalDateTime date;

    public Transaction(int accno, double amount, String type) {
        this.transactionId = "TXN-" + (++tidCounter);
        this.accountNumber = accno;
        this.amount = amount;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    void display() {
        System.out.println("Transaction ID    : " + this.transactionId);
        System.out.println("Account Number    : " + this.accountNumber);
        System.out.println("Amount            : " + this.amount);
        System.out.println("Transaction Type  : " + this.type);
        System.out.println("Transaction Date  : " + this.date);
    }
}

// ----------------------------- INTEREST INTERFACE -----------------------------
interface Interest {
    double calculateInterest();
}

// ----------------------------- SAVING ACCOUNT -----------------------------
class SavingAccount extends Account implements Interest {

    double minBalance;
    double interestRate;

    public SavingAccount() {
        super();
        this.minBalance = 5000;
        this.interestRate = 5.8;
    }

    SavingAccount(int accno,String acHolderName, double balance, double minBalance, double interestRate) {
        super(accno, acHolderName, balance);
        this.minBalance = minBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (balance - amount < minBalance) {
            System.out.println("Withdrawal failed! Maintain minimum balance: ₹" + minBalance);
            return;
        }

        this.balance -= amount;
        addTransaction(amount, "WITHDRAW");

        System.out.println("₹" + amount + " withdrawn successfully.");
        System.out.println("Updated Balance: " + balance);
    }

    @Override
    public double calculateInterest() {
        return this.balance * (interestRate / 100);
    }

    public void display() {
        super.display();
        System.out.println("Minimum Balance : " + minBalance);
        System.out.println("Interest Rate   : " + interestRate);
        System.out.println("----------------------------------");
    }
}

// ----------------------------- SALARY ACCOUNT -----------------------------
class SalaryAccount extends Account {

    String employerName;
    boolean isFrozen;

    public SalaryAccount() {
        super();
        this.employerName = "Fistbit solution";
    }

    public SalaryAccount(int accno, String acHolderName, double balance, String employerName) {
        super(accno, acHolderName, balance);
        this.employerName = employerName;
        this.isFrozen = false;
    }

    @Override
    public void withdraw(double amount) {

        if (isFrozen) {
            System.out.println("Withdrawal Failed! Account is frozen due to inactivity.");
            return;
        }

        LocalDate today = LocalDate.now();
        LocalDate limitDate = lastTransactionDate.plusMonths(2);

        if (today.isAfter(limitDate)) {
            isFrozen = true;
            System.out.println("Account Frozen! No transactions in last 2 months.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (balance - amount < 0) {
            System.out.println("Insufficient Balance! Cannot withdraw.");
            return;
        }

        balance -= amount;
        addTransaction(amount, "WITHDRAW");

        lastTransactionDate = LocalDate.now();

        System.out.println("₹" + amount + " withdrawn successfully.");
        System.out.println("Updated Balance: ₹" + balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employer Name         : " + this.employerName);
        System.out.println("Account Frozen Status : " + (this.isFrozen ? "Frozen" : "Active"));
        System.out.println("----------------------------------");
    }
}


// ----------------------------- CURRENT ACCOUNT -----------------------------
class CurrentAccount extends Account {

    double overDraftLimit;

    public CurrentAccount() {
        super();
        this.overDraftLimit = 5000;
    }

    public CurrentAccount(int accno,String acHolderName, double balance, double overDraftLimit) {
        super(accno, acHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
            return;
        }

        double availableBal = balance + overDraftLimit;

        if (amount > availableBal) {
            System.out.println("Overdraft limit exceeded!");
            return;
        }

        this.balance -= amount;
        addTransaction(amount, "WITHDRAW");
        this.lastTransactionDate = LocalDate.now();

        System.out.println("₹" + amount + " withdrawn successfully.");
        System.out.println("Updated Balance: " + balance);
    }

    public double calculateInterest() {
        return 0;
    }

    public void display() {
        super.display();
        System.out.println("OverDraft Limit : " + this.overDraftLimit);
        System.out.println("----------------------------------");
    }
}

// ----------------------------- LOAN ACCOUNT -----------------------------
class LoanAccount extends Account implements Interest {

    double emi;
    double loanAmount;      // Original loan amount
    double interestRate;

    // Constructor
    public LoanAccount(int accno, String acHolderName, double loanAmount, double emi, double interestRate) {
        super(accno, acHolderName, -loanAmount); // Negative balance
        this.loanAmount = loanAmount;
        this.emi = emi;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw NOT allowed for Loan Account.");
    }

    @Override
    public double calculateInterest() {
        // Interest on remaining loan (negative balance)
        return -balance * (interestRate / 100) / 12;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        balance += amount; // reduces negative balance
        addTransaction(amount, "Loan Repayment");

        lastTransactionDate = LocalDate.now();
        System.out.println("Repayment of ₹" + amount + " successful. Remaining Loan: ₹" + (-balance));
    }
	public void payEmi(double amount) {

		if (amount < 0) {
			System.out.println("Invalid Amount.....");
			return;
		}

		// monthly interest
		double monthlyInterest = (loanAmount * (interestRate / 100)) / 12;

		if (amount < monthlyInterest) {
			System.out.println("EMI is too low. It cannot even cover monthly interest.");
			return;
		}

		// 3. Calculate principal part
		double principalPaid = amount - monthlyInterest;

		// update LoanAmount

		balance -= principalPaid;

		// Add transaction
		addTransaction(amount, "Emi Installment Paid");

		// update Last Transaction date
		this.lastTransactionDate = LocalDate.now();

		System.out.println("EMI Payment Successful.");

	}// PayEmi method ends here

    @Override
    public void display() {
        System.out.println("----- Loan Account Details -----");
        System.out.println("Account Number       : " + accno);
        System.out.println("Account Holder Name  : " + acHolderName);
        System.out.println("Original Loan Amount : ₹" + loanAmount);
        System.out.println("Outstanding Amount   : ₹" + (-balance));
        System.out.println("Interest Rate        : " + interestRate + "%");
        System.out.println("Monthly EMI          : ₹" + emi);
        System.out.println("----------------------------------");
    }
}


// ----------------------------- BANK MODEL -----------------------------
class BankModel {

    private Account[] accounts = new Account[200]; // max 200 accounts
    private int count = 0; // number of accounts added

    // Add a new account
    public void addAccount(Account acc) {
        if (count >= accounts.length) {
            System.out.println("Cannot add more accounts. Limit reached.");
            return;
        }
        accounts[count] = acc;
        count++;
    }

    // Get account by account number
    public Account getAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accno == accNo) {
                return accounts[i];
            }
        }
        return null; // not found
    }

    // Get all accounts
    public Account[] getAllAccounts() {
        Account[] result = new Account[count];
        for (int i = 0; i < count; i++) {
            result[i] = accounts[i];
        }
        return result;
    }
}


//----------------------------- BANK CONTROLLER -----------------------------
 class BankController {

 private BankModel model;

 public BankController(BankModel model) {
     this.model = model;
 }

 // --------- CREATE ACCOUNTS ---------

 public void createSavingAccount(int no, String name, double bal) {
     SavingAccount s = new SavingAccount(no, name, bal, 5000, 5.8); // Pass account number
     model.addAccount(s);
     System.out.println("Saving Account Created Successfully!");
 }

 public void createSalaryAccount(int no, String name, double bal, LocalDate lastDate) {
     SalaryAccount s = new SalaryAccount(no, name, bal, "Company"); // Pass account number
     s.lastTransactionDate = lastDate;
     model.addAccount(s);
     System.out.println("Salary Account Created Successfully!");
 }

 public void createCurrentAccount(int no, String name, double bal) {
     CurrentAccount c = new CurrentAccount(no, name, bal, 10000); // Pass account number
     model.addAccount(c);
     System.out.println("Current Account Created Successfully!");
 }

 public void createLoanAccount(int no, String name, double loanAmount, double emi, double interestRate) {
	    LoanAccount loan = new LoanAccount(no, name, loanAmount, emi, interestRate);
	    model.addAccount(loan);
	    System.out.println("Loan Account Created Successfully!");
	}


 // --------- DEPOSIT ---------
 public void deposit(int no, double amt) {
     Account acc = model.getAccount(no);
     if (acc == null) {
         System.out.println("Account Not Found!");
         return;
     }
     acc.deposit(amt);
 }

 // --------- WITHDRAW ---------
 public void withdraw(int no, double amt) {
     Account acc = model.getAccount(no);
     if (acc == null) {
         System.out.println("Account Not Found!");
         return;
     }
     acc.withdraw(amt);
 }

 // --------- PAY LOAN EMI ---------
 public void payLoanEMI(int no) {
     Account acc = model.getAccount(no);
     if (acc instanceof LoanAccount loan) {
    	    loan.payEmi(loan.emi);
    	}
 else {
         System.out.println("Not a Loan Account!");
     }
 }

 // --------- SHOW ACCOUNT STATEMENT ---------
 public void showStatement(int no) {
     Account acc = model.getAccount(no);
     if (acc == null) {
         System.out.println("Account Not Found!");
         return;
     }

     acc.display();
     System.out.println("\n--- Transactions ---");
     for (Transaction t : acc.getTransactions()) {
         if (t == null) break;
         t.display();
         System.out.println("----------------------");
     }
 }

 // --------- END OF DAY REPORT ---------
 public void generateEODReport() {
     System.out.println("\n===== END OF DAY REPORT =====");
     for (Account acc : model.getAllAccounts()) {
         acc.display();
         System.out.println("-----------------------------");
     }
 }

 // --------- APPLY INTEREST ---------
 public void applyInterest(int no) {
     Account acc = model.getAccount(no);

     if (acc instanceof SavingAccount s) {
         double interest = s.calculateInterest();
         s.deposit(interest);
         System.out.println("Interest Applied: ₹" + interest);
     } else if (acc instanceof LoanAccount l) {
         double interest = l.calculateInterest();
         System.out.println("Loan Monthly Interest: ₹" + interest);
     } else {
         System.out.println("This account type does not earn interest.");
     }
 }
}

// ----------------------------- BANK APP -----------------------------
 

 class BankApp {

     public static void main(String[] args) {

         BankModel model = new BankModel();
         BankController controller = new BankController(model);

         Scanner sc = new Scanner(System.in);

         while (true) {
             System.out.println("\n====== BANK MENU ======");
             System.out.println("1. Create Saving Account");
             System.out.println("2. Create Salary Account");
             System.out.println("3. Create Current Account");
             System.out.println("4. Create Loan Account");
             System.out.println("5. Deposit");
             System.out.println("6. Withdraw");
             System.out.println("7. Pay Loan EMI");
             System.out.println("8. Show Account Statement");
             System.out.println("9. End Of Day Report");
             System.out.println("10. Apply Interest to an Account");
             System.out.println("11. Exit");
             System.out.print("Enter choice: ");

             int ch = sc.nextInt();
             sc.nextLine(); // consume newline

             switch (ch) {
                 case 1: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine(); // consume newline
                     System.out.print("Holder Name: ");
                     String name = sc.nextLine();
                     System.out.print("Opening Balance: ");
                     double bal = sc.nextDouble();
                     sc.nextLine();
                     controller.createSavingAccount(no, name, bal);
                     break;
                 }
                 case 2: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine();
                     System.out.print("Holder Name: ");
                     String name = sc.nextLine();
                     System.out.print("Opening Balance: ");
                     double bal = sc.nextDouble();
                     sc.nextLine();
                     System.out.print("Last Transaction Date (yyyy-mm-dd) or Enter for today: ");
                     String dateInput = sc.nextLine();
                     LocalDate lastDate = dateInput.isEmpty() ? LocalDate.now() : LocalDate.parse(dateInput);
                     controller.createSalaryAccount(no, name, bal, lastDate);
                     break;
                 }
                 case 3: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine();
                     System.out.print("Holder Name: ");
                     String name = sc.nextLine();
                     System.out.print("Opening Balance: ");
                     double bal = sc.nextDouble();
                     sc.nextLine();
                     controller.createCurrentAccount(no, name, bal);
                     break;
                 }
                 case 4: {
                	    System.out.print("Account No: ");
                	    int no = sc.nextInt();
                	    sc.nextLine(); // consume newline
                	    System.out.print("Holder Name: ");
                	    String name = sc.nextLine();
                	    System.out.print("Loan Amount: ");
                	    double loanAmount = sc.nextDouble();
                	    System.out.print("EMI Amount: ");
                	    double emi = sc.nextDouble();
                	    System.out.print("Interest Rate (in %): ");
                	    double interestRate = sc.nextDouble();
                	    sc.nextLine(); // consume newline
                	    controller.createLoanAccount(no, name, loanAmount, emi, interestRate);
                	    break;
                	}
                 case 5: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     System.out.print("Deposit Amount: ");
                     double amt = sc.nextDouble();
                     sc.nextLine();
                     controller.deposit(no, amt);
                     break;
                 }
                 case 6: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     System.out.print("Withdraw Amount: ");
                     double amt = sc.nextDouble();
                     sc.nextLine();
                     controller.withdraw(no, amt);
                     break;
                 }
                 case 7: {
                     System.out.print("Loan Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine();
                     controller.payLoanEMI(no);
                     break;
                 }
                 case 8: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine();
                     controller.showStatement(no);
                     break;
                 }
                 case 9:
                     controller.generateEODReport();
                     break;
                 case 10: {
                     System.out.print("Account No: ");
                     int no = sc.nextInt();
                     sc.nextLine();
                     controller.applyInterest(no);
                     break;
                 }
                 case 11:
                     System.out.println("Exiting...");
                     sc.close();
                     return;
                 default:
                     System.out.println("Invalid choice!");
             }
         }
     }
 }
