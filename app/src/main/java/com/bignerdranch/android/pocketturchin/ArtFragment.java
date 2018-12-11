package com.bignerdranch.android.pocketturchin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.UUID;

public class ArtFragment extends Fragment
{
    private Art mArt;
    private CheckBox mFavorited;
    private TextView mTitleView;
    private TextView mDescriptionView;
    private TextView mArtistView;
    private TextView mLocationView;
    private TextView mDatesView;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        UUID artId = (UUID) getActivity().getIntent()
                .getSerializableExtra(ArtActivity.EXTRA_ART_ID);
        mArt = ArtLab.get(getActivity()).getArt(artId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_art, container, false);

        mTitleView = v.findViewById(R.id.art_title_page);
        mTitleView.setText(mArt.getTitle());

        mDescriptionView = v.findViewById(R.id.art_description);
        mDescriptionView.setText(mArt.getDescription());

        mArtistView = v.findViewById(R.id.art_artist);
        mArtistView.setText(mArt.getArtist());

        mLocationView = v.findViewById(R.id.art_location);
        mLocationView.setText(mArt.getLocation());

        mDatesView = v.findViewById(R.id.art_dates);
        mDatesView.setText(mArt.getDates());





        mFavorited = (CheckBox) v.findViewById(R.id.checkbox1);
        mFavorited.setChecked(mArt.isFavorite());

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
