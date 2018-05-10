public class LaptopComputer extends Computer {

    public String runApplication(String appName){
//        return "Program " + appName + " is running";
        return super.runApplication(appName) + "I am running " + appName;
    }

    public String closeApplication(String appName) {
        return "Program " + appName + " is closing down";
    }

    public String shutDown() {
        return "Shutting down...";
    }

}