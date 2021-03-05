package packageTheatre;

import java.util.*;

class Theatre {
    private int theatreId;
    private String name;
    private String address;
    private int noOfScreen;
    private List<Screen> screenList;

    public int getTheatreId() {
        return this.theatreId;
    }

    public List<Screen> getScreenList() {
        return this.screenList;
    }

    public String getTheatreName() {
        return this.name;
    }

    Theatre(int theatreId, String name, String address, int noOfScreen, List<Screen> screenList) {
        this.theatreId = theatreId;
        this.name = name;
        this.address = address;
        this.noOfScreen = noOfScreen;
        this.screenList = screenList;
    }

}
