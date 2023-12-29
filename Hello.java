class Movie {
    String title;
    String genre;
    int rating;

    // Instance method and instance variable

    // static String Theater = "PVR";
    static String Theater;

    static {
        Theater = "PVR";
        // Runs before constructor
    }

    Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // static variable -> The value of this variable is shared by all instances of
    // the class, and it is not unique to any particular instance. Its a class
    // variable.

    static void TheaterName() {
        // Only static methods can access static variables and static methods, because
        // static methods are not associated with any particular instance of the class.
        System.out.println(Theater);
    }

    void playIt() {
        System.out.println("Playing the movie");
    }
}

class Hello {
    public static void main(String[] arguments) {
        // Movie one = new Movie();
        // one.title = "Gone with the Stock";
        // one.genre = "Tragic";
        // one.rating = -2;

        // Movie two = new Movie();
        // two.title = "Lost in Cubicle Space";
        // two.genre = "Comedy";
        // two.rating = 5;
        // two.playIt();

        // Movie three = new Movie();
        // three.title = "Byte Club";
        // three.genre = "Tragic but ultimately uplifting";
        // three.rating = 127;

        Movie one = new Movie("Gone with the Stock", "Tragic", -2);
        Movie two = new Movie("Lost in Cubicle Space", "Comedy", 5);
        Movie three = new Movie("Byte Club", "Tragic but ultimately uplifting", 127);

        System.out.println("Movie 1");
        System.out.println(one.title);
        System.out.println(one.genre);
        System.out.println(one.rating);
        System.out.println("Movie 2");
        System.out.println(two.title);
        System.out.println(two.genre);
        System.out.println(two.rating);
        System.out.println("Movie 3");
        System.out.println(three.title);
        System.out.println(three.genre);
        System.out.println(three.rating);

        Movie.TheaterName();
        System.out.println(Movie.Theater);

        // static {} only runs when the class is first loaded, before any objects of
        // that class are created.
        // But if no objects is created, then the static block will not run.
        // Then how to run the static block without creating any object?

        try {

            Class.forName("Movie");
            // This will load the class Movie, and the static block will run.
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}