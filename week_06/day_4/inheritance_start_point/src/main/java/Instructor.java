public class Instructor extends Person {

    private String name;
    private String cohort;
    private String moduleTeam;

    public Instructor(String name, String cohort, String moduleTeam) {
        super(name, cohort);
        this.moduleTeam = moduleTeam;
//        this.name = name;
//        this.cohort = cohort;
    }

    public String getModuleTeam() {
        return moduleTeam;
    }

    public void setModuleTeam(String moduleTeam) {
        this.moduleTeam = moduleTeam;
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
