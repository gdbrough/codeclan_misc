public abstract class Computer  {

    public String runApplication(String appName){
        return appName + " Status: ";
    }

    public abstract String closeApplication(String appName);

}