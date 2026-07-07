public class App {
    private String developerName;

    public App(String developerName) {
        this.developerName = developerName;
    }

    public void sayHello() {
        System.out.println("Hello World from java, Vs code, and Github!");
        System.out.println("Project managed by: " + developerName);
        }

        public static void main(String[] args) {
        App myApp = new App("YourGithubUsername");
        myApp.sayHello();
    }
    }