package com.example.lesson_3_2_3month;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BtnViewHolder extends RecyclerView.ViewHolder {

    private Button button;

    public BtnViewHolder(@NonNull View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.btn_tikni);
    }

    public void bind(String text){
        button.setText(text);

    }
}
