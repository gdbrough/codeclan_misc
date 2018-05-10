import org.junit.Before;
import org.junit.Test;
import sun.util.locale.provider.HostLocaleProviderAdapter;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPersonalAccount {
    private PersonalAccount account;
    private PersonalAccount account2;
    private Holder john;
    private Holder debbie;

    @Before
    public void setUp() throws Exception {
        String sort_code = "80-41-99";
        String account_number = "00863514";
        john = new Holder("John McC", "Codeclan Towers");
        account = new PersonalAccount(sort_code, account_number, john);

        String d_account_number = "00863515";
        debbie = new Holder("Debbie", "Codeclan Towers");
        account2 = new PersonalAccount(sort_code, d_account_number, debbie);
    }

    @Test
    public void testSortCode() {
        assertEquals("80-41-99", account.getSortCode());
    }

    @Test
    public void testAccountNamuber() {
        assertEquals("00863514", account.getAccountNumber());
    }

    @Test
    public void testBalance() {
        assertEquals(0.0, account.getBalance(), 0.1);
    }

    @Test
    public void testGetHolder() {
        assertEquals(john, account.getHolder());
    }

    @Test
    public void testDeposit__positive() {
        account.deposit(100.00);
        assertEquals(100.0, account.getBalance(), 0.1);
    }

    @Test
    public void testDeposit__negative() {
        account.deposit(-100);
        assertEquals(0.0, account.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawal() {
        account.deposit(100.00);
        try {
            account.withdraw(50.00);
            assertEquals(50.00, account.getBalance(), 0.1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWithdrawal__intoOverdraft() {
        try {
            account.withdraw(150.00);
            assertEquals(-150.00, account.getBalance(), 0.1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWithdrawal__beyondOverdraft() {
        try {
            account.withdraw(200.00);
            fail();
        } catch (Exception e) {
            System.out.println("Something bad just happened!!!");
        }
    }

    @Test
    public void testTransfer() {
        account.deposit(1000.00);
        try {
            account.transfer(account2, 100.00);
            assertEquals(900.00, account.getBalance(), 0.1);
            assertEquals(100.00, account2.getBalance(), 0.1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTransfer__insufficientFunds() {
        try {
            account.transfer(account2, 200.00);
            fail();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testAddStandingOrder() {
        StandingOrder so = new StandingOrder(9.99, "Spotify");
        account.addMonthlyCharge(so);
        assertEquals(1, account.getMonthlyCharges().size());
    }

    @Test
    public void testGetMonthlyTotal() {
        StandingOrder spotifySO = new StandingOrder(9.99, "Spotify");
        StandingOrder amazonSO = new StandingOrder(7.99, "Amazon Prime");
        account.addMonthlyCharge(spotifySO);
        account.addMonthlyCharge(amazonSO);

        assertEquals(17.98, account.getMonthlyChargeTotal(), 0.01);
    }

    @Test
    public void testMonthlyChargesAreApplied() {
        account.deposit(100.00);
        StandingOrder spotifySO = new StandingOrder(9.99, "Spotify");
        StandingOrder amazonSO = new StandingOrder(7.99, "Amazon Prime");
        account.addMonthlyCharge(spotifySO);
        account.addMonthlyCharge(amazonSO);

        account.applyChargesAndInterest();
        assertEquals(86.12, account.getBalance(), 0.01);
    }
}
