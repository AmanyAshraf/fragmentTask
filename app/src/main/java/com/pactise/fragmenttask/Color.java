package com.pactise.fragmenttask;

import java.util.ArrayList;

public class Color {
    private static final ArrayList<Integer> colors = new ArrayList<Integer>() {{
        add(R.color.rose);
        add(R.color.black);
        add(R.color.pink);
        add(R.color.teal_700);
        add(R.color.green);
        add(R.color.grey);
        add(R.color.purple_3);
        add(R.color.purple_200);
        add(R.color.white);
        add(R.color.yellow);
        add(R.color.red);
        add(R.color.purple_500);
        add(R.color.red_2);
        add(R.color.purple_700);
        add(R.color.teal_200);
        add(R.color.orange);

    }};
    private static final ArrayList<Integer> all = new ArrayList<Integer>() {{
        addAll(colors);

    }};

    public static ArrayList<Integer> getColors() {
        return colors;
    }

    public static ArrayList<Integer> getAll() {
        return all;
    }
}
