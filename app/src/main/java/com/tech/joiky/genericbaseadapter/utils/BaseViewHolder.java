package com.tech.joiky.genericbaseadapter.utils;

import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

/**
 * Created by joek
 * In Teravision Technologies
 */

public abstract class BaseViewHolder<T, L extends BaseAdapter.BaseRecyclerListener>
        extends RecyclerView.ViewHolder{

    public BaseViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
    }

    /**
     * Bind data to the item and set listener if needed.
     *
     * @param item     object, associated with the item.
     * @param listener listener a listener {@link BaseAdapter.BaseRecyclerListener} which has to b set at the item (if not `null`).
     */
    public abstract void onBind(T item, @Nullable L listener);
}
