package br.com.ifbbrasil.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.com.ifbbrasil.R;

public class FotoPosesFragment extends Fragment {

    private ImageView ivPreviewFoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foto_posess, container, false);
        return view;
}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int resourceId = getArguments().getInt("resourceId");
        ivPreviewFoto = view.findViewById(R.id.ivPreviewFoto);
        ivPreviewFoto.setImageResource(resourceId);
    }
}
