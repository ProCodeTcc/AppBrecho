package br.com.senaijandira.brechobernadete.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.senaijandira.brechobernadete.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificacoesFragment extends Fragment {


    public NotificacoesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View notificacaoView = inflater.inflate(R.layout.fragment_notificacoes, container, false);

        return notificacaoView;
    }

}
