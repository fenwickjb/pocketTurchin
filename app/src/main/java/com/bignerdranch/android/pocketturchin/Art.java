package com.bignerdranch.android.pocketturchin;

import java.util.UUID;

public class Art
{
    private UUID artID;
    private String title;
    private String location;
    private String dates;
    private String description;

    public Art()
    {
        artID = UUID.randomUUID();
    }

    public UUID getArtID()
    {
        return artID;
    }

    public void setArtID(UUID artID)
    {
        this.artID = artID;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getDates()
    {
        return dates;
    }

    public void setDates(String dates)
    {
        this.dates = dates;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
