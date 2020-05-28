package com.aguilarc.safezonenumeros

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter (fm : FragmentManager) :FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0-> {

                NumerosEmergencias()
            }
            else-> {
                return ConsejosSeguridad()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0-> "Números de emergencia"
            else-> {
                return "Consejos de seguridad"
            }
        }
    }
}

