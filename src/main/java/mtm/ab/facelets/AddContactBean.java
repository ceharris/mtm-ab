package mtm.ab.facelets;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class AddContactBean implements Serializable {

  private static final long serialVersionUID = 3058588359300766719L;

  private String firstName = "Carl";
  private String phone = "14319";

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String save() {
    System.out.println("saved contact");
    return null;
  }
}
