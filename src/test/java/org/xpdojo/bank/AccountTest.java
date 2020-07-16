package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void testNewAccountShouldBeZero() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void testDepositAmount() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void testWithdrawAmount() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(40);
        assertThat(account.balance()).isEqualTo(60);
    }

    @Test
    public void testTransferAmount() {
        Account account1 = new Account();
        account1.deposit(100);
        Account account2 = new Account();
        account1.deposit(40);
        assertThat(account1.balance()).isEqualTo(60);
    }

}
