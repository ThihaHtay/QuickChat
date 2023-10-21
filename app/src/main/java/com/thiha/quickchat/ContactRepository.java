package com.thiha.quickchat;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ContactRepository {
    private ContactDao contactDao;
    private LiveData<List<Contact>> allContactList;

    public ContactRepository(Application application){
        ContactDatabase contactDatabase=ContactDatabase.getInstance(application);
        contactDao=contactDatabase.contactDao();
        allContactList=contactDao.getAllContact();
    }
    public LiveData<List<Contact>> getAllContactList(){
        return allContactList;
    }
    public void insert(Contact contact) {
        new InsertContactAsyncTask(contactDao).execute(contact);
    }

    private static class InsertContactAsyncTask extends AsyncTask<Contact,Void,Void>{

        private ContactDao contactDao;
        private InsertContactAsyncTask(ContactDao contactDao) {
            this.contactDao=contactDao;
        }
        @Override
        protected  Void doInBackground(Contact...contacts){
            contactDao.insert(contacts[0]);
            return null;
        }
    }
    public void update(Contact contact) {
        new InsertContactAsyncTask(contactDao).execute(contact);
    }

    private static class UpdateContactAsyncTask extends AsyncTask<Contact,Void,Void>{

        private ContactDao contactDao;
        private UpdateContactAsyncTask(ContactDao contactDao) {
            this.contactDao=contactDao;
        }
        @Override
        protected  Void doInBackground(Contact...contacts){
            contactDao.insert(contacts[0]);
            return null;
        }
    }
    public void delete(Contact contact) {
        new InsertContactAsyncTask(contactDao).execute(contact);
    }

    private static class DeleteContactAsyncTask extends AsyncTask<Contact,Void,Void>{

        private ContactDao contactDao;
        private DeleteContactAsyncTask(ContactDao contactDao) {
            this.contactDao=contactDao;
        }
        @Override
        protected  Void doInBackground(Contact...contacts){
            contactDao.insert(contacts[0]);
            return null;
        }
    }
}
