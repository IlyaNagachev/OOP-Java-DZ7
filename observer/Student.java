package observer;

public class Student implements Observer{

    private String name;
    private int salary;

    private String professionInterest;

    public Student(String name, String professionInterest){
        this.name = name;
        salary = 5000;
        this.professionInterest = professionInterest;
    }

    @Override
    public String getProfessionInterest() {
        return professionInterest;
    }

    @Override
    public void receiveOffer(String nameCompany, String profession, int salary) {
        if (this.salary <= salary & professionInterest.equals(profession)){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
