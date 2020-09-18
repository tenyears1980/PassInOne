package com.compose.passinone

import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.loadImageResource
import androidx.ui.tooling.preview.Preview
import com.compose.passinone.ui.PassInOneTheme

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassInOneTheme {
                localResourceImageComponent(R.drawable.landscape)
            }
        }
    }
}

@Composable
fun localResourceImageComponent(@DrawableRes imageId: Int) {
    val image = loadImageResource(id = imageId)
    image.resource.resource?.let {
        Image(
                asset = it,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillHeight
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PassInOneTheme {
        // A surface container using the 'background' color from the theme
        localResourceImageComponent(R.drawable.landscape)
    }
}
