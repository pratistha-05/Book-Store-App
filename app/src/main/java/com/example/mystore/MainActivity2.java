package com.example.mystore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    CollectionReference dbnew = db.collection("android");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(getApplicationContext(), "This is screen!", Toast.LENGTH_SHORT).show();


        Map<String, Object> book1 = new HashMap<>();
        book1.put("price", 2100);
        book1.put("Author", "Jerry Hamilton");
        book1.put("USBN", 1836790391);
        addData(book1);


        Map<String, Object> book2 = new HashMap<>();
        book2.put("price", 2100);
        book2.put("Author", "Jerry Hamilton");
        book2.put("USBN", 1836790391);
        addData(book2);


}




    private void addData(Map<String, Object> book)
    {
        dbnew.add(book)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(), "Added book1", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {

                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "error!" + e, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}