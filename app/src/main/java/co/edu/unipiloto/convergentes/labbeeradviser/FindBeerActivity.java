package co.edu.unipiloto.convergentes.labbeeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Spinner;


public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);


    }
    public void onClickFindBeer(View view) {
        // Código para manejar el clic del botón aquí
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of geer");
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        switch (beerType) {
            case "ligth":
                brands.setText("Listado de cervezas light:\n \nAguila \nPoker \nCosteñita");
                break;
            case "amber":
                brands.setText("Listado de cervezas amber:\n\nClub Colombia\nColimita \nBBC");
                break;
            case "brown":
                brands.setText("Listado de cervezas brown:\n\nTres Cordilleras\nApóstol\nChelarte");
                break;
            case "dark":
                brands.setText("Listado de cervezas dark:\n\nClub Colombia Negra\nAguila Stout\nBBC Negra");
                break;
            default:
                brands.setText("Tipo de cerveza no reconocido");
        }
    }
}