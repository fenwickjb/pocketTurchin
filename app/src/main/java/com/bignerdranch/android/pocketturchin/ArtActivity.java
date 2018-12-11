package com.bignerdranch.android.pocketturchin;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class ArtActivity extends SingleFragmentActivity
{

    public static final String EXTRA_ART_ID =
            "com.bignerdranch.android.pocketturchin.art_id";

    public static Intent newIntent(Context packageContext, UUID artId)
    {
        Intent intent = new Intent(packageContext, ArtActivity.class);
        intent.putExtra(EXTRA_ART_ID, artId);
        return intent;
    }

    @Override
    protected Fragment createFragment()
    {
        return new ArtFragment();
    }
}
