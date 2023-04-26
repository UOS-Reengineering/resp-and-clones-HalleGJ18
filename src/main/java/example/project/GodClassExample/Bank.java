package example.project.GodClassExample;

import java.util.*;

/**
 * This is a god class example. Assuming there are many more methods in this class.
 * It has too many responsibilities and should be redistributed.
 * TODO: Redistribute responsibilities by moving behaviours closer to the data they manipulate.
 *
 */
public class Bank {

    List<BankAccount> accounts;
    List<Customer> customers;
    List<Branch> branches;
    Payroll payroll;

    public Bank() {
        accounts = new ArrayList<>();
        customers = new ArrayList<>();
        branches = new ArrayList<>();
        Map<String, PaySchedule> staffCategoryPaySchedule = new HashMap<>();
        staffCategoryPaySchedule.put("admin", new PaySchedule("01"));
        payroll = new Payroll(staffCategoryPaySchedule);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    // This method should not be moved to Branch class. Why not? Please think about it.
    public void setUpBranch(Branch branch) {
        branches.add(branch);
    }

    // TODO: move this method to Branch class
    public void changeOpeningTime(Branch branch, String openingTime) {
        branch.setOpeningTime(openingTime);
    }

    // TODO: move this method to Branch class
    public void registerTelephone(Branch branch, String telephone) {
        branch.setTelephone(telephone);
    }

    // This method should not be moved to BankAccount/Customer class. Why not? Please think about it.
    public void setUpNewAccount(BankAccount account, Customer customer) {
        accounts.add(account);
        customers.add(customer);
    }

    // TODO: move this method to BankAccount class
    public double obtainBalance(BankAccount account) {
        return account.getBalance();
    }

    // This method should not be moved to BankAccount class. Why not? Please think about it.
    public void closeAccount(BankAccount account) {
        account.setBalance(0);
        accounts.remove(account);
    }

    // TODO: move this method to BankAccount class
    public void addInterest(BankAccount account) {
        double interest = account.getInterest();
        double value = account.getBalance() * interest;
        account.setBalance(account.getBalance() + value);
    }

    // This method should not be moved to Branch class. Why not? Please think about it.
    public void closeBranch(Branch branch) {
        branch.setOpeningTime("null");
        branches.remove(branch);
    }

    // TODO: remove navigation code
    public void changePayrollProcessingDate(String date, String staffCategory) {
        payroll.getStaffCategoryPaySchedule(staffCategory).payDay = date; // TODO: remove this navigation code
    }

}
