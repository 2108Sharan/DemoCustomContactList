package sg.edu.rp.c346.id20011066.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContact;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContacts);

        alContact = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContact.add(item1);
        alContact.add(item2);

        caContact = new CustomAdapter(MainActivity.this, R.layout.row, alContact);
        lvContact.setAdapter(caContact);


    }
}