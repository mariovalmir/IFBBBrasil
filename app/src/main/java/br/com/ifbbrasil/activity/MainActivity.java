package br.com.ifbbrasil.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import br.com.ifbbrasil.R;

import static br.com.ifbbrasil.enums.CategoriaEnum.BODYBUILDING;

public class MainActivity extends AppCompatActivity {


    private ImageView ivBodbuilding;
    private ImageView ivClassico;
    private ImageView ivWellness;
    private ImageView ivBikini;
    private ImageView ivMens;
    private ImageView ivMuscular;
    private ImageView ivWomans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBodbuilding = findViewById(R.id.ivBodybuilding);
        ivBodbuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DadosCategoriaActivity.class);
                intent.putExtra("categoria", BODYBUILDING);
                startActivity(intent);
            }
        });
                ivClassico = findViewById(R.id.ivClassico);
        ivWellness = findViewById(R.id.ivWellness);
        ivBikini = findViewById(R.id.ivBikini);
        ivMens = findViewById(R.id.ivMens);
        ivMuscular = findViewById(R.id.ivMuscular);
        ivWomans = findViewById(R.id.ivWomans);
    }
}
