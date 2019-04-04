package com.android.bargraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static final int[] JOYFUL_COLORS = {
            Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 167, 134), Color.rgb(53, 194, 209),
            Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0),
            Color.rgb(106, 150, 31), Color.rgb(179, 100, 53),
            Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187),
            Color.rgb(118, 174, 175), Color.rgb(42, 109, 130),
            Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140),
            Color.rgb(140, 234, 255), Color.rgb(255, 140, 157),
            Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162),
            Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart chart = findViewById(R.id.barchart);

        ArrayList NoOfEmp = new ArrayList();

        NoOfEmp.add(new BarEntry(945f, 0));
        NoOfEmp.add(new BarEntry(1040f, 1));
        NoOfEmp.add(new BarEntry(1133f, 2));
        NoOfEmp.add(new BarEntry(1240f, 3));
        NoOfEmp.add(new BarEntry(1369f, 4));
        NoOfEmp.add(new BarEntry(1487f, 5));
        NoOfEmp.add(new BarEntry(1501f, 6));
        NoOfEmp.add(new BarEntry(1645f, 7));
        NoOfEmp.add(new BarEntry(1578f, 8));
        NoOfEmp.add(new BarEntry(1695f, 9));
/*
        NoOfEmp.add(new BarEntry(1133f, 10));
        NoOfEmp.add(new BarEntry(1240f, 11));
        NoOfEmp.add(new BarEntry(1369f, 12));
        NoOfEmp.add(new BarEntry(1487f, 13));
        NoOfEmp.add(new BarEntry(1501f, 14));
        NoOfEmp.add(new BarEntry(1645f, 15));
        NoOfEmp.add(new BarEntry(1578f, 16));
        NoOfEmp.add(new BarEntry(1695f, 17));
        NoOfEmp.add(new BarEntry(1578f, 18));
        NoOfEmp.add(new BarEntry(1695f, 19));
        NoOfEmp.add(new BarEntry(1133f, 20));
        NoOfEmp.add(new BarEntry(1240f, 21));
        NoOfEmp.add(new BarEntry(1369f, 22));
        NoOfEmp.add(new BarEntry(1487f, 23));
        NoOfEmp.add(new BarEntry(1501f, 24));
        NoOfEmp.add(new BarEntry(1645f, 25));
        NoOfEmp.add(new BarEntry(1578f, 26));
        NoOfEmp.add(new BarEntry(1695f, 27));
*/

        ArrayList year = new ArrayList();

     /*   year.add("1990");
        year.add("1991");
        year.add("1992");
        year.add("1993");
        year.add("1994");
        year.add("1995");
        year.add("1996");
        year.add("1997");
        year.add("1998");
        year.add("1999");
        year.add("2000");
        year.add("2001");
        year.add("2002");
        year.add("2003");
        year.add("2004");
        year.add("2005");
        year.add("2006");
        year.add("2007");*/
        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");
        year.add("2012");
        year.add("2013");
        year.add("2014");
        year.add("2015");
        year.add("2016");
        year.add("2017");

        BarDataSet bardataset = new BarDataSet(NoOfEmp, "No Of Employee");
        chart.animateY(5000);
        BarData data = new BarData(year, bardataset);
        //  bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        bardataset.setColors(JOYFUL_COLORS);
        chart.setData(data);

    }
}
