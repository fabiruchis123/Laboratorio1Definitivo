
package Accounts.Daos;

import Accounts.Dtos.AccountDto;
import Cruds.Crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AccountDaoList implements Crud<AccountDto>{
    private static AccountDaoList instance;
    private HashMap<String, AccountDto> AccountList;

    private AccountDaoList(){
        AccountList= new HashMap<>();
    }
    public static AccountDaoList getInstance(){
        if (instance==null){
            instance=new AccountDaoList();
        }
        return instance;
    }
    
    @Override
    public boolean create(AccountDto account) {
        if (account == null){
            return false;
        }
        AccountList.put(account.getNumber(), account);
        return true;
        
    }

    @Override
    public AccountDto read(String id) {
        return AccountList.get(id);
    }

    @Override
    public List<AccountDto> readAll() {
        return new ArrayList<AccountDto>(AccountList.values());
    }

    @Override
    public boolean update(AccountDto account) {
        return this.create(account);
    }

    @Override
    public boolean delete(AccountDto account) {
        return AccountList.remove(account.getNumber()) != null;
    }
    
}
