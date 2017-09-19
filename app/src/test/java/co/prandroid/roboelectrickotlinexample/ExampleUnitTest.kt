package co.prandroid.roboelectrickotlinexample

import android.content.Intent
import android.widget.Button
import android.widget.TextView
import co.prandroid.robolectricexample.MainActivity
import co.prandroid.robolectricexample.SecondActivity
import org.junit.Test



import org.junit.Before

import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.Shadows
import org.robolectric.Shadows.shadowOf

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Assert.*
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadow.api.Shadow
import org.robolectric.shadows.ShadowActivity
import org.robolectric.shadows.ShadowIntent


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants=BuildConfig::class, packageName = "co.prandroid.roboelectrickotlinexample")

class ExampleUnitTest {
    var mainActivity:MainActivity= null!!;
    @Before
    fun init(){
        mainActivity = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun clickingLoginButton_shouldStartSecondActivity(){
        val button= mainActivity.findViewById<Button>(R.id.button1)

        assertNotNull(button);
        button.performClick()


        val showActivity:ShadowActivity= Shadows.shadowOf(mainActivity)
        val intent:Intent=showActivity.nextStartedActivity
        val shadowIntent:ShadowIntent=shadowOf(intent)
        assertThat(shadowIntent.intentClass.name, equalTo(MainActivity::class.java!!.getName()))
    }

    @Test
    fun checkTextViewString_presentOrNot(){
        val textView=mainActivity.findViewById<TextView>(R.id.textView)
        val stringValue=textView.text.toString()
        assertThat(stringValue,equalTo("Hello World!"))
    }

}
