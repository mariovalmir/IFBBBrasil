package br.com.ifbbrasil.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.ifbbrasil.enums.CategoriaEnum;
import br.com.ifbbrasil.R;
import br.com.ifbbrasil.adapter.DadosCategoriaAdapter;

public class DadosCategoriaActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<String> categorias;
    private CategoriaEnum categoriaEnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_categoria);


        categorias = new ArrayList<>();
        categorias.add("Divisões");
        categorias.add("Critérios de Avaliação");
        categorias.add("Rotina de Poses");
        categorias.add("Vestimenta");
        categoriaEnum = CategoriaEnum.fromCodigo(getIntent().getIntExtra("categoria", 0));

        mRecyclerView = findViewById(R.id.rvDadosCategoria);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new DadosCategoriaAdapter(categorias, categoriaEnum, getBaseContext());
        mRecyclerView.setAdapter(mAdapter);

    }
}
