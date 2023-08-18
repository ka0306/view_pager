package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewpageradapter extends FragmentStateAdapter {

    List<Fragment>fragmentList =new ArrayList<>();
    List<String>titlelist =new ArrayList<>();

    public viewpageradapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
    public void addfragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        titlelist.add(title);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }


    public String getPageTitle(int position){
        return titlelist.get(position);
    }


}
