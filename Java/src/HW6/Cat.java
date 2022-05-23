package HW6;

class Cat extends Animal {

    protected boolean sweem;


//konstruktor Cat

    public Cat(String name, int run, boolean sweem ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /Run: " + run+ " meters/" + " /Sweem:" + sweem );
    }
}
