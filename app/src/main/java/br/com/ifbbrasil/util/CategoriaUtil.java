package br.com.ifbbrasil.util;

import java.util.ArrayList;
import java.util.List;

import br.com.ifbbrasil.R;
import br.com.ifbbrasil.dto.CategoriaDTO;

public class CategoriaUtil {


    public static CategoriaDTO getBodybuilding(){
        List<String> divisoes = new ArrayList<>();
        divisoes.add("JR");
        divisoes.add("SÊNIOR");
        divisoes.add("MASTER 40-44");
        divisoes.add("MASTER 45-49");
        divisoes.add("MASTER 50-54");
        divisoes.add("MASTER ACIMA 55");

        List<String> pesosAltura = new ArrayList<>();
        pesosAltura.add("ATÉ 75KG e ACIMA 75KG");
        pesosAltura.add("ATÉ 60KG, 65KG, 70KG, 75KG, 80KG, 85KG, 90KG, 95KG, 100KG e ACIMA 100KG");
        pesosAltura.add("ATÉ 70KG, 80KG, 90KG, ACIMA 90KG");
        pesosAltura.add("ATÉ 70KG, 80KG, 90KG, ACIMA 90KG");
        pesosAltura.add("ATÉ 80KG, ACIMA 80KG");
        pesosAltura.add("ATÉ 75KG, ACIMA 75KG");

        List<String> posesCompulsorias = new ArrayList<>();
        posesCompulsorias.add("DUPLO BÍCEPS FRENTE");
        posesCompulsorias.add("EXPANSÃO DE DORSAIS FRENTE");
        posesCompulsorias.add("PEITO MELHOR LADO");
        posesCompulsorias.add("DUPLO BÍCEPS COSTAS");
        posesCompulsorias.add("EXPANSÃO DE DORSAIS COSTAS");
        posesCompulsorias.add("TRÍCEPS MELHOR LADO");
        posesCompulsorias.add("ABDOMINAIS E COXAS");

        List<String> criteriosDeAvaliacao = new ArrayList<>();
        criteriosDeAvaliacao.add("GRANDE VOLUME DA MASSA MUSCULAR");
        criteriosDeAvaliacao.add("DEFINIÇÃO E PROFUNDIDADE");
        criteriosDeAvaliacao.add("DENSIDADE");
        criteriosDeAvaliacao.add("PROPORÇAO ENTRE O TRONCO E MEMBROS INFERIORES");
        criteriosDeAvaliacao.add("PINTURA");
        criteriosDeAvaliacao.add("ANOMALIAS E DEFICIÊNCIA");
        criteriosDeAvaliacao.add("GINECOMASTIA");
        criteriosDeAvaliacao.add("POSES");
        criteriosDeAvaliacao.add("EXPRESSÃO NO PALCO");
        criteriosDeAvaliacao.add("VESTIMENTAS E ADEREÇO");

        List<String> vestimentas = new ArrayList<>();
        vestimentas.add("SUNGAS DEVERÃO SER DE COR SÓLIDA E METÁLICAS");

        List<Integer> fotosPosesCompulsorias = new ArrayList<>();
        fotosPosesCompulsorias.add(R.drawable.bodybuilding);
        fotosPosesCompulsorias.add(R.drawable.bikini);
        fotosPosesCompulsorias.add(R.drawable.bodyfitiness);
        fotosPosesCompulsorias.add(R.drawable.classic);
        fotosPosesCompulsorias.add(R.drawable.bodybuilding);
        fotosPosesCompulsorias.add(R.drawable.bodybuilding);
        fotosPosesCompulsorias.add(R.drawable.mensphysique);

        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setCriteriosDeAvaliacao(criteriosDeAvaliacao);
        categoriaDTO.setDivisoes(divisoes);
        categoriaDTO.setPesosAltura(pesosAltura);
        categoriaDTO.setPosesCompulsorias(posesCompulsorias);
        categoriaDTO.setVestimentas(vestimentas);
        categoriaDTO.setFotosPosesCompulsorias(fotosPosesCompulsorias);

        return categoriaDTO;
    }
}
