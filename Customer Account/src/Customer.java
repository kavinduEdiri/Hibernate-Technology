
@Entity




public class Customer {
    private long customerId;
    private CustomerNmae name;
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

    public CustomerNmae getName() {
        return name;
    }

    public void setName(CustomerNmae name) {
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
