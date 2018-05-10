public class DesktopComputer extends Computer{
    public String runApplication(String appName) {
//       return "I am running " + appName;
       return super.runApplication(appName) + "I am running " + appName;
    }

    public String closeApplication(String appName) {
        return "I am closing down " + appName;
    }

    public String shutDown() {
        return "Shutting down...";
    }
}
