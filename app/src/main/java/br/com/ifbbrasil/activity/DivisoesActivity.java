package br.com.ifbbrasil.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.ifbbrasil.R;
import br.com.ifbbrasil.adapter.DadosCategoriaAdapter;
import br.com.ifbbrasil.adapter.DivisoesAdapter;
import br.com.ifbbrasil.dto.CategoriaDTO;
import br.com.ifbbrasil.util.CategoriaUtil;

public class DivisoesActivity extends AppCompatActivity {

    private CategoriaDTO categoriaDTO;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisoes);

        categoriaDTO = (CategoriaDTO) getIntent().getSerializableExtra("dadosCategoria");

        mRecyclerView = findViewById(R.id.rvDivisoes);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new DivisoesAdapter(categoriaDTO, getBaseContext());
        mRecyclerView.setAdapter(mAdapter);
    }
}
