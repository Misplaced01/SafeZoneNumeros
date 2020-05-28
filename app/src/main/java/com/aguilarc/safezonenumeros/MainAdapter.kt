package com.aguilarc.safezonenumeros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.numeros_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val numerosNombre = listOf("AFP Crecer", "AFP Confía", "PNC", "Bomberos", "Cruz Azul", "Cruz Roja", "Cruz Verde Salvadoreña","ANDA", "Cruz Roja", "Cruz Azul", "Bomberos", "Hospital Bloom",
        "Hospital de Diagnóstico Escalon")

    override fun getItemCount(): Int {
        return numerosNombre.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.numeros_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val numerosNombre = numerosNombre.get(position)
        holder.view.textView_numeros?.text = numerosNombre
    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view)