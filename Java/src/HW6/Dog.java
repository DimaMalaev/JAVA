package HW6;

class Dog extends Animal {


    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem );
    }
}
