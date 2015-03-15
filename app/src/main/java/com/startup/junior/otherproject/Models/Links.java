package com.startup.junior.otherproject.Models;

/**
 * Created by Junior on 27/11/2014.
 */
public class Links {
    String facebook;
    String twitter;

    public Links(String facebook, String twitter) {
        this.facebook = facebook;
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
