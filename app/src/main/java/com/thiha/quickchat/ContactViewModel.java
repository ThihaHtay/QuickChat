package com.thiha.quickchat;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ContactViewModel extends AndroidViewModel {
    private ContactRepository contactRepository;
    private LiveData<List<Contact>> allContactList;
    public ContactViewModel(@NonNull Application application) {
        super(application);

        contactRepository=new ContactRepository(application);
        allContactList=contactRepository.getAllContactList();
    }

    public void insert(Contact contact){
        contactRepository.insert(contact);
    }
    public void update(Contact contact){
        contactRepository.update(contact);
    }
    public void delete(Contact contact){
        contactRepository.delete(contact);
    }
}
