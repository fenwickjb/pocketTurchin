package com.bignerdranch.android.pocketturchin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class ArtFragment extends Fragment
{
    private Art mArt;
    private EditText mTitleField;
    private CheckBox mFavorited;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mArt = new Art();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_art, container, false);
        mFavorited = (CheckBox) v.findViewById(R.id.checkbox1);
        mFavorited.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                mArt.setFavorite(isChecked);
            }
        });
        return v;
    }
}
