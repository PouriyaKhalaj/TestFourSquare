package ir.pooriettaw.testfoursquare.staff;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import ir.pooriettaw.testfoursquare.R;
import ir.pooriettaw.testfoursquare.widget.CustomTextView;


public class StaffRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static int TYPE_ITEM = 2;
    private Context mContext;

    private ArrayList<Object> items = new ArrayList<>();

    public StaffRecyclerAdapter(Context context, ArrayList<Object> items) {
        this.mContext = context;
        this.items = items;
    }

    public void addItems(ArrayList<Object> items) {
        this.items = new ArrayList<>(items);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_place, parent, false);
            return new RowViewHolder(layoutView);
        }
        throw new RuntimeException("No match for " + viewType + ".");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RowViewHolder)
            configItemViewHolder((RowViewHolder) holder, position);
    }


    private void configItemViewHolder(RowViewHolder holder, int position) {
        final Object item = (Object) items.get(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return TYPE_ITEM;
    }

    public class RowViewHolder extends RecyclerView.ViewHolder {
        public CustomTextView tvTitle;
        public CustomTextView tvFar;
        public ImageView ivPlace;

        public RowViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.row_place_name);
            tvFar = itemView.findViewById(R.id.row_place_far);
            ivPlace = itemView.findViewById(R.id.row_place_iv);
        }
    }

}
