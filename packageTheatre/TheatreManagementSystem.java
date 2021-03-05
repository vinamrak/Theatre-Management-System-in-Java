package packageTheatre;

import java.util.*;

class TheatreManagementSystem {

    private List<Theatre> theatres;

    boolean addTheatrewithScreen(int theatreId, String name, String address, int noOfScreen, List<Screen> screenList) {
        if (noOfScreen == screenList.size()) {
            Theatre t = new Theatre(theatreId, name, address, noOfScreen, screenList);
            this.theatres.add(t);
            return true;
        } else
            return false;
    }

    boolean addMovieToTheatre(int theatreId, Movie m) {
        Theatre th = null;

        for (int i = 0; i < this.theatres.size(); i++) {
            if (this.theatres.get(i).getTheatreId() == theatreId) {
                th = this.theatres.get(i);
                break;
            }
        }

        List<Screen> screens = th.getScreenList();

        int flag = 0;

        Screen screen = null;

        for (int j = 0; j < screens.size(); j++) {
            Screen temp = screens.get(j);
            if (temp.getReleaseDate() == null) {
                flag = 1;
                screen = temp;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("There is no screen available to relase the movie - " + m.getName());
            System.out.println();
            return false;
        }

        else {
            screen.setMovie(m);
            Date dt = new Date();
            screen.setReleaseDate(dt);
            System.out.println("The movie - " + screen.getMovieName()
                    + " has been added and will be realising in theatre with theatre ID- " + theatreId + " on - "
                    + screen.getScreenName() + " on date - " + dt);
            System.out.println();

            return true;
        }
    }

    boolean dropMovieFromTheatre(int theatreId, Movie m) {
        Theatre th = null;

        for (int i = 0; i < this.theatres.size(); i++) {
            if (this.theatres.get(i).getTheatreId() == theatreId) {
                th = this.theatres.get(i);
                break;
            }
        }

        List<Screen> screens = th.getScreenList();

        int flag = 0;

        String screen_name = "";

        for (int j = 0; j < screens.size(); j++) {
            Screen temp = screens.get(j);
            if (temp.getMovie() == m) {
                screen_name = temp.getScreenName();
                flag = 1;
                temp.setMovieNull();
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Unable to locate the movie - " + m.getName());
            System.out.println();
            return false;
        }

        else {
            System.out.println("The movie - " + m.getName() + "was dropped from the theatre with theatre ID - "
                    + theatreId + " which was going to be released on -" + screen_name);
            System.out.println();
            return false;
        }
    }

    TheatreManagementSystem() {
        this.theatres = new ArrayList<Theatre>();
    }
}
