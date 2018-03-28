package com.tech.joiky.genericbaseadapter.controllers.holders;

import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.view.View;

import com.tech.joiky.genericbaseadapter.BR;
import com.tech.joiky.genericbaseadapter.models.User;
import com.tech.joiky.genericbaseadapter.utils.BaseAdapter;
import com.tech.joiky.genericbaseadapter.utils.BaseViewHolder;

/**
 * Created by joek
 */

public class UserHolder extends BaseViewHolder<User,
        BaseAdapter.OnRecyclerObjectClickListener<User>> {
    ViewDataBinding binding;
    public UserHolder(ViewDataBinding binding) {
        super(binding);
        this.binding = binding;
    }

    @Override
    public void onBind(final User item, @Nullable final BaseAdapter.OnRecyclerObjectClickListener<User> listener) {
        binding.setVariable(BR.user, item);
        binding.executePendingBindings();
        if (listener != null) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClicked(item);
                }
            });
        }
    }
}
