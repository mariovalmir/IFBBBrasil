package br.com.ifbbrasil.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.ifbbrasil.activity.PosesActivity;
import br.com.ifbbrasil.enums.CategoriaEnum;
import br.com.ifbbrasil.R;
import br.com.ifbbrasil.activity.DivisoesActivity;
import br.com.ifbbrasil.util.CategoriaUtil;

public class DadosCategoriaAdapter extends RecyclerView.Adapter<DadosCategoriaAdapter.ViewHolder>{

    private Context context;
    private List<String> listGrupoTipoItem;
    private CategoriaEnum categoriaEnum;

    public DadosCategoriaAdapter(List<String> list, CategoriaEnum categoriaEnum, Context context){
        this.listGrupoTipoItem = list;
        this.categoriaEnum = categoriaEnum;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvCardRowTipoCategoria;
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            tvCardRowTipoCategoria = (TextView) itemView.findViewById(R.id.tvCardRowTipoCategoria);
            cardView = (CardView) itemView.findViewById(R.id.cdDadosCategoria);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_cardview_dados_categoria, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String grupoItem = listGrupoTipoItem.get(position);
        holder.tvCardRowTipoCategoria.setText(grupoItem);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                switch (grupoItem){
                    case "Divisões":
                        intent = new Intent(context, DivisoesActivity.class);
                        break;
                    case "Critérios de Avaliação":
                        break;
                    case "Rotina de Poses":
                        intent = new Intent(context, PosesActivity.class);
                        break;
                    case "Vestimenta":
                        break;
                }

                switch (categoriaEnum){
                    case BODYBUILDING:
                        intent.putExtra("dadosCategoria", CategoriaUtil.getBodybuilding());
                        break;
                    case BIKINI:
                    case CLASSICO:
                    case WELLNESS:
                    case MENS_PHYSIQUE:
                    case WOMANS_PHYSIQUE:
                    case MUSCULAR_PHYSIQUE:
                        Toast.makeText(context, grupoItem.toString(), Toast.LENGTH_SHORT).show();
                        break;
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGrupoTipoItem.size();
    }
}
