package com.example.informaticshandbook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TitlesAdapter extends RecyclerView.Adapter<TitlesAdapter.TitlesViewHolder> {

    private int numberTitles;
    private ArrayList listOfTitles;
    public TextView listTitlesView;
    public int titlePos;

    private Context context;

    public TitlesAdapter(int numberOfTitles, ArrayList titlesList, Context context) {
        numberTitles = numberOfTitles;
        listOfTitles = titlesList;
        this.context = context;

    }

    @Override
    public TitlesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListTitles = R.layout.element;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListTitles, parent, false);

        TitlesViewHolder viewHolder = new TitlesViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TitlesViewHolder holder, int position) {
        holder.bind(position);

        listTitlesView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (holder.getAdapterPosition() != 9) {
                    Intent intent = new Intent(context, TextActivity.class);
                    titlePos = holder.getAdapterPosition();
                    intent.putExtra("title", titlePos);
                    context.startActivity(intent);
                } else {
                    Intent switchIntent = new Intent(context, QuizListActivity.class);
                    context.startActivity(switchIntent);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return numberTitles;
    }

    class TitlesViewHolder extends RecyclerView.ViewHolder {

        public TitlesViewHolder(View itemView) {
            super(itemView);

            listTitlesView = itemView.findViewById(R.id.title_text_view);

        }

        void bind(int listIndex) {
            String srtTemp = (String) listOfTitles.get(listIndex);
            listTitlesView.setText((String) listOfTitles.get(listIndex));
        }

    }
}
