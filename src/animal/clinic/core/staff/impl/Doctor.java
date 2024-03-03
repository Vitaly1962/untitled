package animal.clinic.core.staff;


import java.util.List

public class Doctor {
    private final list<String> diagnosis = List.of("чумка", "лишай", "перелом");
    public String name;

//    public Doctor(String name) {
//        this.name = name;
//    }

    public void dodiagnose(){
        int random = (int) (1 * Math.random()) * 3;

       System.out.println("Диагноз: = + diagnosis.get(random)")


















    }
}
