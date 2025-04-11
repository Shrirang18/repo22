class Learner {
    String name;
    int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Learner learner1 = new Learner("John Doe", 30);
        learner1.displayInfo();
    }
}
