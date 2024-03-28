package observer;

public class Master implements Observer{

    private String name;
    private int salary;

    private String professionInterest;

    public Master(String name, String professionInterest){
        this.name = name;
        salary = 80000;
        this.professionInterest = professionInterest;
    }

    @Override
    public String getProfessionInterest() {
        return professionInterest;
    }


    @Override
    public void receiveOffer(String nameCompany, String profession, int salary) {
        if (this.salary <= salary & professionInterest.equals(profession)) {
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }


}
