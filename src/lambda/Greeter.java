package lambda;


public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();


        Greeting lambdaGreeting = () -> System.out.println("Hello world");


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world");
            }
        };

        helloWorldGreeting.perform();
        lambdaGreeting.perform();
        innerClassGreeting.perform();
        greeter.greet(helloWorldGreeting);


        MyAdd addFunction = (a,b) -> a + b;
        addFunction.add(4,5);
    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int x, int y);
}