package account.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import account.entity.BankAccounts;

public interface BankAccountsRepo extends JpaRepository<BankAccounts, Long> {

}
