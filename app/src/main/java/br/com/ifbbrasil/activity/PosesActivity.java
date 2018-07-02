package br.com.ifbbrasil.activity;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.ifbbrasil.R;
import br.com.ifbbrasil.dto.CategoriaDTO;
import br.com.ifbbrasil.fragment.FotoPosesFragment;

public class PosesActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private TextView tvDescricaoFoto;
    private TextView tvContadorFoto;
    private ImageView ivSetaDireita;
    private ImageView ivSetaEsquerda;
    private ImageButton ibCapturarFotoShowCase;
    private Button btAbrirGaleria;
    private Button btEnviarFotos;
    private FotosPagerAdapter mAdapter;
//    private ArrayList<FotoType> fotoTypeList;
//    private ArrayList<FotoType> fotoTypeListRetorno;
    private ConstraintLayout layUploadFoto;
    private LinearLayout layDots;
    private int dotsCount;
    private ImageView[] dots;

    private CategoriaDTO categoriaDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poses);

        categoriaDTO = (CategoriaDTO) getIntent().getSerializableExtra("dadosCategoria");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        layDots = findViewById(R.id.layDots);
        tvDescricaoFoto = findViewById(R.id.tvDescricaoFoto);
        tvContadorFoto = findViewById(R.id.tvContadorFoto);
        ivSetaEsquerda = findViewById(R.id.ivSetaEsquerda);
        ivSetaDireita = findViewById(R.id.ivSetaDireita);
        viewPager = findViewById(R.id.vpFotosPager);

        mAdapter = new FotosPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);
        viewPager.setOffscreenPageLimit(6);

        dotsCount = mAdapter.getCount();
        dots = new ImageView[dotsCount];

        for(int i = 0; i < dotsCount; i++){
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getDrawable(R.drawable.active_nondot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(16,0,16,0);
            layDots.addView(dots[i],params);
        }

        dots[0].setImageDrawable(getDrawable(R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            Boolean first = true;

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (first && positionOffset == 0 && positionOffsetPixels == 0) {
                    onPageSelected(0);
                    first = false;
                }
            }

            @Override
            public void onPageSelected(int position) {

                tvDescricaoFoto.setText(categoriaDTO.getPosesCompulsorias().get(position));
                tvContadorFoto.setText("Foto " + (position + 1) + " de " + categoriaDTO.getPosesCompulsorias().size());

                if (position == 0) {
                    ivSetaEsquerda.setVisibility(View.INVISIBLE);
                    ivSetaDireita.setVisibility(View.VISIBLE);
                } else if (position > 0 && position < categoriaDTO.getPosesCompulsorias().size()-1) {
                    ivSetaEsquerda.setVisibility(View.VISIBLE);
                    ivSetaDireita.setVisibility(View.VISIBLE);
                } else {
                    ivSetaEsquerda.setVisibility(View.VISIBLE);
                    ivSetaDireita.setVisibility(View.INVISIBLE);
                }

                for(int i = 0; i < dotsCount; i++) {
                    dots[i].setImageDrawable(getDrawable(R.drawable.active_nondot));
                }
                dots[position].setImageDrawable(getDrawable(R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ivSetaDireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
            }
        });

        ivSetaEsquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
            }
        });
    }


    private class FotosPagerAdapter extends FragmentPagerAdapter {


        public FotosPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }

        @Override
        public Fragment getItem(int position) {
            FotoPosesFragment fragment = new FotoPosesFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("resourceId", categoriaDTO.getFotosPosesCompulsorias().get(position));
            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return categoriaDTO.getPosesCompulsorias().size();
        }
    }
}
