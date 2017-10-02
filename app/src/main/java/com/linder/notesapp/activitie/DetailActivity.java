package com.linder.notesapp.activitie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.linder.notesapp.R;
import com.linder.notesapp.model.Note;
import com.linder.notesapp.repositorie.NoteRepository;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = DetailActivity.class.getSimpleName();

    private Long id;

    private TextView titleText;
    private TextView contentText;
    private CheckBox favoriteStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Enable back button with onSupportNavigateUp method
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        titleText = (TextView)findViewById(R.id.title_text);
        contentText = (TextView)findViewById(R.id.content_text);
        favoriteStar = (CheckBox)findViewById(R.id.favorite_star);

        id = getIntent().getExtras().getLong("ID");
        Log.e(TAG, "ID: " + id);

        // Get Note by ID from Repository
        Note note = NoteRepository.get(id);

        titleText.setText(note.getTitle());
        contentText.setText(note.getContent());
        if(note.getFavorite()){
            favoriteStar.setVisibility(View.VISIBLE);   // Hidden view
        }else{
            favoriteStar.setVisibility(View.GONE);  // Show view
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}


