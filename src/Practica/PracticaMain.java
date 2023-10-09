package Practica;

import Accounts.Daos.AccountDaoList;
import Accounts.Dtos.AccountDto;
import Dao.Dao;
import Persons.Customer;
import Persons.Daos.CustomerDaoList;
import Persons.Dtos.CustomerDto;
import java.sql.Date;
import java.util.HashMap;

public class PracticaMain {


    public static void main(String[] args) {
        HashMap<String, AccountDto> AccountList = new HashMap();
        HashMap<String,CustomerDto> CustomerList = new HashMap();
        Dao AccountDao = (Dao) new AccountDaoList(AccountList);
        Dao CustomerDao = (Dao)new CustomerDaoList(CustomerList);
        
    }
        Customer customer1 = new Customer(new Date(1999,9,1),"UNO@gmail.com"," 100 metros del maxi, casa color rosa","4-1002-2991","LuisMiguel");
        Customer customer2 = new Customer(new Date(1989,2,12),"DOS@gmail.com"," 200 metros del supercompro, casa color roja","5-0112-3891","Jean");
        Customer customer3 = new Customer(new Date(1922,5,19),"TRES@gmail.com"," mano derecha del supercompro, casa color verde","3-0133-3791","Maria");
        Customer customer4 = new Customer(new Date(1933,7,30),"CUATRO@gmail.com"," mano izquierda del supercompro, casa color negro","2-2212-3191","Erick");
        Customer customer5 = new Customer(new Date(1944,9,17),"CINCO@gmail.com"," Al frente del supercompro, casa color celeste","3-2222-3811","Fabian");
        Customer customer6 = new Customer(new Date(1955,10,29),"SEIS@gmail.com"," 200 metros del cementerio, casa color azul cielo","3-4112-7891","Juan");
        Customer customer7 = new Customer(new Date(1966,12,1),"SIETE@gmail.com"," 400 metros del pali hacia al norte, casa color fucsia","5-0112-3891","Pablo");
    
        CustomerDao.
        
}
