package com.dewakoding.datawithar

import android.os.Bundle
import android.widget.Toast
import com.dewakoding.arlocationbased.model.Place
import com.dewakoding.arlocationbased.ui.ARActivity

class MainActivity: ARActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = ArrayList<Place>()
        list.add(
            Place(
                "1",
                "Jakarta Pusat",
                -6.175058257170998,
                106.8259863563577,
                description = "Terdiri atas 6 kecamatan",
                photoUrl = "https://i.ibb.co/1fqs8Qr/jakpus.jpg"
            )
        )
        list.add(
            Place(
                "2",
                "Jakarta Utara",
                -6.138978392393878,
                106.88185528345603,
                description = "Good Resto",
                photoUrl = "https://i.ibb.co/n6jyp96/jakut.jpg"
            )
        )


        ARInitData(list, 50000.00)
    }

    override fun onARPointSelected(place: Place) {
        super.onARPointSelected(place)
        Toast.makeText(applicationContext, place.name + " is clicked", Toast.LENGTH_SHORT).show()
    }
}