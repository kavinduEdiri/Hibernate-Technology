import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")



public class customer {


    public class Customer {
        private long customerId;
        private customerName.CustomerName name;
        private String address;

        public Customer(long customerId) {
            this.setCustomerId(customerId);
        }

        private double salary;

        public long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(long customerId) {
            this.customerId = customerId;
        }

        public customerName.CustomerName getName() {
            return name;
        }

        public void setName(customerName.CustomerName name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

}
