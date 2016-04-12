package jp.shusyush.android.favmap

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class MapsActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync({ googleMap: GoogleMap? ->
            googleMap?.apply {
                mapType = GoogleMap.MAP_TYPE_NORMAL
                isIndoorEnabled = true
                isBuildingsEnabled = true
                moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(35.604757, 139.683788), 17f))
                uiSettings.isCompassEnabled = true
            }
        })
    }
}
