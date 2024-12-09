class Base {
    int x = 10;

    public void show() {
        System.out.println("Value of x in Base class: " + x);
    }
}

class Sub extends Base {
    int x = 20;

    public void show() {
        System.out.println("Value of x in Sub class: " + this.x);
        System.out.println("Value of x in Base class using super: " + super.x);
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.show();
    }
}
