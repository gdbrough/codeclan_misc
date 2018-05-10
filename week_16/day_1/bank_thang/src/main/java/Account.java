import behaviours.IMonthlyCharge;

import java.util.ArrayList;

public abstract class Account {
    private String sort_code;
    private String account_number;
    private Double balance;
    private ArrayList<IMonthlyCharge> monthlyCharges;

    public Account(String sort_code, String account_number) {
        this.sort_code = sort_code;
        this.account_number = account_number;
        this.balance = 0.0;
        this.monthlyCharges = new ArrayList<>();
    }

    public Object getSortCode() {
        return sort_code;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public double getAvailableFunds(){
        return this.balance + 150.00;
    }

    public void withdraw(double amount) throws Exception {
        if (getAvailableFunds() >= amount) {
            balance -= amount;
        } else {
            throw new Exception("This isn't OK. Just no.");
        }
    }

    public void transfer(PersonalAccount otherAccount, double amount) throws Exception {
        withdraw(amount);
        otherAccount.deposit(amount);
    }

    public void addMonthlyCharge(IMonthlyCharge charge){
        this.monthlyCharges.add(charge);
    }

    public ArrayList<IMonthlyCharge> getMonthlyCharges() {
        return new ArrayList<>(monthlyCharges);
    }

    public double getMonthlyChargeTotal(){
        double runningTotal = 0.00;
        for(IMonthlyCharge charge: monthlyCharges){
            runningTotal += charge.getAmount();
        }
        return runningTotal;
    }

    public void applyChargesAndInterest(){
        applyCharges();
        applyInterestOrFees();
    }

    private void applyCharges() {
        balance -= getMonthlyChargeTotal();
    }

    private void applyInterestOrFees() {
        if (balance > 0) {
            balance += balance * 0.05;
        } else if (balance < -150) {
            balance -= 150;
        }
    }
}
