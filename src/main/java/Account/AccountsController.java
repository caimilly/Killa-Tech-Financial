package Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    private AccountsService accountsService;

    @Autowired
    public AccountsController(AccountsService accountsService){
        this.accountsService = accountsService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<Iterable<Accounts>> getAll(){
        Iterable<Accounts> accounts = accountsService.findAll();
        ResponseEntity<Iterable<Accounts>> responseEntity = new ResponseEntity<>(accounts, HttpStatus.OK);
        return responseEntity;
    }


}
