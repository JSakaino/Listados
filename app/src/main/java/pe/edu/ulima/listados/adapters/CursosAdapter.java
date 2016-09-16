package pe.edu.ulima.listados.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pe.edu.ulima.listados.R;
import pe.edu.ulima.listados.model.Curso;

/**
 * Created by sodm on 12/09/2016.
 */
public class CursosAdapter extends BaseAdapter{
    private List<Curso> mCursos;
    private LayoutInflater mInflater;
    private Context mContext;

    public CursosAdapter(List<Curso> cursos, Context context){
        mCursos = cursos;
        mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public int getCount() {
        return mCursos.size();
    }

    @Override
    public Object getItem(int i) {
        return mCursos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null){
            view = mInflater.inflate(R.layout.item_curso, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.tviNombreCurso = (TextView) view.findViewById(R.id.tviNombreCurso);
            viewHolder.tviNumeroCreditos = (TextView) view.findViewById(R.id.tviNumeroCreditos);
            viewHolder.iviCurso = (ImageView) view.findViewById(R.id.iviCurso);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        Curso curso = mCursos.get(i);

        viewHolder.tviNombreCurso.setText(curso.getNombre());
        viewHolder.tviNumeroCreditos.setText(String.valueOf(curso.getCredito()));
        Picasso.with(mContext).load("https://pbs.twimg.com/profile_images/2078127969/logoUL180x180_400x400.jpg").into(viewHolder.iviCurso);
        return view;
    }

    class ViewHolder{
        TextView tviNombreCurso;
        TextView tviNumeroCreditos;
        ImageView iviCurso;
    }
}
