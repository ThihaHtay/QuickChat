package com.thiha.quickchat;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ContactFragment extends Fragment {
    RecyclerView recyclerView;
    FloatingActionButton add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        add=view.findViewById(R.id.addUser);
        setupRecyclerView();
        return view;

    }
    void setupRecyclerView(){
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddContactActivity.class);

                // Start the activity
                getActivity().startActivity(intent);


            } });

    }
}