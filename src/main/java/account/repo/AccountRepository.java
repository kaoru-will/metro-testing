package account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import account.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long>{
	
	

}
