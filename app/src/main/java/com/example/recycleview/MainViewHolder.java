package com.example.recycleview;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textView);
    }

    public void onBind(String s) {
        textView.setText(s);
    }
}
