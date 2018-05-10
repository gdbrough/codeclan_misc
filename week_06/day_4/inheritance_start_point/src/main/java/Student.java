public class Student extends Person {
    private String name;
    private String cohort;

    public Student(String name, String cohort) {
        super(name, cohort);
//        this.name = name;
//        this.cohort = cohort;
    }

    public String talk(String language){
        return "I love learning " + language;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCohort() {
//        return cohort;
//    }
//
//    public void setCohort(String cohort) {
//        this.cohort = cohort;
//    }
//
//    public String talk(String language){
//        return "I love " + language;
//    }
}
