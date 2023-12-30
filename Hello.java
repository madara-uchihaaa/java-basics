class A extends Thread {
    // In thread a run method is there and we have to override it.
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A->" + i);
            // Wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B->" + i);
            // Wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello {
    public static void main(String[] arguments) {
        // Threads in Java

        A a = new A();
        a.start();

        System.out.println(a.getPriority() + "a.priority");

        // You can also set the priority of the thread
        // a.setPriority(10);   // 1-10 , through this you are suggesting the scheduler to give more time to this thread.

        B b = new B();
        b.start();
        System.out.println(b.getPriority() + "b.priority");

        // These things can be run in parallel.
        // Make class a thread by extending Thread class
    }
}
