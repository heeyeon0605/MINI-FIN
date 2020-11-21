package com.example.kustim_v01.ui.option;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.kustim_v01.R;
import com.example.kustim_v01.User;
public class OptionFragment extends Fragment {

    private OptionViewModel optionViewModel;
    TextView mypage_name;
    TextView mypage_score;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        optionViewModel =
                ViewModelProviders.of(this).get(OptionViewModel.class);
        root = inflater.inflate(R.layout.fragment_option, container, false);

        mypage_score = root.findViewById(R.id.mypage_score);
        mypage_score.setText(User.score);
        mypage_name = root.findViewById(R.id.mypage_name);
        mypage_name.setText(User.name);

        return root;
    }
}