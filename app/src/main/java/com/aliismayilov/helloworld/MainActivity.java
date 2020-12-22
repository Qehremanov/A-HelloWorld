package com.aliismayilov.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Programming Languages

        ArrayList<String> languages = new ArrayList<>();

        languages.add("C"+"             printf(\"Hello, World\");");
        languages.add("C++"+"           std::cout << \"Hello World!\";");
        languages.add("C#"+"            Console.WriteLine(\"Hello, World!\");");
        languages.add("Java"+"          System.out.println(\"Hello, World!\");");
        languages.add("Python"+"        print(\"Hello, World!\")");
        languages.add("PHP"+"           echo \"Hello World!\";");


        // Programming languages creators

        ArrayList<String> creators = new ArrayList<>();

        creators.add("Dennis Ritchie");
        creators.add("Bjarne Stroustrup");
        creators.add("Anders Hejlsberg");
        creators.add("James Gosling");
        creators.add("Guido van Rossum");
        creators.add("Rasmus Lerdorf");


        // Images of languages

        ArrayList<Bitmap> imageLanguage = new ArrayList<>();

        Bitmap c = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.c);
        Bitmap cpp = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cpp);
        Bitmap cSharp = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.csharp);
        Bitmap java = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.java);
        Bitmap python = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.python);
        Bitmap php = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.php);

        imageLanguage.add(c);
        imageLanguage.add(cpp);
        imageLanguage.add(cSharp);
        imageLanguage.add(java);
        imageLanguage.add(python);
        imageLanguage.add(php);


        // Images of creators

        ArrayList<Bitmap> imageCreator = new ArrayList<>();

        Bitmap cCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ccreator);
        Bitmap cppCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cppcreator);
        Bitmap cSharpCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.csharpcreator);
        Bitmap javaCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.javacreator);
        Bitmap pythonCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.pythoncreator);
        Bitmap phpCreator = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.phpcreator);

        imageCreator.add(cCreator);
        imageCreator.add(cppCreator);
        imageCreator.add(cSharpCreator);
        imageCreator.add(javaCreator);
        imageCreator.add(pythonCreator);
        imageCreator.add(phpCreator);



        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, languages);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("name", creators.get(position));

                Singleton singleton1 = Singleton.getInstance();
                singleton1.setImage1(imageCreator.get(position));
                singleton1.setImage2(imageLanguage.get(position));




                startActivity(intent);

            }
        });
    }
}