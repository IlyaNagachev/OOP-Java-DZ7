package observer;

public class Supervisor implements Observer{
    private String name;
    private int salary;

    private String professionInterest;

    public Supervisor(String name, String professionInterest){
        this.name = name;
        salary = 150000;
        this.professionInterest = professionInterest;
    }

    @Override
    public String getProfessionInterest() {
        return professionInterest;
    }

    @Override
    public void receiveOffer(String nameCompany, String profession, int salary) {
        if (this.salary <= salary & professionInterest.equals(profession)){
            System.out.printf("Руководитель %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Руководитель %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
