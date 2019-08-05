package com.andela.www.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by DELL on 05/08/2019.
 */

public class FirebaseUtil {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseRef;
    private static FirebaseUtil firebaseUtil;
    public static ArrayList<TravelDeal> mdeals;


    private FirebaseUtil(){}

    public static void openFbReference(String ref){
        if(firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mdeals = new ArrayList<TravelDeal>();
        }

        mDatabaseRef = mFirebaseDatabase.getReference().child(ref);
    }
}
