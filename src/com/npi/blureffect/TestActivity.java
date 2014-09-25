package com.npi.blureffect;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class TestActivity extends Activity
{
	ImageView mImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		mImageView = (ImageView)findViewById(R.id.image1);
		Bitmap bitMap = BitmapFactory.decodeResource(getResources(),R.drawable.image);
		Bitmap blurBitMap = Blur.fastblur(this, bitMap, 12);
		mImageView.setImageBitmap(blurBitMap);
		//mImageView.setAlpha(100);
	}
}