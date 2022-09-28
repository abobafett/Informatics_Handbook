package com.example.informaticshandbook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuizTitlesAdapter extends RecyclerView.Adapter<QuizTitlesAdapter.QuizTitlesViewHolder> {

    private Context context;
    public ArrayList listOfQuizTitles;
    public int numberOfQuizTitles;
    public TextView listQuizTitlesView;
    public int quizTitlePos;
    private Intent intent;

    public QuizTitlesAdapter(int numberQuizTitles, ArrayList quizTitlesList, Context context) {
        numberOfQuizTitles = numberQuizTitles;
        listOfQuizTitles = quizTitlesList;
        this.context = context;
    }

    @Override
    public QuizTitlesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListTitles = R.layout.element;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListTitles, parent, false);

        QuizTitlesViewHolder viewHolder = new QuizTitlesViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(QuizTitlesViewHolder holder, int position) {
        holder.bind(position);

        listQuizTitlesView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                quizTitlePos = holder.getAdapterPosition();
                switch (quizTitlePos){
                    case 0:
                        intent = new Intent(context, QuizActivity.class);
                        intent.putExtra("quizTitle", quizTitlePos);
                        break;
                    case 1:
                        intent = new Intent(context, QuizRadioGroupActivity.class);
                        intent.putExtra("quizTitle", quizTitlePos);
                        break;
                    case 2:
                        intent = new Intent(context, QuizRadioGroupActivity.class);
                        intent.putExtra("quizTitle", quizTitlePos);
                        break;
                }
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return numberOfQuizTitles;
    }

    class QuizTitlesViewHolder extends RecyclerView.ViewHolder {

        public QuizTitlesViewHolder(View itemView) {
            super(itemView);

            listQuizTitlesView = itemView.findViewById(R.id.title_text_view);
        }

        void bind(int listIndex) {
            listQuizTitlesView.setText((String) listOfQuizTitles.get(listIndex));
        }
    }
}
