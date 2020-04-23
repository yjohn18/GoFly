package com.example.gofly.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gofly.R;
import com.example.gofly.myTrip.MyTripActivity;
import com.example.gofly.searchResult.SearchResultActivity;

public class NotificationsFragment extends Fragment implements View.OnClickListener {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        Button orderBtn = (Button) root.findViewById(R.id.orderBtn);
        orderBtn.setOnClickListener(this);
        Button tripBtn = (Button) root.findViewById(R.id.tripBtn);
        tripBtn.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.orderBtn:
                intent = new Intent(getContext(), SearchResultActivity.class);
                startActivity(intent);
                break;
            case R.id.tripBtn:
                intent = new Intent(getContext(), MyTripActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}