package com.example.aa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_texting_club.*

class TextingClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texting_club)
        sendEmailBtn.setOnClickListener {
            //get input from EditTexts and save in variables
            val recipient = recipientEt.text.toString().trim()
            val subject =subjectEt.text.toString().trim()
            val message = messageEt.text.toString().trim()

            sendEmail (recipient, subject, message)
    }
}
    private fun sendEmail (recipient: String, subject: String, Message: String) {
        /*ACTION_SEND action to launch an email client installed on your Android device.*/
        val mIntent = Intent (Intent.ACTION_SEND)
        /*To send an email you need to specify mail to: as URI using setData() method
        and data type will be to text/plain using setType() method*/
        mIntent.data = Uri.parse("mail to")
        mIntent.type = "text/plain"
        //put recipient mail in Intent
        /* recipient is considered as array because we may want to send email to multiple emails
        so enter comma seperated emails, it will be stored in array.*/
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
        //put the subject in the intent
        mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        //put the message in the intent
        mIntent.putExtra(Intent.EXTRA_TEXT, Message)


        try{
            //start email intent
            startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
        }
        catch (e: Exception){
            //if anything goes wrong like for example no email client application or any exception
            //get and show exception message
            Toast.makeText(this,e.message, Toast.LENGTH_LONG).show()
        }

    }
}