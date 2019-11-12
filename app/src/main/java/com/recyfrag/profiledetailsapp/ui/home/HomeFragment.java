package com.recyfrag.profiledetailsapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.recyfrag.profiledetailsapp.R;
import com.recyfrag.profiledetailsapp.adpter.ContactsAdapters;

import java.util.ArrayList;
import java.util.List;

import model.Contacts;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("gaurav","9898466",R.drawable.bhuwan));
        contactsList.add(new Contacts("shrestha","9898466",R.drawable.noimage));
        contactsList.add(new Contacts("muskhan","9898466",R.drawable.dahayang));
        contactsList.add(new Contacts("rabinson","9898466",R.drawable.saugat));
        contactsList.add(new Contacts("subu","9898466",R.drawable.bhuwan));
        contactsList.add(new Contacts("nari","9898466",R.drawable.saugat));
        contactsList.add(new Contacts("baun","9898466",R.drawable.dahayang));
        contactsList.add(new Contacts("tvs","9898466",R.drawable.noimage));
        contactsList.add(new Contacts("kashi","9898466",R.drawable.noimage));
        contactsList.add(new Contacts("khale","9898466",R.drawable.dahayang));
        contactsList.add(new Contacts("raja","9898466",R.drawable.noimage));
        contactsList.add(new Contacts("haste","9898466",R.drawable.noimage));
        contactsList.add(new Contacts("bhk","9898466",R.drawable.dahayang));
        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}