package com.jedrzejewski.crawler

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

object HttpManager {

//    private const val LOCAL_IP = "192.168.44.1"
    private const val LOCAL_IP = "192.168.1.109"

    fun sendMovementRequest(queue: RequestQueue, left: Int, right: Int) {
        val url = "http://$LOCAL_IP/move?left=$left&right=$right"

        System.out.println(url)

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            {},
            {}
        )
        queue.add(stringRequest)
    }


}