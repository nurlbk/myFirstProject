package PhonePack;

import java.util.Objects;

public class Phone {
    //конструктор
    public Phone(Long number, String model, double weight) {
        this(number, model);
        this.Weight = weight;
    }

    public Phone(Long number, String model) {
        this.Number = number;
        this.Model = model;
    }

    public Phone() {
        this.Number = -1L;
        this.Model = "Not Found";
        this.Weight = -1;
    }
    Long Number;
    String Model;
    double Weight;


    public void receiveCall(String callerName) {
        String callMessage = "{" + callerName + "}" + " is ringing";
        System.out.println(callMessage);
    }
    public void receiveCall(String callerName, Long callerPhoneNumber) {
        String callMessage = "{" + callerName + "  " + callerPhoneNumber  + "}" + " is ringing";
        System.out.println(callMessage);
    }
    public void sendMessage(Long... phoneNumbers){
        for (int i = 0; i < phoneNumbers.length; i++){
            System.out.println(phoneNumbers[i]);
        }
    }


//    public void sendMessage(Long[] phoneNumbers){
//        for (int i = 0; i < phoneNumbers.length; i++){
//            System.out.println(phoneNumbers[i]);
//        }
//    }



    @Override
    public String toString() {
        return "Phone{" +
                "Number=" + Number +
                ", Model='" + Model + '\'' +
                ", weight=" + Weight +
                '}';
    }


    public Long getNumber() {
        return Number;
    }
    public void setNumber(Long number) {
        Number = number;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public double getWeight() {
        return Weight;
    }
    public void setWeight(double weight) {
        this.Weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(Weight, phone.Weight) == 0 && Objects.equals(Number, phone.Number) && Objects.equals(Model, phone.Model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number, Model, Weight);
    }
}
