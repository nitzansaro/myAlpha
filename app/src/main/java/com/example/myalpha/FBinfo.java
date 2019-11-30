package com.example.myalpha;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FBinfo {
    public static FirebaseDatabase FAB = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef= FAB.getReference("message");

}
