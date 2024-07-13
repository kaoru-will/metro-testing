package account.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import account.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long>{
	
	
	Optional<Accounts> findByCustomerNumber(Long customerNumber);

}
