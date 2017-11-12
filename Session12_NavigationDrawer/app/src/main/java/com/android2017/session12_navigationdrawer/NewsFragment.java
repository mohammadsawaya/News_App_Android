package com.android2017.session12_navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class NewsFragment extends Fragment {
    private static final String ARG_CATEGORE = "mycategore";

    private String categore;
    NachrichtenDataSource nachrichtenDataSource = new NachrichtenDataSource();

    public NewsFragment() {
        // Required empty public constructor
    }

    public static NewsFragment newInstance(String mycategore) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORE, mycategore);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categore = getArguments().getString(ARG_CATEGORE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);
        TextView txtTilte = view.findViewById(R.id.txtNachrichtTitle);
        TextView txtAutor = view.findViewById(R.id.txtNachrichAoutor);
        ImageView imageIcon = view.findViewById(R.id.imageIcon);
        List<Nachricht> nachrichtList;
        switch (categore) {
            case "Sport":
                nachrichtList = nachrichtenDataSource.getSport();
                break;
            case "Economy":
                nachrichtList = nachrichtenDataSource.getEconomy();
                break;
            case "Technik":
                nachrichtList = nachrichtenDataSource.getTechnik();
                break;
            default:
                nachrichtList = nachrichtenDataSource.getPolitik();
                break;
        }

        ListView listView = view.findViewById(R.id.lstViewFragNews);
        NachrichtAdapter adapter = new NachrichtAdapter(getContext(), nachrichtList);
        //adapter.clear();
        listView.setAdapter(adapter);


        return view;
    }
}
