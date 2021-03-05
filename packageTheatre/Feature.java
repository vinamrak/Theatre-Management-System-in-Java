    package packageTheatre;

    class Feature extends Movie {
        private String type;

        Feature(int movieId, String name, String language, String director, double duration, String type) {
            super(movieId, name, language, director, duration);
            this.type = type;
        }
    }