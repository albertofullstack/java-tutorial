package com.javatutorials.lambda;

interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(15, 21);
        System.out.println("Return value is: " + value);
    }

    /*
     * public void run(StringExecutable e) {
     * System.out.println("Executing code block ...");
     * int value = e.execute("Hello");
     * System.out.println("Return value is: " + value);
     * }
     */
}

// () -> System.out.println("Hello there.")

/*
 * () -> {
 * System.out.println("This is code passed in a lambda expression.");
 * System.out.println("Hello there.");
 * }
 */

/*
 * () -> {
 * return 8;
 * }
 */

// () -> 8

// (int a) -> 8 + a

/**
 * (int a) -> {
 * System.out.println("Hello there.");
 * return 8 + a;
 * }
 */

/**
 * (a) -> {
 * System.out.println("Hello there.");
 * return 8 + a;
 * }
 */

/**
 * a -> {
 * System.out.println("Hello there.");
 * return 8 + a;
 * }
 */

/**
 * (a, b) -> {
 * System.out.println("Hello there.");
 * return 8 + a - b;
 * }
 */

public class App {
    public static void main(String[] args) throws Exception {

        int c = 100;
        // Mustn't do this: c = 8

        int d = 77;

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello there.");
                // Can do this in methods of anonymous classes int d = 8;
                return c + a - b + d;
            }
        });

        System.out.println("========================");

        runner.run((a, b) -> {
            System.out.println("Hello there.");

            // Can't do this; no new scope. int d = 99;
            return c + a - b;
        });

        System.out.println("========================");

        Executable ex = (a, b) -> {
            System.out.println("Hello there.");

            // Can't do this; no new scope. int d = 99;
            return c + a - b;
        };
        runner.run(ex);

        Object codeblock = (Executable) (a, b) -> {
            System.out.println("Hello there.");

            // Can't do this; no new scope. int d = 99;
            return c + a - b;
        };

    }
}
