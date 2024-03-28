package observer;

public interface Publisher {

    void sendOffer(String companyName, String profession, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
