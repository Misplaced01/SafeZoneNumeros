package com.aguilarc.safezonenumeros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_numeros_emergencias.*

/**
 * A simple [Fragment] subclass.
 */
class NumerosEmergencias : Fragment() {


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_numeros_emergencias, container, false)
    }

    //Se utiliza para ver el mainAdapter en este fragmento, aquí se accesa a recycler view despues de iniciar la vista
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val numerosMenu = view?.findViewById(R.id.recyclerView_numeros) as? RecyclerView
        numerosMenu?.layoutManager = LinearLayoutManager(this.context)
        numerosMenu?.adapter = MainAdapter()
        val adapter = MainAdapter()
        recyclerView_numeros.adapter = adapter
    }

}



