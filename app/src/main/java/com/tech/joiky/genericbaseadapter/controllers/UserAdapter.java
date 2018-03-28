package com.tech.joiky.genericbaseadapter.controllers;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.tech.joiky.genericbaseadapter.R;
import com.tech.joiky.genericbaseadapter.controllers.holders.UserHolder;
import com.tech.joiky.genericbaseadapter.databinding.UserInfoBinding;
import com.tech.joiky.genericbaseadapter.models.User;
import com.tech.joiky.genericbaseadapter.utils.BaseAdapter;

/**
 * Created by joek
 * In Teravision Technologies
 */

public class UserAdapter extends BaseAdapter
        <User,
        BaseAdapter.OnRecyclerObjectClickListener<User>,
        UserHolder> {

    Context context;

    /**
     * Base constructor.
     * Allocate adapter-related objects here if needed.
     *
     * @param context Context needed to retrieve LayoutInflater
     */
    public UserAdapter(Context context) {
        super(context);
        this.context = context;
    }

    /**
     * To be implemented in as specific adapter
     *
     * @param parent   The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param viewType The view type of the new View.
     * @return A new ViewHolder that holds a View of the given view type.
     */
    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        UserInfoBinding binding = DataBindingUtil.inflate(inflater, R.layout.user_info, parent, false);
        return new UserHolder(binding);
    }
}
