package example.project;

import example.project.GodClassExample.Bank;
import example.project.GodClassExample.BankAccount;
import example.project.GodClassExample.Branch;
import example.project.GodClassExample.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestBank {

    @Test
    public void testBank_org() {
        /*
        Consider this as a "client" code that uses the Bank class.
        The Bank class is a God Class that has too many responsibilities.
        Therefore, we should refactor this class by moving behaviours closer to the data they manipulate.
        At the same time, we must update the client code accordingly. See `testBank_new()` below.
         */

        Bank bank = new Bank();
        Branch branch = new Branch("Branch 1", "9:00", "123456789");
        BankAccount account = new BankAccount("John", "123456789", 1000, 0.1);
        Customer customer = new Customer("John", "111111111");

        bank.setUpBranch(branch);
        assertEquals(1, bank.getBranches().size());

        bank.changeOpeningTime(branch, "10:00");
        assertEquals("10:00", branch.getOpeningTime());

        bank.registerTelephone(branch, "987654321");
        assertEquals("987654321", branch.getTelephone());

        bank.setUpNewAccount(account, customer);
        assertEquals(1, bank.getAccounts().size());
        assertEquals(1, bank.getCustomers().size());

        double balance = bank.obtainBalance(account);
        assertEquals(1000, balance);

        bank.changePayrollProcessingDate("02", "admin");
        assertEquals("02", bank.getPayroll().getStaffCategoryPaySchedule("admin").getPayDay());

        bank.addInterest(account);
        assertEquals(1100, account.getBalance());

        bank.closeAccount(account);
        assertEquals(0, bank.getAccounts().size());
        assertEquals(0, account.getBalance());

        bank.closeBranch(branch);
        assertEquals(0, bank.getBranches().size());
        assertEquals("null", branch.getOpeningTime());
    }

    @Test
    public void testBank_new() {
        fail();
        
        /*
        After the refactoring of `Bank` class, delete the above line and uncomment the lines below.
        The new test case should pass after the refactoring.
        In other words, this test case gives you hints on how to refactor the `Bank` class.
         */

//        Bank bank = new Bank();
//        Branch branch = new Branch("Branch 1", "9:00", "123456789");
//        BankAccount account = new BankAccount("John", "123456789", 1000, 0.1);
//        Customer customer = new Customer("John", "111111111");
//
//        bank.setUpBranch(branch);
//        assertEquals(1, bank.getBranches().size());
//
//        branch.changeOpeningTime("10:00");
//        assertEquals("10:00", branch.getOpeningTime());
//
//        branch.registerTelephone("987654321");
//        assertEquals("987654321", branch.getTelephone());
//
//        bank.setUpNewAccount(account, customer);
//        assertEquals(1, bank.getAccounts().size());
//        assertEquals(1, bank.getCustomers().size());
//
//        double balance = account.obtainBalance();
//        assertEquals(1000, balance);
//
//        bank.changePayrollProcessingDate("02", "admin");
//        assertEquals("02", bank.getPayrollProcessingDate("admin"));
//
//        account.addInterest();
//        assertEquals(1100, account.getBalance());
//
//        bank.closeAccount(account);
//        assertEquals(0, bank.getAccounts().size());
//        assertEquals(0, account.getBalance());
//
//        bank.closeBranch(branch);
//        assertEquals(0, bank.getBranches().size());
//        assertEquals("null", branch.getOpeningTime());
    }


}
