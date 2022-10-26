import javax.persistence.Embeddable;

@Embeddable

public class customerName {

    public class CustomerName {
        String FirstName;

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public CustomerName(String firstName) {
            FirstName = firstName;
        }

        String LastName;
    }

}
