package packageTheatre;

import java.util.Date;

class Screen {
    private int screenId;
    private String name;
    private int width;
    private int height;
    private Date releaseDate;
    private int noOfShows;
    private Movie movie;

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public String getMovieName() {
        return this.movie.getName();
    }

    public String getScreenName() {
        return this.name;
    }

    public void setReleaseDate(Date date) {
        this.releaseDate = date;
    }

    public void setMovieNull() {
        this.movie = null;
        this.releaseDate = null;
    }

    Screen(int screenId, String name, int width, int height, Date releaseDate, int noOfShows, Movie movie) {
        this.screenId = screenId;
        this.name = name;
        this.width = width;
        this.height = height;
        this.releaseDate = releaseDate;
        this.noOfShows = noOfShows;
        this.movie = movie;
    }
}