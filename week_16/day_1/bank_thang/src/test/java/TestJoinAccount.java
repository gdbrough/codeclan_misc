import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestJoinAccount {

    private JoinAccount account;
    private ArrayList<Holder> holders;

    @Before
    public void setUp() throws Exception {
        String sort_code = "80-41-99";
        String account_number = "00863514";

        holders = new ArrayList<Holder>();
        Holder john = new Holder("John McC", "Codeclan Towers");
        Holder colin = new Holder("Colin", "Codeclan Towers");
        holders.add(john);
        holders.add(colin);


        account = new JoinAccount(sort_code, account_number, holders);
    }

    @Test
    public void testHolders() {
        assertEquals(holders, account.getHolders());
    }
}
