package pe.edu.ulima.listados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import pe.edu.ulima.listados.adapters.CursosAdapter;
import pe.edu.ulima.listados.model.Curso;
import pe.edu.ulima.listados.model.GestorCursos;

public class MainActivity extends AppCompatActivity {

    private ListView spiCursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiCursos = (ListView) findViewById(R.id.spiCursos);
        List<Curso> cursos = new GestorCursos().listarCursos();
        final CursosAdapter adapter = new CursosAdapter(
                cursos,
                this
        );

        spiCursos.setAdapter(adapter);

        spiCursos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Curso curso = (Curso) adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, "Curso: " + curso.getNombre(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
