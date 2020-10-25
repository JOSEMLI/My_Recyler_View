package com.example.myrecylerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonaViewHolder> {

    List<Persona> personas;
    Context context;

    public RVAdapter(List<Persona> personas, Context context) {
        this.personas = personas;
        this.context = context;
    }

    @NonNull
    @Override
    public RVAdapter.PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.persona,parent,false);

        PersonaViewHolder personaViewHolder = new PersonaViewHolder(view);

        return personaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.PersonaViewHolder holder, int position) {

        //enlace con la vista
        holder.nombrepersona.setText(personas.get(position).nombre);
        holder.edadpersona.setText(personas.get(position).edad);

        Drawable original = context.getResources().getDrawable(personas.get(position).foto,null);

        Bitmap originalBitmap = ((BitmapDrawable)original).getBitmap();
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(context.getResources(),originalBitmap);

        roundedBitmapDrawable.setCornerRadius(originalBitmap.getHeight());
        holder.fotopersona.setImageDrawable(original);
    }

    @Override
    public int getItemCount() {

        return personas.size();
    }


    //creada para evitar errores
    public static class PersonaViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView nombrepersona,edadpersona;
        ImageView fotopersona;


        public PersonaViewHolder(@NonNull View itemView){
            super (itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv);
            nombrepersona = (TextView) itemView.findViewById(R.id.nombrepersona);
            edadpersona = (TextView) itemView.findViewById(R.id.edadpersona);
            fotopersona = (ImageView) itemView.findViewById(R.id.fotopersona);

        }
    }
}
