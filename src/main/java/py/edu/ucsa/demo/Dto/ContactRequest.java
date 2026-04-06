package py.edu.ucsa.demo.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ContactRequest {
    @NotBlank(message = "Name cannot be empty")
    private String name;
    @Email(message = "The email is not valid")
    @NotBlank(message = "Email cannot be  empty")
    private String email;
    @Size(min = 5, max = 15, message = "Th min is 1, the max is 15")
    private String number;


    public ContactRequest(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
