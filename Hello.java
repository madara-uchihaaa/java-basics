class A {

    int a;
    int b;

    public void print() {
        System.out.println("A");
    }

    public int add(int a, int b) {
        return a + b;
    }

    // By default, it will call toString() method of object but you can override it like this
    public String toString() {
        return "A";
    }

    // Better to override equals() method when you override hashCode() method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (a != other.a)
            return false;
        if (b != other.b)
            return false;
        return true;
    }
    
}

class Hello {
    public static void main(String[] arguments) {
        A a = new A();
        a.a = 1;
        a.b = 2;

        A b = new A();
        b.a = 1;
        b.b = 2;

        System.out.println(a + "->" + a.a + "->" + a.b);
        // When you print object, it will call toString() method

        Boolean c = a == b;
        System.out.println(c);

        Boolean d = a.equals(b);
        System.out.println(d);
    }
}
