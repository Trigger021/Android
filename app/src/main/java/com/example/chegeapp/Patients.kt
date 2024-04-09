package com.example.chegeapp

import com.google.firebase.database.Exclude

data class Patients(
    @Exclude var patientID: String? = "",
    var patientName: String? = "",
    var patientAge: String? = "",
    var patientEmail: String? = ""
)
