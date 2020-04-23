package com.example.gofly.myTrip;

import com.example.gofly.searchResult.SearchResultAdapter;

public class MyTripAdapter extends SearchResultAdapter {
    @Override
    public void onBindViewHolder(SearchResultViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.takeOffTime.setText("08:30\n北京");
        holder.landTime.setText("12:45\n上海");
        holder.classType.setText("经济舱");
        holder.price.setText("");
        holder.flight.setText("MU 5689\t2020年4月1日");
    }

}
