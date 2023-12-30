// class A implements Runnable {
//     // In thread a run method is there and we have to override it.
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("A->" + i);
//             // Wait
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class B implements Runnable {
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

        // Method 1
        // Runnable a = new A();

        // Method 2
        // Runnable a = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 100; i++) {
        //             System.out.println("A->" + i);
        //             // Wait
        //             try {
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        // Method 3
        Runnable a = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A->" + i);
                // Wait
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }
}
