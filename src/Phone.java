import java.io.Serializable;

public class Phone implements Serializable {
    private String number;
    private String model;
    private float weight;

    public Phone() {
        // Default constructor
    }

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing\nNumber is " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        for (String number : phoneNumbers) {
            System.out.println("Sending message to: " + number);
        }
    }
}
