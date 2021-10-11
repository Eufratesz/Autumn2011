package intromethods;

import java.time.LocalDate;

public class Oktato {

    private int yearOfBirth;

    public Oktato(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge(int year){
        int age = year - yearOfBirth;
        return age;
    }

    public int getActualAge(){
        int thisYear = LocalDate.now().getYear();
        return getAge(thisYear);
    }

    public static void main(String[] args) {
        Oktato oktato = new Oktato(1974);
        System.out.println(oktato.getActualAge());
        System.out.println(oktato.getAge(2019));
    }

}
