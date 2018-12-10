package com.bignerdranch.android.pocketturchin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ArtListFragment extends Fragment
{
    private RecyclerView mArtRecyclerView;
    private ArtAdapter mAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_art_list, container, false);
        mArtRecyclerView = (RecyclerView) view
                .findViewById(R.id.art_recycler_view);
        mArtRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI()
    {
        ArtLab artLab = ArtLab.get(getActivity());
        List<Art> art = artLab.getArtList();
        mAdapter = new ArtAdapter(art);
        mArtRecyclerView.setAdapter(mAdapter);
    }


    private class ArtHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView mTitleTextView;
        private TextView mArtistTextView;
        private TextView mGalleryTextView;
        private ImageView mImageImageView;
        private Art mArt;

        private void bind(Art art)
        {
            mArt = art;
            mTitleTextView.setText(mArt.getTitle());
            mArtistTextView.setText(mArt.getArtist());
            mGalleryTextView.setText(mArt.getLocation());
            mImageImageView.setVisibility(View.VISIBLE);
        }

        public ArtHolder(LayoutInflater inflater, ViewGroup parent)
        {
            super(inflater.inflate(R.layout.list_item_art, parent, false));

            mTitleTextView = (TextView) itemView.findViewById(R.id.art_title);
            mArtistTextView = (TextView) itemView.findViewById(R.id.art_artist);
            mGalleryTextView = (TextView) itemView.findViewById(R.id.art_location);
            mImageImageView = (ImageView) itemView.findViewById(R.id.art_image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            Toast.makeText(getActivity(),mArt.getTitle() + " clicked", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    private class ArtAdapter extends RecyclerView.Adapter<ArtHolder>
    {
        private List<Art> mArt;
        public ArtAdapter(List<Art> arts)
        {
            mArt = arts;
        }

        @Override
        public ArtHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new ArtHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(ArtHolder holder, int position)
        {
            Art art = mArt.get(position);
            holder.bind(art);
        }

        @Override
        public int getItemCount()
        {
            return mArt.size();
        }
    }
}
