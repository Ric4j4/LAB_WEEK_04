package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(private val hostFragment: Fragment) : FragmentStateAdapter(hostFragment) {

    private val tabTitles = listOf(
        R.string.starbucks_title,
        R.string.janjijiwa_title,
        R.string.kopikenangan_title
    )

    private val tabContents = listOf(
        R.string.starbucks_desc,
        R.string.janjijiwa_desc,
        R.string.kopikenangan_desc
    )

    override fun getItemCount(): Int = tabTitles.size

    override fun createFragment(position: Int): Fragment {
        return CafeDetailFragment.newInstance(
            hostFragment.requireContext().getString(tabContents[position])
        )
    }

    fun getTabTitle(position: Int): String {
        return hostFragment.requireContext().getString(tabTitles[position])
    }
}
