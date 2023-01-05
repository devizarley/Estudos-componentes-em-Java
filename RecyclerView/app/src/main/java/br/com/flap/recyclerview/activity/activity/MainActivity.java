package br.com.flap.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.flap.recyclerview.R;
import br.com.flap.recyclerview.activity.adapter.Adapter;
import br.com.flap.recyclerview.activity.model.Filme;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //puxar o objeto de listagem dos filmes
        criarfilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);
        //SETAR O ADAPTER CRIADO NA LINHA 34
        recyclerView.setAdapter( adapter );

        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //SETAR O LAYAOUT CRIADO ACIMA AO RECYCLERVIEW
        recyclerView.setLayoutManager(layoutManager);

        //SETAR UM TAMANHO FIXO QUE FOI SETADO NA CLASSE ADAPTER
        recyclerView.setHasFixedSize(true);

    }
    //OBJETO PARA SETAR LISTA DE "FILMES" NO MODEL "FILME"
    public void criarfilmes(){

        Filme filme = new Filme("Homem Aranha", "Ficção", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher maravilha", "Fantasia", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Liga da justiça", "Ficção", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitão america", "Aventura/Ficção", "2020");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A Coisa", "Drama/Terror", "2021");
        this.listaFilmes.add(filme);

        filme = new Filme("Pica-pau: O filme", "Comedia/Animação", "2022");
        this.listaFilmes.add(filme);

        filme = new Filme("A múmia", "Terror", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("A bela e a fera", "romance", "2024");
        this.listaFilmes.add(filme);

        filme = new Filme("Meu malvado favorito 3", "Comédia", "2025");
        this.listaFilmes.add(filme);

        filme = new Filme("Carros 3", "Comédia", "2026");
        this.listaFilmes.add(filme);


    }
}