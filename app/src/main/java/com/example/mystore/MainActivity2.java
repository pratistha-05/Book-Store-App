package com.example.mystore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.w3c.dom.Document;

import java.util.Arrays;
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

         CollectionReference cities = db.collection("cities");
        Map<String, Object> city = new HashMap<>();
        city.put("name", "Los Angeles");
        city.put("state", "CA");
        city.put("country", "USA");

       /*db.collection("cities").document("LA")
                .set(city)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(), "written data", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Error1", Toast.LENGTH_SHORT).show();
                    }
                });
                */


        db.collection("Reading Books").document("Fault in Our Stars")
        .get()
        .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Toast.makeText(getApplicationContext(), "retrieving Data :"+document.getData(), Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), "retrieving id :"+document.getId(), Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "No such document", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Error2", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

        /*db.collection("QUIZ").document("CAT2")
                .get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    Toast.makeText(getApplicationContext(), "Success1", Toast.LENGTH_SHORT).show();

                    if (doc.exists()){
                        long count = (long)doc.get("COUNT");
                        for (int i=1; i<=count; i++){
                            String catName = doc.getString("CAT"+ String.valueOf(i));
                            Toast.makeText(MainActivity2.this, "Data"+catName, Toast.LENGTH_SHORT).show();

                        }

                    }
                }
                else
                {
                    Toast.makeText(MainActivity2.this, "Error1", Toast.LENGTH_SHORT).show();
                }
            }
        });
        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Success2", Toast.LENGTH_SHORT).show();

                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Toast.makeText(MainActivity2.this, "Data", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity2.this, "Error2", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



}

}

         */