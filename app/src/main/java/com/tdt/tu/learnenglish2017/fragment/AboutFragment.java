package com.tdt.tu.learnenglish2017.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tdt.tu.learnenglish2017.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 1stks on 04-Jan-18.
 */

public class AboutFragment extends Fragment {

    @BindView(R.id.btnBack)
    Button btnBack;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_about, container, false);
        init();
        return view;
    }

    private void init() {
        ButterKnife.bind(this, view);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });
    }
}
