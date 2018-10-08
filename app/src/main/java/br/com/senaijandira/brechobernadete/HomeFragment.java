package br.com.senaijandira.brechobernadete;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ListView list_view_categoria;
    CategoriaDAO dao;
    CategoriaAdapter adapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View viewHome =  inflater.inflate(R.layout.fragment_home, container, false);

        dao = CategoriaDAO.getInstance();
        Categoria cat = new Categoria();
        cat.setId(0);

        list_view_categoria = viewHome.findViewById(R.id.list_categorias_home);

        adapter = new CategoriaAdapter(getContext(),dao, new ArrayList<Categoria>());
        list_view_categoria.setAdapter(adapter);
        list_view_categoria.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ItemClick();
            }
        });
        return viewHome;
    }

    @Override
    public void onResume() {
        super.onResume();
//        criando um array
        ArrayList<Categoria> categorias;
//        chamando o metodo de selecionar todas as categorias
        categorias = dao.selecioanrTodos(getContext());
//        limpando o adapter
        adapter.clear();
//        adicionando a lista ao adapter
        adapter.addAll(categorias);
    }

    public void ItemClick() {
        Toast.makeText(getContext(), "funcionou", Toast.LENGTH_SHORT).show();
    }
}
