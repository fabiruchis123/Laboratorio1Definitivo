package Persons.Dtos;


public class PersonDto {
      private String id ;
      private String name ;

    public PersonDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

  
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
