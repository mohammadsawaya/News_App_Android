package com.android2017.session12_navigationdrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mohammad on 29.10.2017.
 */

public class NachrichtAdapter extends ArrayAdapter<Nachricht> {

    List<Nachricht> nachrichtList;
    Context context;
//int posi=nachrichtList.size();

    public NachrichtAdapter(@NonNull Context context,@NonNull List<Nachricht> nachrichtList) {

        super(context, R.layout.listitemview, nachrichtList);
        this.context = context;
        this.nachrichtList = nachrichtList;
    }

//    View gridView;
//    if (convertView == null) {
//        gridView = new View(context);
//    } else {
//        gridView = (View) convertView;
//    }
//    gridView = inflater.inflate(R.layout.worker_listmain, null);
//    // your source code here!!! Run 100%
//    // I got this problem also, I found out the way to solve it!
//    // Please use my source code :D SIMPLE is PERFECT :D
//    return gridView;
//}


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView;
        if (convertView == null) {
             listItemView= inflater.inflate(R.layout.listitemview, parent, false);
        } else {
             listItemView = convertView;
        }

            TextView txtTilte = listItemView.findViewById(R.id.txtNachrichtTitle);
            TextView txtAutor = listItemView.findViewById(R.id.txtNachrichAoutor);
            ImageView imageIcon = listItemView.findViewById(R.id.imageIcon);

            Nachricht nachricht = nachrichtList.get(position);

            txtTilte.setText(nachricht.getTitel());
            txtAutor.setText(nachricht.getAutor());

            try {
//            String iconName = nachricht.getTitel().toLowerCase();
//            int id = context.getResources().getIdentifier(iconName, "drawable", context.getPackageName());
                imageIcon.setImageResource(R.drawable.apple);
            } catch (Exception ex) {
                imageIcon.setImageResource(R.drawable.apple);
            }

        return listItemView;
    }

}
