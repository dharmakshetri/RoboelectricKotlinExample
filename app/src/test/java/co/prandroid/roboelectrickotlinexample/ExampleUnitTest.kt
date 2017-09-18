package co.prandroid.roboelectrickotlinexample

import android.content.Intent
import android.widget.Button
import co.prandroid.robolectricexample.MainActivity
import co.prandroid.robolectricexample.SecondActivity
import org.junit.Test

import org.assertj.core.api.Assertions.assertThat



import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.junit.Assert.assertNotNull
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants=BuildConfig::class)
class ExampleUnitTest {

    @Test
    fun clickingLoginButton_shouldStartSecondActivity(){
        var mainActivity= Robolectric.setupActivity(MainActivity::class.java)

        val button= mainActivity.findViewById<Button>(R.id.button1)
        assertNotNull(button);
        button.performClick()


        var intent= Intent(mainActivity, SecondActivity::class.java)
        assertThat(shadowOf(mainActivity).getNextStartedActivity()).isEqualTo(intent);
    }

}
