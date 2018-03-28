package salasca_valerio.trustbet;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.DialogFragment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import static android.app.PendingIntent.getActivity;

public class  CreatePariActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pari);
    }


        /**
         * This callback method, call DatePickerFragment class,
         * DatePickerFragment class returns calendar view.
         * @param view
         */
        public void datePicker(View view){

            DatePickerFragment fragment = new DatePickerFragment();
            fragment.show(getSupportFragmentManager(), "datePicker");
        }

        /**
         * To set date on TextView
         * @param calendar
         */
        private void setDate(final Calendar calendar) {
            final DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);

            ((TextView) findViewById(R.id   .showDate))
                    .setText(dateFormat.format(calendar.getTime()));

        }

        /**
         * To receive a callback when the user sets the date.
         * @param view
         * @param year
         * @param month
         * @param day
         */
        @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            Calendar cal = new GregorianCalendar(year, month, day);
            setDate(cal);
        }

        /**
         * Create a DatePickerFragment class that extends DialogFragment.
         * Define the onCreateDialog() method to return an instance of DatePickerDialog
         */
        public static class DatePickerFragment extends DialogFragment {

            @Override
            public Dialog onCreateDialog(Bundle savedInstanceState) {
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);


                return new DatePickerDialog(getActivity(),
                        (DatePickerDialog.OnDateSetListener)
                                getActivity(), year, month, day);
            }

        }


    private void createBetButtonAction() {

        Button createBetButton = findViewById(R.id.button_create_bet);
        createBetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                /* remplit la bd avec les infos du pari */




            }
        });
    }
























}
