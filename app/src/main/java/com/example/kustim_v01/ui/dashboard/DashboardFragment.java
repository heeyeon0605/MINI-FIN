package com.example.kustim_v01.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kustim_v01.R;
import com.example.kustim_v01.User;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DashboardFragment extends Fragment {

    TextView dashboard_first;
    TextView dashboard_second;
    TextView dashboard_third;
    TextView dashboard_fourth;
    View root;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        dashboard_first =root.findViewById(R.id.dashboard_first);
        dashboard_second =root.findViewById(R.id.dashboard_second);
        dashboard_third = root.findViewById(R.id.dashboard_third);
        dashboard_fourth =root.findViewById(R.id.dashboard_fourth);
        dashboard_fourth.setText("바꼈냐") ;
        if(User.promise==true &User.money==false&&User.wakeup==false) {
            dashboard_first.setText("이번 주 약속 하나를 달성하세요!");
        }
        if(User.promise==false&User.money==true&User.wakeup==false) {
            dashboard_first.setText("이번 주 짠돌이 되기 챌린지!");
        }
        if(User.promise==false&User.money==false&User.wakeup==true) {
            dashboard_first.setText("이번주 최고 성실맨이 되어라!");
        }
        if(User.promise==true&User.money==true&User.wakeup==false) {
            dashboard_first.setText("이번 주 약속 하나를 달성하세요!");
            dashboard_second.setText("이번 주 짠돌이 되기 챌린지!");
        }
        if(User.promise==false&User.money==true&User.wakeup==true) {
            dashboard_first.setText("이번 주 짠돌이 되기 챌린지!");
            dashboard_second.setText("이번주 최고 성실맨이 되어라!");

        }
        if(User.promise==true&User.money==false&User.wakeup==true){
            dashboard_first.setText("이번주 최고 성실맨이 되어라!");
            dashboard_second.setText("이번 주 약속 하나를 달성하세요!");
        }
        if(User.promise==true&User.money==true&User.wakeup==true) {
            dashboard_first.setText("이번 주 약속 하나를 달성하세요!");
            dashboard_second.setText("이번 주 짠돌이 되기 챌린지!");
            dashboard_third.setText("이번주 최고 성실맨이 되어라!");

        }









        return root;
    }

}
