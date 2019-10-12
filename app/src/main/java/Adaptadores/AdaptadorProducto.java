package Adaptadores;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inventario.R;

import java.util.List;

import Entidades.Producto;

public class AdaptadorProducto extends RecyclerView.Adapter<AdaptadorProducto.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtProducto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProducto= itemView.findViewById(R.id.txtProducto);

        }
    }

    public List<Producto> lstProducto;

    public AdaptadorProducto(List<Producto> lstProducto){
        this.lstProducto = lstProducto;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto_plantila, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtProducto.setText(this.lstProducto.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return this.lstProducto.size();
    }

}

