enum Laptop {
    DELL(2), HP(2), LENOVO(2), APPLE(2), ASUS(2);

    private int ram;
    Laptop(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }
}

class Hello {
    public static void main(String[] arguments) {

        Laptop laptop = Laptop.DELL;
        System.out.println(laptop.getRam());

        for(Laptop l: Laptop.values()) {
            System.out.println(l + " " + l.getRam());
        }
    }
}
