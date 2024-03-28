package observer;

public interface Observer {

    void receiveOffer(String companyName, String profession, int salary);
    String getProfessionInterest();

}
