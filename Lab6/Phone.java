public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " з номеру " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Відправка повідомлення на номери:");
        for (String n : numbers) {
            System.out.println("- " + n);
        }
    }
}