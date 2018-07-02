package br.com.ifbbrasil.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.ifbbrasil.R;
import br.com.ifbbrasil.dto.CategoriaDTO;

public class DivisoesAdapter extends RecyclerView.Adapter<DivisoesAdapter.ViewHolder> {

    private Context context;
    private List<String> divisoes;
    private List<String> pesosAltura;

    public DivisoesAdapter(CategoriaDTO categoriaDTO, Context context) {
        this.divisoes = categoriaDTO.getDivisoes();
        this.pesosAltura = categoriaDTO.getPesosAltura();
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDivisao;
        private TextView tvAltura;

        public ViewHolder(View itemView) {
            super(itemView);
            tvDivisao = itemView.findViewById(R.id.tvDivisao);
            tvAltura = itemView.findViewById(R.id.tvAltura);
        }
    }

    @Override
    public DivisoesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_divisoes, parent, false);
        DivisoesAdapter.ViewHolder viewHolder = new DivisoesAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DivisoesAdapter.ViewHolder holder, int position) {
        final String divisao = divisoes.get(position);
        final String pesoAltura = pesosAltura.get(position);
        holder.tvDivisao.setText(divisao);
        holder.tvAltura.setText(pesoAltura);
    }

    @Override
    public int getItemCount() {
        return divisoes.size();
    }
}