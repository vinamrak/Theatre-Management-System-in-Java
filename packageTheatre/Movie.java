package packageTheatre;

class Movie {
    private int movieId;
    private String name;
    private String language;
    private String director;
    private double duration;

    public String getName() {
        return this.name;
    }

    Movie(int movieId, String name, String language, String director, double duration) {
        this.movieId = movieId;
        this.name = name;
        this.language = language;
        this.director = director;
        this.duration = duration;
    }
}