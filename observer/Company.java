package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private String profession;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.profession = getRandomProfession();
    }

    private String getRandomProfession() {
        //String[] professions = new String[] { "Уборщик", "Разработчик", "Программист", "Электрик", "Руководитель", "Начальник", "Повар", "Тестировщик", "Аналитик", "Рекламщик" };
        String[] professions = new String[] { "Разработчик", "Программист", "Руководитель", "Аналитик", "Уюорщик"};
        return professions[random.nextInt(professions.length)];
    }

    public void needEmployee(){
        profession = getRandomProfession();
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, profession, salary);
    }

}
