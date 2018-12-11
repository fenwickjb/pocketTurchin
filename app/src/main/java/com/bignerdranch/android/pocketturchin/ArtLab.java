package com.bignerdranch.android.pocketturchin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ArtLab
{
    private static ArtLab sArtLab;
    private static List<Art> mArt;

    public static ArtLab get(Context context)
    {
        if (sArtLab == null)
        {
            sArtLab = new ArtLab(context);
        }
        return sArtLab;
    }

    private ArtLab(Context context)
    {
        mArt = new ArrayList<>();

        Art art = new Art();
        art.setArtist("Hannah Cole");
        art.setTitle("Dandelion");
        art.setDates("6/06/2018 - 1/12/2019");
        art.setDescription("Watercolor on cut paper, 10\"x10\", 2016");
        art.setLocation("Mezzanine Gallery");

        //art.setArtImage(new Image("res/mipmap/dandelion/dandelion.jpg"));

        mArt.add(art);

        art = new Art();
        art.setArtist("Dana Fritz");
        art.setTitle("Rain Forest Back Room, Biosphere 2");
        art.setDates("12/07/2018 - 4/27/2019");
        art.setDescription("Archival Pigment Print 10\"x10\", 2007");
        art.setLocation("Gallery B");
        mArt.add(art);


        art = new Art();
        art.setArtist("Kelsey Merrick Wagner");
        art.setTitle("The Elephantine in the Anthropocene\n");
        art.setDates("7/07/2018 - 1/27/2019");
        art.setDescription("Steel metal working 7\'x10\', 2018");
        art.setLocation("Community Gallery");
        mArt.add(art);

        art = new Art();
        art.setArtist("Rachel Stevens");
        art.setTitle("The Broken Fragments of my Heart");
        art.setDates("9/17/2018 - 12/07/18");
        art.setDescription("Steel and Sagger fired porcelain, 2015-16");
        art.setLocation("Mayer Gallery");
        mArt.add(art);

        art = new Art();
        art.setArtist("Leonardo Davinci");
        art.setTitle("Mona Lisa");
        art.setDates("9/17/1800 - 12/07/18");
        art.setDescription("One of the most famous paintings in the world.  1800-1801");
        art.setLocation("Louvre Museum");
        mArt.add(art);

        art = new Art();
        art.setArtist("Michaelangelo");
        art.setTitle("The Creation of Adam");
        art.setDates("9/17/1717 - 12/07/18");
        art.setDescription("The Creation of Adam is the central element in Michelangelo’s large " +
                "scale Sistine Chapel fresco..   21717");
        art.setLocation("Sistine Chapel Fresco");
        mArt.add(art);

        art = new Art();
        art.setArtist("Pablo Picaso");
        art.setTitle("Guernica");
        art.setDates("9/17/1937 - 12/07/18");
        art.setDescription("Guernica, a political protest piece in Picasso’s distinct cubist " +
                "style, was a central attraction at the Paris World Fair in 1937., 1937-1937");
        art.setLocation("Guernica, Spain");
        mArt.add(art);

        art = new Art();
        art.setArtist("Johannes Vermeer");
        art.setTitle("Girl with a Pearl Earing");
        art.setDates("9/17/1717 - 12/07/18");
        art.setDescription(" No name is given and all the audience sees is a girl, who is " +
                "a pearl earring, starring back.");
        art.setLocation("Guernica, Spain");
        mArt.add(art);


    }

    public List<Art> getArtList()
    {
        return mArt;
    }

    public Art getArt(UUID id)
    {
        for (Art art: mArt)
        {
            if (art.getArtID().equals(id))
            {
                return art;
            }
        }
        return null;
    }
}
