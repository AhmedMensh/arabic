package com.android.ahmed.arabic.database;

import android.app.Application;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

public class WordViewModel {

    private static final String TAG = "WordViewModel";
    private List<Word> mWordList;
    private WordDao mWordDao;

    public WordViewModel(@NonNull Application application) {

        WordDatabase db = WordDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mWordList = mWordDao.getAllWords();
    }

    public void insetIntoWord(Word word) {
        new InsertAsyncTask(mWordDao).execute(word);
    }

    public void getAllWords(){
        new GetAllWordsAsyncTask(mWordDao).execute();
    }

    public static class GetAllWordsAsyncTask extends AsyncTask<Void , Void,List<Word>>{

        private WordDao wordDao;

        public GetAllWordsAsyncTask(WordDao wordDao) {
            this.wordDao = wordDao;
        }
        @Override
        protected void onPostExecute(List<Word> words) {
            super.onPostExecute(words);
            for (int i = 0; i <words.size() ; i++) {

                Log.e(TAG, "onPostExecute: "+words.get(i));
            }
        }

        @Override
        protected List<Word> doInBackground(Void... voids) {

            return wordDao.getAllWords();

        }
    }
    public static class InsertAsyncTask extends AsyncTask<Word, Void, Void> {

        private WordDao wordDao;

        public InsertAsyncTask(WordDao wordDao) {
            this.wordDao = wordDao;
        }

        @Override
        protected Void doInBackground(Word... words) {
            wordDao.insertIntoWord(words[0]);
            return null;
        }
    }
}
