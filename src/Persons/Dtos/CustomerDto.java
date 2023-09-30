package Persons.Dtos;

import java.util.Date;


/**
 *
 * @author David Duarte Garcia
 */
public class CustomerDto extends PersonDto {
  private Date   dateOfBirth; 
  private String phone; 
  private String email; 
  private String adress; 


    public CustomerDto(Date dateOfBirth, String phone, String email, String adress, String id, String name) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }


    public Date getDateOfthBith() {
        return dateOfBirth;
    }    
}
