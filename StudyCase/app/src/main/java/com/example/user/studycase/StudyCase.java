package com.example.user.studycase;

        import android.app.ActionBar;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class StudyCase extends AppCompatActivity {

    private void String
    private java.lang.String LOG_TAG;
    LOG_TAG = StudyCase.class.getSimpleName();{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case);

        public void int Uang = 65500;
        private int NasdukEatbus = 50000;
        private int NasdukAbnormal = 30000;
        private int TotalBiaya;
        private EditText xMakanan;
        private EditText xJumlah;
        private Button xPilihan1;
        private Button xPilihan2;

        xMakanan = (EditText) findViewById(R.id.Makanan);
        xJumlah = (EditText) findViewById(R.id.Jumlah);
        xPilihan1 = (Button) findViewById(R.id.eatbus);
        xPilihan2 = (Button) findViewById(R.id.abnormal);
    }

    public void selectEatbus(View view, Object HargaTotal, ActionBar.Tab xMakanan, ActionBar.Tab xJumlah, int NasdukEatbus, Object Uang, Object Venue, Object Eatbus){
    Log.d(LOG_TAG, "DONE");

    int Jumlah = Integer.parseInt(xJumlah.getText().toString());
    String Makanan = xMakanan.getText().toString();

        HargaTotal = Jumlah * NasdukEatbus;
        Intent intent = new Intent(this,MainActivity2.class);
        intent addNew ("Makanan", Makanan);
        intent addNew ("Jumlah", Jumlah);
        intent addNew ("HargaTotal", HargaTotal);
        intent addNew ("Uang", Uang);
        intent addNew ("Venue", "Eatbus");
        

        mulaiActivity(intent);

}

    private void mulaiActivity(Intent intent) {
    }
}
}