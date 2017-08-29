package com.example.glen.sotopusers.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.glen.sotopusers.R;
import com.example.glen.sotopusers.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by glen on 8/29/17.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> mUsers;

    private LayoutInflater mLayoutInflater;

    public UserAdapter(Context ctxt, List<User> users) {
        mLayoutInflater = LayoutInflater.from(ctxt);
        mUsers = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.so_user_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        User user = mUsers.get(position);

        holder.user_name.setText(user.getName());
        holder.location.setText(user.getLocation());

        setIntText(holder.reputation, user.getReputation());
        setIntText(holder.bronze, user.getBadges().getBronze());
        setIntText(holder.silver, user.getBadges().getSilver());
        setIntText(holder.gold, user.getBadges().getGold());
    }

    private void setIntText(TextView tv, int value) {
        tv.setText(String.format("%d", value));
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.user_name) TextView user_name;
        @BindView(R.id.reputation) TextView reputation;
        @BindView(R.id.location) TextView location;
        @BindView(R.id.bronze) TextView bronze;
        @BindView(R.id.silver) TextView silver;
        @BindView(R.id.gold) TextView gold;

        public UserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

