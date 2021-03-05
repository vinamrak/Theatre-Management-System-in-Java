package packageTheatre;

import java.util.*;

class TheatreManagementTester {
    public static void main(String[] args) {

        TheatreManagementSystem obj = new TheatreManagementSystem();

        System.out.println();

        // Demonstrating function 1: -

        System.out.println("Let us test the first method (addTheatrewithScreen) in TheatreManagementSystem :");
        System.out.println();

        // Creating screen 1
        Movie m1 = new Movie(1, "Jab tak hai jaan", "Hindi", "Anurag Kashyap", 120.00);
        Date d1 = new Date();
        Screen s1 = new Screen(1, "Screen 1", 10, 10, d1, 5, m1);

        // Creating screen 2
        Movie m2 = new Movie(2, "Krishh", "Hindi", "Anirudh Basu", 90.00);
        Date d2 = new Date();
        Screen s2 = new Screen(2, "Screen 2", 20, 20, d2, 3, m2);

        // Creating screen 3
        Movie m3 = new Movie(3, "Student of the year", "Hindi", "Karan Johar", 150.00);
        Date d3 = new Date();
        Screen s3 = new Screen(3, "Screen 3", 30, 30, d3, 4, m3);

        // Creating screen 4
        Movie m4 = null;
        Date d4 = null;
        Screen s4 = new Screen(4, "Screen 4", 40, 40, d4, 0, m4);

        List<Screen> screenList = new ArrayList<Screen>();

        screenList.add(s1);
        screenList.add(s2);
        screenList.add(s3);
        screenList.add(s4);

        boolean func1 = obj.addTheatrewithScreen(1, "Inox Theatre", "M.G. Road", 4, screenList);

        if (func1) {
            System.out.println("The new theatre with " + screenList.size()
                    + " screens has been successfully added to the system.");
            System.out.println();
        }

        else {
            System.out.println(
                    "Theatre could not be added because the screenList size and number of screens are different.");
            System.out.println();
        }

        // Demonstrating function 2: -

        System.out.println("Let us test the second method (addMovieToTheatre) in TheatreManagementSystem :");
        System.out.println();

        Movie new_movie_1 = new Movie(4, "Raaz", "Hindi", "Salim Dubey", 120.00);

        Movie new_movie_2 = new Movie(5, "Taare Zamin Par", "Hindi", "Irfaan Khan", 120.00);

        obj.addMovieToTheatre(1, new_movie_1);

        obj.addMovieToTheatre(1, new_movie_2);

        // Demonstrating function 3: -

        System.out.println("Let us test the third method (dropMovieFromTheatre) in TheatreManagementSystem :");
        System.out.println();

        Movie new_movie_3 = new Movie(6, "3 Idiots", "Hindi", "Amir Khan", 150.00);

        obj.dropMovieFromTheatre(1, m1);

        obj.dropMovieFromTheatre(1, new_movie_3);

    }
}
