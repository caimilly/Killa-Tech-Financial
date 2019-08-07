package Account;

import Customer.Customer;
import Customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    private final Logger logger = LoggerFactory.getLogger(AccountsService.class);
    private AccountsRepository accountRepo;
    private CustomerRepository customerRepo;

    @Autowired
    public AccountsService(AccountsRepository accountRepo,CustomerRepository customerRepo){
        this.accountRepo = accountRepo;
        this.customerRepo = customerRepo;
    }

    public Iterable<Accounts> findAll(){
        logger.info("Getting all accounts");
        Iterable<Accounts> accounts = accountRepo.findAll();
        return accounts;
    }

}
