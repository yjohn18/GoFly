package com.example.gofly.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.gofly.R;
import com.example.gofly.searchResult.SearchResultActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        /*
         * 以上代码为系统自动生成
         *
         *
         *
         */
        Button button1 = (Button) root.findViewById(R.id.searchTicketButton);
        button1.setOnClickListener(this);



        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.searchTicketButton:
                Intent intent = new Intent(getContext(), SearchResultActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}