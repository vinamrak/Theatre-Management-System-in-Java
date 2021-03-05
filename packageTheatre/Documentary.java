package packageTheatre;

class Documentary extends Movie {
    private String topic;

    public Documentary(int movieId, String name, String language, String director, double duration, String topic) {
        super(movieId, name, language, director, duration);
        this.topic = topic;
    }
}