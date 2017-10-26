package bank.blood.ndk.user;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Launcher extends Activity {
	View v;
	FileInputStream fos;
	ProgressBar Pb;
	int a[] = { 20, 40, 60, 80, 100 }, i;
	String FILENAME = "ini";
	int s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launcher);
		Pb = (ProgressBar) findViewById(R.id.progressBar1);
		Pb.setProgress(0);

		new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {

					for (i = 0; i < 5; i++) {

						Thread.sleep(2000);

						Pb.setProgress(a[i]);
					}
					load(v);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			
			
			}
		}).start();

	}
	private void load(View v) {

			try {
				FileInputStream fos = openFileInput(FILENAME);
				try {
					s = fos.read();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
//			if (s != 1) {
//				Intent target = new Intent(this, Intro1.class);
//				startActivity(target);
//				finish();
//			} else {
//				Intent target = new Intent(this, Login.class);
//				startActivity(target);
//				finish();
//			}

						Intent target = new Intent(this, Home.class);
				startActivity(target);
				finish();

	}
}
