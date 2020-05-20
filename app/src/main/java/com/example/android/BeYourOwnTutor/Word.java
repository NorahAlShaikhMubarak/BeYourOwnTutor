package com.example.android.BeYourOwnTutor;

/**
 * Created by admin on 24-06-2016.
 */
public class Word {



    //Miwok Translation for the words
    private String mWords;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    //Music file Id for words
    private int mAudioResourceId;

    // constructor for the new word object
    public Word(String words,int audioResourceId){
        mWords = words;
        mAudioResourceId = audioResourceId;

    }

    // constructor for the new word object with image Resource id
    public Word(String words,int imageResourceId, int audioResourceId){
        mWords = words;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    //get the default Translation

    //get the miwok Translation
    public String getmWords() {
        return mWords;
    }

    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //get the audio file resource id
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
