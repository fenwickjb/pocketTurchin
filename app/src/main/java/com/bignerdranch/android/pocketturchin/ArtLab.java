package com.bignerdranch.android.pocketturchin;

import android.content.Context;
import android.media.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.*;

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
        //Image artImage = ImageIO.read

        //art.setArtImage(new Image("res/mipmap/dandelion/dandelion.jpg"));

        mArt.add(art);

        art = new Art();
        art.setArtist("Dana Fritz");
        art.setTitle("Rain Forest Back Room, Biosphere 2");
        art.setDates("12/07/2018 - 4/27/2019");
        art.setDescription("Archival Pigment Print 10\"x10\", 2007");
        art.setLocation("Gallery B");
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
