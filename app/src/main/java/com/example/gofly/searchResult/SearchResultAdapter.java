package com.example.gofly.searchResult;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gofly.BuyTicketActivity;
import com.example.gofly.R;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.SearchResultViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class SearchResultViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView takeOffTime;
        public TextView landTime;
        public TextView classType;
        public TextView price;
        public TextView flight;
        public SearchResultViewHolder(View v) {
            super(v);
            takeOffTime = (TextView) v.findViewById(R.id.takeOffTimeText);
            landTime = (TextView) v.findViewById(R.id.landTimeText);
            classType = (TextView) v.findViewById(R.id.classText);
            price = (TextView) v.findViewById(R.id.priceText);
            flight = (TextView) v.findViewById(R.id.flightNumberText);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public SearchResultAdapter() {
//        mDataset = myDataset;
        mDataset = new String[5];
    }

    // Create new views (invoked by the layout manager)
    @Override
    public SearchResultAdapter.SearchResultViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_result_item, parent, false);
        SearchResultViewHolder holder = new SearchResultViewHolder(view);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BuyTicketActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        return holder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(SearchResultViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.takeOffTime.setText("08:30");
        holder.landTime.setText("12:45");
        holder.classType.setText("经济舱");
        holder.price.setText("￥1800.00");
        holder.flight.setText("MU 5689");
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
