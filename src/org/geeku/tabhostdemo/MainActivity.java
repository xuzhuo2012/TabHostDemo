package org.geeku.tabhostdemo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;

public class MainActivity extends TabActivity implements OnCheckedChangeListener {

	private TabHost tabhost;
	private RadioGroup mainTab;

	private Intent iHome;
	private Intent iNews;
	private Intent iInfo;
	private Intent iSearch;
	private Intent iMore;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		mainTab = (RadioGroup) this.findViewById(R.id.main_tab);
		mainTab.setOnCheckedChangeListener(this);
		tabhost = getTabHost();

		iHome = new Intent(this, HomeActivity.class);
		tabhost.addTab(tabhost.newTabSpec("iHome").setIndicator(getResources().getString(R.string.main_home), getResources().getDrawable(R.drawable.icon_1_n)).setContent(iHome));
		
		iNews = new Intent(this, NewsActivity.class);
		tabhost.addTab(tabhost.newTabSpec("iNews").setIndicator(getResources().getString(R.string.main_news), getResources().getDrawable(R.drawable.icon_2_n)).setContent(iNews));
		
		iInfo = new Intent(this, MyInfoActivity.class);
		tabhost.addTab(tabhost.newTabSpec("iInfo").setIndicator(getResources().getString(R.string.main_my_info), getResources().getDrawable(R.drawable.icon_3_n)).setContent(iInfo));
		
		iSearch = new Intent(this, SearchActivity.class);
		tabhost.addTab(tabhost.newTabSpec("iSearch").setIndicator(getResources().getString(R.string.menu_search), getResources().getDrawable(R.drawable.icon_4_n)).setContent(iSearch));
		
		iMore = new Intent(this, MoreActivity.class);
		tabhost.addTab(tabhost.newTabSpec("iMore").setIndicator(getResources().getString(R.string.menu_settings), getResources().getDrawable(R.drawable.icon_5_n)).setContent(iMore));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.radio_button0:
			this.tabhost.setCurrentTabByTag("iHome");
			break;
		case R.id.radio_button1:
			this.tabhost.setCurrentTabByTag("iNews");
			break;
		case R.id.radio_button2:
			this.tabhost.setCurrentTabByTag("iInfo");
			break;
		case R.id.radio_button3:
			this.tabhost.setCurrentTabByTag("iSearch");
			break;
		case R.id.radio_button4:
			this.tabhost.setCurrentTabByTag("iMore");
			break;

		default:
			break;
		}
	}

}
