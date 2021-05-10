package com.pactise.fragmenttask;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
public class ColorFragment extends Fragment {
    private ArrayList<Integer> colors = new ArrayList<>();
    private int cnt = 0;

    public ColorFragment(ArrayList<Integer> colors) {
        this.colors.addAll(colors);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView =view.findViewById(R.id.iv_color);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt < colors.size() -1) cnt++;
                else cnt = 0;

                imageView.setImageResource(colors.get(cnt));
            }
        });
    }
}