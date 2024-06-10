package autoassistPackages;

public abstract class Worker extends Person implements ServiceProvidable {
    private final int id;
    private final String fullName;
    private String email;
    private final String phoneNumber;
    private final String serviceType;
    private final int yearsOfExperience;
    private String password;

    public Worker(int id, String fullName, String email, String phoneNumber, String serviceType, int yearsOfExperience, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.serviceType = serviceType;
        this.yearsOfExperience = yearsOfExperience;
        this.password = password;
    }

    // Getters and Setters (if needed)
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getServiceType() { return serviceType; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public void provideService() {
        System.out.println(fullName + " is providing " + serviceType + " services.");
    }
}

interface ServiceProvidable {
    void provideService();
}

abstract class Person {
    abstract void introduction();
}
 class ConcreteWorker extends Worker {

    public ConcreteWorker(int id, String fullName, String email, String phoneNumber, String serviceType, int yearsOfExperience, String password) {
        super(id, fullName, email, phoneNumber, serviceType, yearsOfExperience, password);
    }

    @Override
    void introduction() {
        System.out.println("Hello, I'm " + getFullName() + ". I specialize in " + getServiceType() + ".");
    }
}
